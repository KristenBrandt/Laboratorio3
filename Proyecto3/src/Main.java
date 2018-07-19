
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



        do{
            System.out.println(opciones(note.getListaArraylist().isEmpty()));
            String opcion = scan.nextLine();
            switch (opcion){
                /** agregar tarea **/
                case "1":
                    System.out.println("Ingrese el nombre de su lista de tareas");
                    lis = scan.nextLine();
                    Lista lista = new Lista(lis);
                    note.agregarlista(lista);
                    System.out.println("Ha agregado una lista exitosamente \n");
                    break;

                case "2":
                    System.out.println("Cerrando Programa");
                    on = false;
                    break;

                /** por si usuario no ingresa alguno de los numeros deseados **/
                default:
                    System.out.println("Debe de ingresar un numero valido, intente denuevo \n");
                    break;
            }


        }while (on);
        }
    }

