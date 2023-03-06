public class pericodriver {
    public static void main(String[] args) {
        Perico p1 = new Perico("Mac", 2, "verde", true, "perico australiano");
        Perico p2 = new Perico("Zandunguero", 1, "amarillo", false, "perico de cabeza negra");

        System.out.println(p1);
        System.out.println(p2);

        p1.volar();
        p1.comer();
        p2.canta();

    }

}
