package examples.grpcClient;

public class UserInputException extends Exception{

    public UserInputException(String s){
        super(s);
    }

    public UserInputException(){
        super("User entered invalid option");
    }


}
