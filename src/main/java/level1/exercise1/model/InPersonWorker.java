package level1.exercise1.model;

public class InPersonWorker extends Worker{

    private static double fuelCost = 20;

    public InPersonWorker(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
    }

    @Override
    public double calculateSalary(double monthHours){
		if(monthHours < 0){
			throw new IllegalArgumentException("The hours could not be less than zero.");
		}

		return (getPricePerHour() * monthHours) + this.fuelCost;
    }
}
