package examples.grpcClient;

import service.*;
import io.grpc.stub.StreamObserver;

import java.util.Iterator;
import java.util.List;

public class CalcImpl extends CalcGrpc.CalcImplBase{

    public CalcImpl(){
        super();
    }

    public void add (CalcRequest req, StreamObserver<CalcResponse> responseObserver){

        //System.out.println("Received from client: " + req.getNumList());
        CalcResponse.Builder builder = CalcResponse.newBuilder();
        if (req.getNumCount() < 2){
            builder.setIsSuccess(false);
            builder.setError("Addition requires at least 2 operands");
        } else{
            List<Double> nums = req.getNumList();
            System.out.println("Received from client: " + nums);
            double solution = 0.0;
            for(Double d : nums){
                solution += d.doubleValue();
            }
            builder.setIsSuccess(true);
            builder.setSolution(solution);
        }

        CalcResponse resp = builder.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    public void subtract (CalcRequest req, StreamObserver<CalcResponse> responseObserver){
        CalcResponse.Builder builder = CalcResponse.newBuilder();

        if (req.getNumCount() < 2){
            builder.setIsSuccess(false);
            builder.setError("Subtraction requires at least 2 operands");
        } else{
            List<Double> nums = req.getNumList();
            System.out.println("Received from client: " + nums);
            Iterator<Double> itr = nums.iterator();

            double operandOne = itr.next().doubleValue();
            double operandTwo = 0.0;
            while(itr.hasNext()){
                operandTwo =+ itr.next().doubleValue();
            }
            double solution = operandOne-operandTwo;

            builder.setIsSuccess(true);
            builder.setSolution(solution);
        }

        CalcResponse resp = builder.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }


    public void multiply (CalcRequest req, StreamObserver<CalcResponse> responseObserver){
        CalcResponse.Builder builder = CalcResponse.newBuilder();

        if (req.getNumCount() < 2){
            builder.setIsSuccess(false);
            builder.setError("Multiplication requires at least 2 operands");
        } else {
            List<Double> nums = req.getNumList();
            System.out.println("Received from client: " + nums);
            Iterator<Double> itr = nums.iterator();
            double solution = 1.0;
            while (itr.hasNext()) {
                solution = solution * itr.next().doubleValue();
            }
            builder.setIsSuccess(true);
            builder.setSolution(solution);
        }

        CalcResponse resp = builder.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    public void divide (CalcRequest req, StreamObserver<CalcResponse> responseObserver){
        CalcResponse.Builder builder = CalcResponse.newBuilder();

        if (req.getNumCount() < 2){
            builder.setIsSuccess(false);
            builder.setError("Division requires at least two operands.\n" +
                    "The first is the dividend. The sum of all the others will be" +
                    "the divisor. Please try again");
        } else {
            List<Double> nums = req.getNumList();
            System.out.println("Received from client: " + nums);
            Iterator<Double> itr = nums.iterator();
            double dividend = itr.next();
            double divisor = 0.0;
            while (itr.hasNext()) {
                divisor += itr.next().doubleValue();
            }
            if(divisor == 0.0){
                builder.setIsSuccess(false);
                builder.setError("Cannot divide by 0.");
            } else {
                builder.setIsSuccess(true);
                builder.setSolution(dividend/divisor);
            }
        }

        CalcResponse resp = builder.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

}
