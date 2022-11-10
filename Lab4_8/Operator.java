public class Operator {
    Command createCar;
    Command createPark;
    Command findAutoToSpeed;
    Command solveCostCar;
    Command addAuto;
    Command listAuto;
    Command removeCar;
    Command sortByFuel;
    Car car;
    TaxiPark taxiPark;
    public Operator( Command createCar, Command createPark,Command findAutoToSpeed, Command solveCostCar,   Command addAuto,  Command listAuto, Command removeCar,Command sortByFuel)
    {
        this.createCar=createCar;
        this.createPark=createPark;
        this.findAutoToSpeed=findAutoToSpeed;
        this.solveCostCar=solveCostCar;
        this.addAuto = addAuto;
        this.listAuto=listAuto;
        this.removeCar=removeCar;
        this.sortByFuel=sortByFuel;
        this.car= new Car();
    }
    public void CreateCar()
    {
        createCar.execute();
    }
    public void CreatePark()
    {
        createPark.execute();
    }
    public void FindAutoToSpeed()
    {
        findAutoToSpeed.execute();
    }
    public void SolveCostCar()
    {
        solveCostCar.execute();
    } 
    public void AddAuto()
    {
        addAuto.execute();
    }
   public void RemoveCar()
    {
       removeCar.execute();
    }
    public void SortByFuel()
    {
        sortByFuel.execute();
    }
    public void ListAuto()
    {
        listAuto.execute();
    }

}
