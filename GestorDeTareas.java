import java.util.Scanner;

public class GestorDeTareas {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        int TotalPrioridad = 0;

        do {
        System.out.println("== GESTOR DE TAREAS ==");
        System.out.println("1. AGREGAR TAREA");
        System.out.println("2. VER TAREAS (PENDIENTE)");
        System.out.println("3. SALIR");
        System.out.print("SELECCIONA UNA DE LAS OPCIONES DEL 1 AL 3: ");
        opcion = sc.nextInt();
        sc.nextLine();

       switch (opcion) {
           case (1):
                System.out.print("¿QUE TAREA DESEAS AGREGAR?: ");
                String nombreTarea = sc.nextLine();

                System.out.print("ASIGNA LA PRIORIDAD DE LA TAREA DEL 1 AL 5: ");

                int prioridad = sc.nextInt();
                sc.nextLine();

                if (prioridad>=1 && prioridad<=5) {
                TotalPrioridad += prioridad;
                System.out.println("TAREA AGREGADA: " + nombreTarea + " con prioridad:" + prioridad + " agregada");
                System.out.println("SUMA TOTAL DE PRIORIDADES: " + TotalPrioridad);
                } else {
                System.out.println("FUNCION AUN NO IMPLENTADA");
            }
        break;

           case (2):
               System.out.println("FUNCION AUN NO IMPLEMENTADA");
               break;

           case (3):
               System.out.println("SALIENDO");
               break;

           default:
               System.out.println("OPCION NO VALIDA. INTENTA DE NUEVO");
               break;

        }
            } while (opcion != 3);

        sc.close();
    }

}