import java.util.ArrayList;

public class agrTareas {
    private ArrayList<String> tareas = new ArrayList<>();

    public void addTareas(String tarea){
        tareas.add(tarea);
        System.out.println(" Tarea agregada con Exito. ");
    

    }

    public void verTareas() {
        if (tareas.isEmpty()) {
            System.out.println(" No hay tareas.");
        } else {
            System.out.println(" Lista de tareas:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.println((i + 1) + ". " + tareas.get(i));
            }
        }

    }
}