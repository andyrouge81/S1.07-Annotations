package level1.exercise1L1.model;

public abstract class Worker {

    private String name;
    private String surname;
    private double pricePerHour;



    public Worker(String name, String surname, double pricePerHour){
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;

    }

    public String getName(){
		return this.name;}

    public String getSurname(){
		return this.surname;}

    public double getPricePerHour(){
		return this.pricePerHour;}



    @Override
    public String toString(){
        return "Name: "+getName()+" - Surname: "+getSurname();
    }


    public abstract double salaryCalculate(double monthHours);
}
