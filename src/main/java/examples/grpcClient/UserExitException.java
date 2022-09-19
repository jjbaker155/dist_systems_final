package examples.grpcClient;

public class UserExitException extends Exception{

    public UserExitException(){
        super("User wishes to exit");
    }

    public UserExitException(String s){
        super(s);
    }

}
