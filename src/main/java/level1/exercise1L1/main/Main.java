package level1.exercise1L1.main;

import level1.exercise1L1.model.InPersonWorker;
import level1.exercise1L1.model.OnlineWorker;
import level1.exercise1L1.model.Worker;


public class Main {
    public static void main(String[] args) {

    Worker worker1 = new InPersonWorker("Wilson", "Pherps", 15);

    Worker worker2 = new OnlineWorker("Laura", "Garrin", 12);

    InPersonWorker iWorker1 = new InPersonWorker("Juan", "Ramos", 15.5);

    InPersonWorker iWorker2 = new InPersonWorker("Lucas", "MOldovik", 13.5);


    OnlineWorker oWorker1 = new OnlineWorker("Joseph", "Rembrant", 16);

    System.out.println("The in person worker: "+worker1.getName()+", won last month: "+worker1.calculateSalary(125)+" $");

    System.out.println("The in peron worker: "+worker2.getName()+", won last month: "+worker2.calculateSalary(100)+" $");

    System.out.println("The in person worker: "+iWorker1.getName()+", won last month: "+iWorker1.calculateSalary(159)+" $");

    System.out.println("The online worker: "+iWorker2.getName()+", won last mount: "+iWorker2.calculateSalary(105.5)+" $");

    System.out.println("The online worker: "+oWorker1.getName()+", won last mount: "+oWorker1.calculateSalary(150.3)+" $");


    }
}
