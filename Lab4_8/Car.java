import java.security.cert.PKIXBuilderParameters;
import java.util.Comparator;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Car {
    private String name;
    private String model;
    private float price;
    private int speed;
    private float fuel;
    private String clas;
    public Car()
    {
        this.name="";
        this.model="";
        this.price=0;
        this.speed=0;
        this.fuel=0;
        this.clas="";
    }
    public void createCar()
    {
        Scanner in = new Scanner(System.in);     
        System.out.println("Input car name");
        this.SetName(in.nextLine());
        System.out.println("Input car model");
        this.SetModel(in.nextLine());
        System.out.println("Input car price");
        this.SetPrice(in.nextFloat());
        System.out.println("Input car speed");
        this.SetSpeed(in.nextInt());
        System.out.println("Input car fuel");
        this.SetFuel(in.nextFloat());
        System.out.println("Input car clas");
        this.SetClas(in.nextLine());
        this.SetClas(in.nextLine());
    }
    public String GetName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name=name;
    }
    public String GetModel()
    {
        return model;
    }
    public void SetModel(String model)
    {
        this.model=model;
    }
    public float GetPrice()
    {
        return price;
    }
    public void SetPrice(Float price)
    {
        this.price=price;
    }
    public int GetSpeed()
    {
        return speed;
    }
    public void SetSpeed(int speed)
    {
        this.speed=speed;
    }
    public float GetFuel()
    {
        return fuel;
    }
    public void SetFuel(Float fuel)
    {
        this.fuel=fuel;
    }
    public String GetClas()
    {
        return this.clas;
    }
    public void SetClas(String clas)
    {
        this.clas=clas;
    }
    @Override
    public String toString()
    {
        return name+" "+model+" "+price+" "+ fuel+" "+speed+" "+clas;
    }
}
