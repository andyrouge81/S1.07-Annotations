package level1.exercise2L1.model;



public class OnlineWorker2 extends Worker2{

    private final double INTERNET_TARIFF;

    public OnlineWorker2(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
        INTERNET_TARIFF = 29.99;
    }

    @Override
    public double salaryCalculate2(double monthHours){
        return (getPricePerHour() * monthHours) +INTERNET_TARIFF;
    }

    /**
     * @deprecated
     * this method not is necessary because the salary
     * calculates in salaryCalculate2 method
     */

    @Deprecated
    public double baseSalary(double hours){
        return getPricePerHour() * hours;
    }

    /**
     *
     * @deprecated
     * this method says an unnecessary data price of the worker
     */

    @Deprecated
    public double showPriceHour(Worker2 newWorker, String name){

        double gettingPrice=0;
       if(newWorker.getName().equalsIgnoreCase(name)){
            gettingPrice = newWorker.getPricePerHour();

        }return gettingPrice;
    }
}
