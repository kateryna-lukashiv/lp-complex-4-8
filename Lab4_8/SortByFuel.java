import java.util.Comparator;

public class SortByFuel implements Comparator<Car> {
    public int compare(Car a, Car b) {
        if (a.GetFuel() > b.GetFuel())
            return 1;
        return -1;
    }
}
