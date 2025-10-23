public class Monedero {
    private int cantidad;

    public boolean esPosibleSuministrar(int monto) {
        return cantidad >= monto;
    }

    public void devolverCantidad(int monto) {
        if (monto > 0) {
            cantidad += monto;
        }
    }

    public int cantidadIntroducida() {
        return cantidad;
    }

}
