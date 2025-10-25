package level1.exercise2L1.main;

import level1.exercise2L1.model.OnSiteWorker2;
import level1.exercise2L1.model.OnlineWorker2;

public class Main2 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnlineWorker2 online1 = new OnlineWorker2("Rufus", "Martin", 34);

        OnSiteWorker2 inPerson1 = new OnSiteWorker2("Mathias", "Neldpher", 13.5);


        System.out.println(online1.baseSalary(10));

        System.out.println(online1.showPriceHour(online1, "Rufus"));

        System.out.println(inPerson1.showName("Neldpher"));

        System.out.println(inPerson1.showSalary());
    }
}
