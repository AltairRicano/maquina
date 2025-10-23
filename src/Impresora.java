import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
public class Impresora {
    private String papel;
    private boolean hayTinta = true;
    private ArrayList< SimpleEntry<String, Integer> > tiposPapel = new  ArrayList<>();

    public Impresora(String papel){
        this.papel = papel;
    }

}
