package level1.exercise2.model;



public class OnlineWorker2 extends Worker2{

    private final double INTERNET_TARIFF;

    public OnlineWorker2(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
        INTERNET_TARIFF = 49.99;
    }

    @Override
    public double salaryCalculate2(double monthHours){
		if(monthHours<0){
			throw new IllegalArgumentException("Error. At least one hour to work.");
		}

		return (getPricePerHour() * monthHours) +INTERNET_TARIFF;
    }



    @Deprecated
    public double baseSalary(double hours){



		return getPricePerHour() * hours;
    }



    @Deprecated
    public double showPriceHour(Worker2 newWorker, String name){

        double gettingPrice=0;
       if(newWorker.getName().equalsIgnoreCase(name)){
            gettingPrice = newWorker.getPricePerHour();

        }return gettingPrice;
    }
}
