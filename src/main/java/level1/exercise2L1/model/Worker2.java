package level1.exercise2L1.model;

public abstract class Worker2 {

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

    public void setPricePerHour(double pricePerHour){
        this.pricePerHour = pricePerHour;
    }



    @Override
    public String toString(){
        return "Name: "+getName()+" - Surname: "+getSurname();
    }


    public abstract double salaryCalculate2(double monthHours);
}
