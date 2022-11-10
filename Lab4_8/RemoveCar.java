public   class RemoveCar implements Command{
    TaxiPark taxiPark;
    Car car;
    public RemoveCar(TaxiPark taxiPark, Car car)
    {
        this.taxiPark= taxiPark;
        this.car=car;
    }
    @Override
    public void execute() {
        this.taxiPark.RemoveCar(car);
    }
}
