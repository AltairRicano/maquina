import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
public class Impresora {
    private boolean hayTinta = true;
    private ArrayList< SimpleEntry<String, Integer> > tiposPapel = new  ArrayList<>();

    public Impresora() {
    }

    public void meterPapel(String tipo, int cantidad) {
        for (SimpleEntry<String, Integer> entry : tiposPapel) {
            if (entry.getKey().equals(tipo)) {
                entry.setValue(entry.getValue() + cantidad);
                return;
            }
        }
        tiposPapel.add(new SimpleEntry<>(tipo, cantidad));
    }

    public void meterTinta() {
        hayTinta = true;
    }

    public boolean tieneTinta() {
        return hayTinta;
    }

    public boolean tieneBilletes(int cantidadNecesaria) {
        for (SimpleEntry<String, Integer> entry : tiposPapel) {
            if (entry.getValue() >= cantidadNecesaria) {
                return true;
            }
        }
        return false;
    }
}
