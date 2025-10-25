package level1.exercise2L1.model;


public class OnSiteWorker2 extends Worker2{

    private static double gas = 20;

    public OnSiteWorker2(String name, String surname, double pricePerHour){
        super(name, surname, pricePerHour);
    }

    @Override
    public double salaryCalculate2(double monthHours) {
        return (getPricePerHour() * monthHours) + OnSiteWorker2.gas;

    }

    /**
     * @deprecated
     * this method shows a String tell us what's our business
     */
    @Deprecated
    public String showSalary(){
        return "This method is obsolete.";
    }

    /**
     * @deprecated
     * this is a Stupid method which shows
     * the name worker introducing a surname
     */
    @Deprecated
    public String showName(String surname){
        String value ="";
        if(this.getSurname().equalsIgnoreCase(surname)){
            value = this.getName();
        }
        return value;
    }
}
