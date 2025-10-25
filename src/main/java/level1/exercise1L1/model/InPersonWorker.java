package level1.exercise1L1.model;

public class InPersonWorker extends Worker{

    private static double fuelCost = 20;

    public InPersonWorker(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(double monthHours){
        return (getPricePerHour() * monthHours) + this.fuelCost;
    }
}
