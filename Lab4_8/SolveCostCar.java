public  class SolveCostCar implements Command{
    TaxiPark taxiPark;
    public SolveCostCar(TaxiPark taxiPark)
    {
        this.taxiPark=taxiPark;
    }
    @Override 
    public void execute()  {
        System.out.print("All cost taxi park"+ taxiPark.SolvePrice());
    }
}