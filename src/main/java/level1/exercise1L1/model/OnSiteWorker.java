package level1.exercise1L1.model;

public class OnSiteWorker extends Worker{

    private static double gas = 20;

    public OnSiteWorker(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
    }

    @Override
    public double salaryCalculate(double monthHours){
        return (getPricePerHour() * monthHours) + this.gas;
    }
}
