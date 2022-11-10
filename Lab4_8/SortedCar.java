public  class SortedCar implements Command {
    TaxiPark taxiPark;
    SortedCar  (TaxiPark taxiPark)
    {
        this.taxiPark= taxiPark;
    }
    @Override 
    public void execute()  
    {
      this.taxiPark.SortCars();
    }
    
}
