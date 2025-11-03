package level1.exercise1.management;

import level1.exercise1.model.InPersonWorker;
import level1.exercise1.model.OnlineWorker;
import level1.exercise1.model.Worker;

import java.util.ArrayList;
import java.util.List;

public class Management {

	List<Worker> workers;

	public Management(){

		this.workers = new ArrayList<>();
	}

	public void addWorkers(){
		workers.add(new OnlineWorker("Wilson", "Pherps", 15));
		workers.add(new OnlineWorker("Laura", "Garrin", 12));
		workers.add(new InPersonWorker("Juan", "Ramos", 15.5));
		workers.add(new InPersonWorker("Lucas", "Moldovik", 13.5));
		workers.add(new OnlineWorker("Joseph", "Rembrant", 16));
	}

	public void showWorkers(){
		for(Worker wk : workers){
			System.out.println("The worker: "+wk.getName()+" "+wk.getSurname()+", won last month: "+wk.calculateSalary(125)+" $");
		}
	}
}
