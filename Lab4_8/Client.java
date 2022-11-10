import java.util.Scanner;

public class Client {
    Command findAuto;
    Command listAuto;
    Command solveFare;
    Scanner in = new Scanner(System.in);
    public Client(Command findAuto, Command listAuto, Command solveFare)
    {
        this.findAuto=findAuto;
        this.listAuto=listAuto;
        this.solveFare=solveFare;
    }
    public void FindAuto()
    {
        findAuto.execute();
    }
    public void ListAuto()
    {
        listAuto.execute();
    }
    public void SolveFare()
    {
        listAuto.execute();
        solveFare.execute();
    }

}
