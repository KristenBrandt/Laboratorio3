import java.util.ArrayList;

public class Notepad {


    private ArrayList<Lista> listaArraylist = new ArrayList<>();

    public void agregarlista(Lista lista){
        listaArraylist.add(lista);
    }

    public ArrayList<Lista> getListaArraylist() {
        return listaArraylist;
    }
}


