public  class ListAuto implements Command {
    TaxiPark taxiPark;
    ListAuto(TaxiPark taxiPark)
    {
        this.taxiPark= taxiPark;
    }
    @Override 
    public void execute() {
        taxiPark.PrintCars();
    }
}
