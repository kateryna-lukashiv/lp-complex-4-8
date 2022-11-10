import java.util.Scanner;

public class SolveFare implements Command {
    TaxiPark taxiPark;
    Scanner in = new Scanner(System.in);
    public SolveFare(TaxiPark taxiPark)
    {
        this.taxiPark=taxiPark;
    }

    @Override
    public void execute()
    {   
        System.out.print("Select auto!");
        System.out.print("Makr auto: ");
        String mark = in.next();
        System.out.print("Model auto: ");
        String model = in.next();
        Double km=in.nextDouble();
        Double price = 15.0;
        for (Car car: taxiPark.GetCars())
        {
            if(car.GetName()==mark && car.GetModel()==model)
            {
                if (car.GetClas()=="econom")
                {
                    price+=km*6;
                }
                else if(car.GetClas()=="business")
                {
                    price+=km*10;
                }
                else if(car.GetClas()=="standart")
                {
                    price+=km*8;
                }
            }
        }
        System.out.print("Fare "+ price);
    }
}
