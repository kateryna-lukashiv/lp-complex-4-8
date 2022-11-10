import java.util.Scanner;
public class MenuToOperator {

    Integer menuItem;
    Operator operator;
    TaxiPark taxiPark;
    Car car;
    public MenuToOperator(TaxiPark taxiPark)
    {
        this.taxiPark = taxiPark;
        this.operator = new Operator(
            new CreateCar(this.operator),
            new CreatePark(this.operator),
            new FindAutoToSpeed(this.taxiPark) ,
            new SolveCostCar(this.taxiPark),
            new AddAuto(this.taxiPark, this.car),
            new ListAuto(this.taxiPark),
            new RemoveCar(this.taxiPark, this.car),
            new SortedCar(this.taxiPark)
        );
    }
    public void PrintMenu()
    {
        System.out.print("1-create auto\n");
        System.out.print("2-create park\n");
        System.out.print("3-add auto\n");
        System.out.print("4-delete auto\n");
        System.out.print("5-price taxi park\n");
        System.out.print("6-list auto\n");
        System.out.print("7-sort auto to fuel\n");
        System.out.print("8-find auto to speed\n");
        System.out.print("9-Exit\n");
        System.out.print("You choise: ");
        Scanner in = new Scanner(System.in);
        menuItem = in.nextInt();
    }
    public void Complete()
    {

        switch (this.menuItem){
            case 1:
            operator.CreateCar();
            break;
            case 2:
            operator.CreatePark();
            break;
            case 3:
            operator.AddAuto();
            break;
            case 4:
            operator.RemoveCar();
            break;
            case 5:
            operator.SolveCostCar();
            break;
            case 6:
            operator.ListAuto();
            break;
            case 7:
            operator.SortByFuel();
            break;
            case 8:
            operator.FindAutoToSpeed();
            break;
            case 9:
            System.out.print("Exit");
            break;

        }

    }
}
