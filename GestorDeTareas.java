import java.util.Scanner;

public class GestorDeTareas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int TotalPrioridad = 0;

        System.out.println("== GESTOR DE TAREAS ==");
        System.out.println("1. AGREGAR TAREA");
        System.out.println("2. VER TAREAS (PENDIENTE)");
        System.out.println("3. SALIR");

        System.out.print("SELECCIONA UNA DE LAS OPCIONES DEL 1 AL 3: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if(opcion >=1 && opcion <=3) {
            if (opcion == 1) {
                System.out.print("¿QUE TAREA DESEAS AGREGAR?: ");
                String nombreTarea = sc.nextLine();

                System.out.print("ASIGNA LA PRIORIDAD DE LA TAREA DEL 1 AL 5: ");
                int prioridad = sc.nextInt();


                boolean validez = prioridad >=1 && prioridad <=5;
                System.out.println("VALIDANDO " + validez);

                TotalPrioridad += prioridad;


                System.out.println("TAREA AGREGADA: " + nombreTarea + " 2prioridad: " + prioridad);
                System.out.println("SUMA TOTAL DE PRIORIDADES: " + TotalPrioridad);
                
            } else if (opcion == 2) {
                System.out.println("FUNCION AUN NO IMPLENTADA");
            } else {
                System.out.println("SALIENDO");
            }
        } else {
            System.out.println("OPCION NO VALIDA");
        }

        sc.close();
    }
}
