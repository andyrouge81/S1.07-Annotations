package level1.exercise1L1.model;

public class OnlineWorker extends Worker{

    private final double INTERNET_TARIFF;

    public OnlineWorker(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
       this.INTERNET_TARIFF = 29.99;
    }

    @Override
    public double salaryCalculate(double monthHours){
        return (getPricePerHour() * monthHours) +this.INTERNET_TARIFF;
    }
}
