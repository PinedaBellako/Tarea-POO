public class Casadriver {
    public static void main(String[] args) {
        Casa c1 = new Casa("Camino Campestre 29", 3, 100, true, "Carlos Pineda");
        Casa c2 = new Casa("Camino de la Union 49", 4, 150, false, "Alberto Ruiz");

        System.out.println(c1);
        System.out.println(c2);

        c1.pagarImpuestos(500);
        c2.alquilar("Camila Ruiz", 2000);
        c1.vender(2500000);
    }

}
