import java.util.Scanner;

public class MenuToClient {
    Integer menuItem;
    Client client;
    TaxiPark taxiPark;

    public MenuToClient(TaxiPark taxiPark)
    {
        this.taxiPark= taxiPark;
        this.client = new Client(
            new FindAuto(this.taxiPark),
            new ListAuto(this.taxiPark), 
            new SolveFare(this.taxiPark)
            );
    } 

    public void PrintMenu()
    {
        System.out.print("1-find auto\n");
        System.out.print("2-list park\n");
        System.out.print("3-order a car\n");
        System.out.print("4-Exit\n");
        System.out.print("You choise: ");
        Scanner in = new Scanner(System.in);
        menuItem = in.nextInt();
    }
    public void Complete()
    {

        switch (this.menuItem){
            case 1:
            client.FindAuto();
            break;
            case 2:
            client.ListAuto();
            break;
            case 3:
            client.SolveFare();
            case 4:
            System.out.print("Exit");
            break;
        }
    }
}
