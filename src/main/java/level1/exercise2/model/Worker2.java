package level1.exercise2.model;

public class Worker2 {

    private String name;
    private String surname;
    private double pricePerHour;



    public Worker2(String name, String surname, double pricePerHour){
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;

    }

    public String getName(){return this.name;}
    public String getSurname(){return this.surname;}
    public double getPricePerHour(){return this.pricePerHour;}




    @Override
    public String toString(){
        return "Name: "+getName()+" - Surname: "+getSurname();
    }


    public double salaryCalculate2(double monthHours){
		return pricePerHour * monthHours;
	}
}
