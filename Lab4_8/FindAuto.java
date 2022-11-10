import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public  class FindAuto implements Command {

    TaxiPark taxiPark;
    
    public FindAuto(TaxiPark taxiPark)
    {
        this.taxiPark=taxiPark;
    }
    @Override 
    public void execute()
    {
        System.out.print("1- find auto to price ");
        System.out.print("2- find auto to model ");
        System.out.print("3- find auto to class "); 
        Scanner in = new Scanner(System.in);  
        String choise = in.nextLine();
        Boolean flag=false;
        if (choise == "1")
        {
            flag=false;
            Integer price_min=in.nextInt();
            Integer price_max=in.nextInt();
            for (Car car: taxiPark.GetCars())
            {
                if ( car.GetPrice() >= price_min && car.GetPrice()<=price_max)
                {
                    System.out.print(car);
                    flag=true;
                }
            }
            
        }
        else if(choise=="2")
        {
            flag=false;
            String model = in.nextLine();
            for (Car car: taxiPark.GetCars())
            {
                if ( car.GetModel()==model)
                {
                    System.out.print(car);
                    flag=true;
                }
            }
        }
        else if(choise=="3")
        {
            System.out.print("1 - ecomon class");
            System.out.print("2 - standart class");
            System.out.print("3 - busines class");  
            String clas = in.nextLine();            
            System.out.print("List auto with clas "+clas);
            flag=false;
            ArrayList<Car> res =  taxiPark.FindCarToClas(clas);
            for(Car c: res)
            {
                System.out.print(c);
                flag=true;
            }
        }
        if (!flag)
        {
            System.out.print("Car not found");
        }
      
    }
}
