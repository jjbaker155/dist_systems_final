package examples.grpcClient;

public class ServiceNotAvailableException extends Exception{

    public ServiceNotAvailableException(){
        super("Service(s) not availble");
    }

    public ServiceNotAvailableException(String s){
        super(s);
    }

}
