import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;
public  class TaxiPark {
    private String name;
    private ArrayList<Car> cars;
    public TaxiPark(String name)
    {
        this.name=name;
        cars = new ArrayList<Car>(0);
    }
    public String GetName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public  ArrayList<Car> GetCars()
    {
        return cars;
    }
    public void SetCars(ArrayList<Car> cars)
    {
        this.cars=cars;
    }
    public void AddCar(Car car)
    {
        cars.add(car);
    }
    public void RemoveCar(Car car)
    {
        cars.remove(car);
    }
    public void PrintCars()
    {
        for(Car car: cars)
        {
            System.out.println(car);

        }
    }
    public  void SortCars()
    {
        Collections.sort(cars, new SortByFuel());
    }

    public ArrayList<Car> FindCarToSpeed(int speed_min, int speed_max){
        ArrayList<Car> res=new ArrayList<Car>();
        Boolean flag = false;
        for(Car car:cars)
        {
            if (car.GetSpeed()>=speed_min && car.GetSpeed()<=speed_max)
            {
                res.add(car);
                flag = true;
            }
        }
        String resStr = String.format("Car with speed between %d %d nor found", speed_min, speed_max);
        if (!flag ) System.out.print(resStr);
        return res;
    }
    public float SolvePrice(){
        float price=0;
        for(Car car:cars)
        {
            price+=car.GetPrice();
        }
        return price;
    }
    public ArrayList<Car> FindCarToClas(String clas)
    {
        ArrayList<Car> res=new ArrayList<Car>();
        for(Car car:cars){
            if(car.GetClas()==clas)
            {
                res.add(car);
            }
        }
        return res;
    }

    public void PrintToFile()
    {
        try {
            PrintStream old = System.out;
            PrintStream fs = new PrintStream(new FileOutputStream("TaxiPark.txt", false));
            System.setOut(fs);
            this.PrintCars();
            fs.close();
            System.setOut(old);
            } catch (FileNotFoundException ex) {
            }
    }
    public void ReadFromFile()
    {
        try (BufferedReader br = new BufferedReader(new FileReader("TaxiPark.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split(" ");
                Car car = new Car();
                car.SetName(words[0]);
                car.SetModel(words[1]);
                car.SetPrice(Float.parseFloat(words[2]));
                car.SetFuel(Float.parseFloat(words[3]));
                car.SetSpeed(Integer.parseInt(words[4]));
                car.SetClas(words[5]);
                this.AddCar(car);            
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        } 
    }
}
