import java.util.ArrayList;
import java.util.Scanner;

public  class FindAutoToSpeed implements Command {

    TaxiPark taxiPark;
    
    public FindAutoToSpeed(TaxiPark taxiPark)
    {
        this.taxiPark=taxiPark;
    }
    @Override 
    public void execute()    {
        Scanner in = new Scanner(System.in);  
        Integer min =in.nextInt();
        Integer max =in.nextInt();
        System.out.print("List auto with speed"+ min.toString()+": "+max.toString());
        ArrayList<Car> res =  taxiPark.FindCarToSpeed(min, max);
        for(Car c: res)
        {
           System.out.print(c);
        }
    }
}
