package level1.exercise2.model;


public class InPersonWorker2 extends Worker2{

    private static double gas = 20;

    public InPersonWorker2(String name, String surname, double pricePerHour){

		super(name, surname, pricePerHour);
    }

    @Override
    public double salaryCalculate2(double monthHours) {
		if(monthHours<0){
			throw new IllegalArgumentException("Warning! The hours could not be less than zero.");
		}
        return (getPricePerHour() * monthHours) + InPersonWorker2.gas;

    }


    @Deprecated
    public String showSalary(){

		return "This method is obsolete.";
    }


    @Deprecated
    public String showName(String surname){
        String value ="";
        if(this.getSurname().equalsIgnoreCase(surname)){
            value = this.getName();
        }
        return value;
    }
}
