
public class Main {
    public static void main(String[] args) {
        Monedero monedero = new Monedero();
        Impresora impresora = new Impresora();
        System.out.println("Cantidad en el monedero: " + monedero.cantidadIntroducida());
        impresora.meterPapel("A4", 100);
        System.out.println("La impresora tiene tinta: " + impresora.tieneTinta());
        System.out.println("La impresora tiene al menos 50 hojas: " + impresora.tieneBilletes(50));

    }
}
