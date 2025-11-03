package level1.exercise1.model;

public class OnlineWorker extends Worker{

    private final double INTERNET_FEE;

    public OnlineWorker(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
       this.INTERNET_FEE = 29.99;
    }

    @Override
    public double calculateSalary(double monthHours){
		if(monthHours<0){
			throw new IllegalArgumentException("Error adding month hours.");
		}


		return (getPricePerHour() * monthHours) +this.INTERNET_FEE;
    }
}
