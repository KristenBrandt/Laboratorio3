
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

        /**
         * menu principal
         **/
        public static String opciones(Boolean pony) {
            String a = " 1:Crear Lista de Tareas \n 2:Salir";
            String b = "1:Crear Lista de Tareas \n 2: Ver listas \n 3:Seleccionar una lista de tareas \n 4: Salir";
            if (pony){
                return a;
            }else{
            return b;
        }}

        public static void main(String[] args) {
            /** variables **/
            boolean on = true;
            Notepad note = new Notepad();
            String lis;
            String tar;


            /** primer menu - cuando no hay listas creadas **/
            do {
                System.out.println(opciones(note.getListaArraylist().isEmpty()));
                if (note.getListaArraylist().isEmpty()) {
                    String opcion = scan.nextLine();
                    switch (opcion) {
                        /** agregar tarea **/
                        case "1":
                            System.out.println("Ingrese el nombre de su lista de tareas");
                            lis = scan.nextLine();
                            Lista lista = new Lista(lis);
                            note.agregarlista(lista);
                            System.out.println("Ha agregado una lista exitosamente \n");
                            for (Lista n : note.getListaArraylist()) {
                                if (n.getNombre().equals(lis)) {
                                    System.out.println("Ingrese una tarea para esa lista");
                                    tar = scan.nextLine();
                                    Tarea tarea = new Tarea(tar);
                                    n.agregartarea(tarea);
                                    System.out.println("Ha agregado una tarea exitosamente\n");
                                    break;
                                }
                            break;}
                            break;

/** cerrar programa **/
                        case "2":
                            System.out.println("Cerrando Programa");
                            on = false;
                            break;

                        /** por si usuario no ingresa alguno de los numeros deseados **/
                        default:
                            System.out.println("Debe de ingresar un numero valido, intente denuevo \n");
                            break;
                    }
                }
                do{
                        String opcion = scan.nextLine();
                        switch (opcion) {
                            case "1":
                                System.out.println("Ingrese el nombre de su lista de tareas");
                                lis = scan.nextLine();
                                Lista lista = new Lista(lis);
                                note.agregarlista(lista);
                                System.out.println("Ha agregado una lista exitosamente \n");
                                break;

                        }

                    }
                    while (on) ;

            }while (on);
        }
    }


