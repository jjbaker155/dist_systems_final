package examples.grpcClient;

import io.grpc.stub.StreamObserver;
import service.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class SettingsImpl extends SettingsGrpc.SettingsImplBase{

    public SettingsImpl(){
        super();
    }

    private ArrayList<String> getProcesses() throws IOException {
        ArrayList<String> processList = new <String>ArrayList();
        try{
            String process;
            Process p = Runtime.getRuntime().exec("jps -l");
            InputStreamReader processStream = new InputStreamReader(p.getInputStream());
            BufferedReader processInput = new BufferedReader(processStream);
            process = processInput.readLine();
            while(process != null){
                processList.add(process);
                process = processInput.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage() + "\n");
            e.printStackTrace();
            throw new IOException("\nCannot read process stream");
        }
        return processList;
    }

    public void getProcessList(ProcessListReq req, StreamObserver<ProcessListRes> respObserver) {
        System.out.println("Received process list request from client");
        ProcessListRes.Builder responseBuilder = ProcessListRes.newBuilder();
        try{
            ArrayList<String> processList = getProcesses();
            if(processList.isEmpty()){
                responseBuilder.addAllProcessList(null);
                responseBuilder.setIsSuccessful(false);
            } else{
                responseBuilder.addAllProcessList(processList);
                responseBuilder.setIsSuccessful(true);
            }
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
            responseBuilder.setIsSuccessful(false);
        }
        ProcessListRes resp = responseBuilder.build();
        respObserver.onNext(resp);
        respObserver.onCompleted();
    }

    private ArrayList<String> getNetworkingInfo() throws SocketException {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        ArrayList<String> result = new ArrayList<String>();
        while(nets.hasMoreElements()){
            StringBuilder entryBuilder = new StringBuilder();
            NetworkInterface networkInterface = nets.nextElement();
            //result.add(nets.nextElement().getDisplayName());
            entryBuilder.append(networkInterface.getDisplayName() + ":");
            Enumeration<InetAddress> inets = networkInterface.getInetAddresses();
            for (InetAddress inetAddress : Collections.list(inets)){
                entryBuilder.append("\n    Inet Address: " + inetAddress + "   Host Name: " +
                        inetAddress.getHostName() + "    Host Address: " + inetAddress.getHostAddress());
                //result.add("    " + inetAddress.getHostName() + " " + inetAddress.getHostAddress());
            }

            result.add(entryBuilder.toString());
        }
        return result;
    }

    public void getNetworkInfo(NetworkInfoReq req, StreamObserver<NetworkInfoRes> respObserver) {
        ArrayList<String> result = null;
        NetworkInfoRes.Builder resBuilder = NetworkInfoRes.newBuilder();
        try{
            result = getNetworkingInfo();
            if(result.isEmpty()){
                resBuilder.addAllNetworkInfo(null);
                resBuilder.setIsSuccessful(false);
            } else{
                resBuilder.addAllNetworkInfo(result);
                resBuilder.setIsSuccessful(true);
            }
        } catch(SocketException e){
            resBuilder.addAllNetworkInfo(null);
            resBuilder.setIsSuccessful(false);
        } finally{

        }
        NetworkInfoRes resp = resBuilder.build();
        respObserver.onNext(resp);
        respObserver.onCompleted();
    }
}
