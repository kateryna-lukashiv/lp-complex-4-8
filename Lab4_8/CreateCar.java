import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.ClosedWatchServiceException;
import java.util.Scanner;

public class CreateCar implements Command {
    Operator operator;
    public CreateCar(Operator operator){
        this.operator=operator;
    }
    @Override 
    public void execute()  
    {
      Scanner in = new Scanner(System.in);
      this.operator.car.createCar();
    }
}
