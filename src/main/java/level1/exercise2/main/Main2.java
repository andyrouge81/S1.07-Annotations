package level1.exercise2.main;

import level1.exercise2.model.InPersonWorker2;
import level1.exercise2.model.OnlineWorker2;

public class Main2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

		OnlineWorker2 online1 = new OnlineWorker2("Rufus", "Martin", 34);
		InPersonWorker2 inPerson1 = new InPersonWorker2("Mathias", "Neldpher", 13.5);



		System.out.println("The worker "+online1.getName()+" " +online1.getSurname()+" won: "+online1.salaryCalculate2(80));

		System.out.println("The worker "+inPerson1.getName()+" " +inPerson1.getSurname()+" won: "+inPerson1.salaryCalculate2(75.5));

        double workerSalary = online1.baseSalary(10);
		System.out.println("The worker salary base is: "+workerSalary+" $ ");

        double priceHourWorker= online1.showPriceHour(online1, "Rufus");
		System.out.println("The worker "+online1.getName()+" has "+priceHourWorker+" $ hour");

        String nameWorker = inPerson1.showName("Neldpher");
		System.out.println("The name of the Worker with surname 'Neldpher' is: "+nameWorker);

        System.out.println(inPerson1.showSalary());
    }
}
