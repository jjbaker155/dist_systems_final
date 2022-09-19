package examples.grpcClient;

import io.grpc.stub.StreamObserver;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import service.*;

import java.io.*;
import java.util.Iterator;

public class StoryImpl extends StoryGrpc.StoryImplBase {

    private final String DEFAULT_STORY_PATH = "src/resources/story.json";

    //private ArrayList<String> story;
    private JSONArray sentences;
    private JSONObject storyObj = null;

    private File storyFile = null;
    private FileInputStream is = null;
    private FileWriter fw = null;

    public StoryImpl(){
        super();
        sentences = new JSONArray();
        init();
    }

    public synchronized void init(){
        storyFile = new File(DEFAULT_STORY_PATH);
        try{
            is = new FileInputStream(storyFile);
            System.out.println(storyFile.length());
            if(storyFile.length() > 0){
                readFile(is);
            } else{
                System.out.println("File is empty. Init complete.");
            }
            is.close();
        }catch(FileNotFoundException fe){
            System.out.println("Story file not found. Creating new one.");
            createNewFile();
            updateFile();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }

    private synchronized void readFile(InputStream isReadFile){
        if(storyFile.length() == 0){
            System.out.println("Story file is empty");
        } else{
            try{
                storyObj = new JSONObject(new JSONTokener(isReadFile));
                sentences = storyObj.getJSONArray("story");
                System.out.println("File read:\n" + sentences);
            } catch(JSONException e){
                System.out.println("Story file is corrupt. Rebuilding file.");
                //rebuild file
                createNewFile();
                updateFile();
            }
        }
    }

    private synchronized void readFile(){
        if(storyFile.length() == 0){
            System.out.println("Story file is empty");
        } else{
            try{
                is = new FileInputStream(storyFile);
                storyObj = new JSONObject(new JSONTokener(is));
                sentences = storyObj.getJSONArray("story");
                System.out.println("File read:\n" + sentences);
                is.close();
            } catch(JSONException e){
                System.out.println("Story file is corrupt. Rebuilding file.");
                //rebuild file
                createNewFile();
                updateFile();
            } catch (FileNotFoundException fe){
                System.out.println("File missing. Rebuilding file.");
                createNewFile();
                updateFile();
            } catch (IOException ioe){
                System.out.println("Error reading file");
            }
        }
    }

    private synchronized void updateFile(){
        System.out.println("Updating file");
        try {
            if(sentences != null && !sentences.isEmpty()){
                storyObj = new JSONObject();
                storyObj.put("story", sentences);
                fw = new FileWriter(storyFile);
                fw.write(storyObj.toString());
                fw.close();
            } else{
                System.out.println("Story is empty. File not updated.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public synchronized void rebuildFile(){
        if(is != null){
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        createNewFile();
        updateFile();
    }
    */

    public synchronized void createNewFile(){
        if(storyFile.exists()){
            storyFile.delete();
        }
        try {
            storyFile = new File(DEFAULT_STORY_PATH);
            storyFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(storyFile.length());
        if(sentences != null && !sentences.isEmpty()){
            updateFile();
        }
    }

    public synchronized void read(Empty nothing, StreamObserver<ReadResponse> responseObserver){
        ReadResponse.Builder builder = ReadResponse.newBuilder();

        String story = getStory();
        if(story.length() == 0){
            builder.setIsSuccess(false);
            builder.setError("Story is empty");
        } else{
            builder.setSentence(story);
            builder.setIsSuccess(true);
        }

        ReadResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    public synchronized void write(WriteRequest req, StreamObserver<WriteResponse> responseObserver){
        WriteResponse.Builder builder = WriteResponse.newBuilder();

        String newSentence;
        if(req.getNewSentence().isEmpty()){
            System.out.println("User has provided an empty string.");
            builder.setIsSuccess(false);
            builder.setError("Empty sentence. Please enter text to add to the story");
        } else {
            readFile();
            newSentence = req.getNewSentence();
            sentences.put(newSentence);
            updateFile();
            builder.setIsSuccess(true);
        }
        builder.setStory(getStory());
        WriteResponse response = builder.build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private String getStory(){
        readFile();
        if(sentences != null && !sentences.isEmpty()){
            StringBuilder builder = new StringBuilder();
            Iterator itr = sentences.iterator();
            while(itr.hasNext()){
                builder.append(itr.next().toString().trim() + "\n");
            }
            return builder.toString();
        } else{
            return "";
        }
    }

    /*
    public static void main(String args[]){
        StoryImpl testStory = new StoryImpl();
    }
    */

}
