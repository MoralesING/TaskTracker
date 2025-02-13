import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) throws Exception {
        Scanner scannerI = new Scanner(System.in);
        Scanner scannerI2 = new Scanner(System.in);
        Scanner scannerS = new Scanner(System.in);
        agrTareas t1 = new agrTareas();
        int opcion1;
        int i = 1;

        
            
                     

        while (i == 1) {
            System.out.println("//    Bienvenido a tu Task Tracker    //");
            System.out.println(" Agregar tareas ");
            System.out.println(" Ver tareas ");
            System.out.print("> ");
            
            opcion1 = scannerI.nextInt();   

            switch (opcion1) {
                case 1:
                    System.out.println(" Agregar tarea");
                    String tarea = scannerS.nextLine();
                    t1.addTareas(tarea);

                    break;

                case 2:
                t1.verTareas();
                break;
            
                default:
                    break;
            }
            System.out.println(" 1: Añadir otra tarea");
            System.out.println(" 2: salir");
            System.out.print(" > ");
            i = scannerI2.nextInt(); 

        }
        
    }

    
}
