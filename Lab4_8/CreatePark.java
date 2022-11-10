import java.util.Scanner;

public  class CreatePark implements Command {
    Operator operator;
    public CreatePark(Operator operator)
    {
        this.operator=operator;
    }
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in); 
        this.operator.taxiPark = new TaxiPark(in.nextLine());
    }
}
