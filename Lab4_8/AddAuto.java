public  class AddAuto implements Command {
    TaxiPark taxiPark;
    Car car;
    public AddAuto(TaxiPark taxiPark, Car car)
    {
        this.taxiPark= taxiPark;
        this.car=car;
    }
    @Override
    public void execute() {
        this.taxiPark.AddCar(car);
    }
 
}
