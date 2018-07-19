import java.util.ArrayList;

public class Lista {

        public Lista(String nombre) {
            this.nombre = nombre;
        }

        private String nombre;
        private ArrayList<Tarea> tareaArrayList = new ArrayList<>();

        public void agregartarea(Tarea tarea){
            tareaArrayList.add(tarea);

        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public ArrayList<Tarea> getTareaArrayList() {
            return tareaArrayList;
        }
    }

