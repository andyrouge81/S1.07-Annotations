package level1.exercise1L1.main;

import level1.exercise1L1.model.OnSiteWorker;
import level1.exercise1L1.model.OnlineWorker;
import level1.exercise1L1.model.Worker;

/**
 * Crea una jerarquía de objetos con tres clases: Trabajador,
 * TreballadorOnline y TreballadorPresencial.
 *
 * La clase Trabajador tiene los atributos nombre, apellido,
 * precio/hora, y el metodo calcularSou() que recibe por parámetro
 * el número de horas trabajadas y lo multiplica por el precio/hora.
 * Las clases hijas lo tienen que sobrescribir, empleando @override.
 *
 * Desde el main() de la clase Principal, hiciera las invocaciones
 * necesarias para demostrar el funcionamiento de la anotación @override.
 *
 * En los trabajadores presenciales, el metodo para calcular su sueldo,
 * recibirá por parámetro el número de horas trabajadas en el mes.
 * En la hora de calcular el sueldo se multiplicará el número de horas
 * trabajadas por el precio/hora, más el valor de un atributo static
 * denominado gasolina que añadiremos en esta clase.
 *
 * En los trabajadores en línea, el metodo para calcular su sueldo
 * recibirá por parámetro el número de horas trabajadas en el mes.
 * En la hora de calcular el sueldo se multiplicará el número de horas
 * trabajadas por el precio/hora y se le sumará el precio de la tarifa
 * plana de Internet, que será una constante de la clase TreballadorOnline.
 */
public class Main {
    public static void main(String[] args) {

    Worker worker1 = new OnSiteWorker("Wilson", "Pherps", 15);

    Worker worker2 = new OnlineWorker("Laura", "Garrin", 12);

    OnSiteWorker iWorker1 = new OnSiteWorker("Juan", "Ramos", 15.5);

    OnSiteWorker iWorker2 = new OnSiteWorker("Lucas", "MOldovik", 13.5);


    OnlineWorker oWorker1 = new OnlineWorker("Joseph", "Rembrant", 16);

    System.out.println("The worker: "+worker1.getName()+", won last month: "+worker1.salaryCalculate(125)+" $");

    System.out.println("The worker: "+worker2.getName()+", won last month: "+worker2.salaryCalculate(100)+" $");

    System.out.println("The worker: "+iWorker1.getName()+", won last month: "+iWorker1.salaryCalculate(159)+" $");

    System.out.println("The online worker: "+iWorker2.getName()+", won last mount: "+iWorker2.salaryCalculate(105.5)+" $");

    System.out.println("The online worker: "+oWorker1.getName()+", won last mount: "+oWorker1.salaryCalculate(150.3)+" $");


    }
}
