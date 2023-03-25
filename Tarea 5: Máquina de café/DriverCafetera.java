public class DriverCafetera {
    public static void main(String[] args) {
        // Crear objeto de tipo Cafetera
        Cafetera maquina = new Cafetera();
        maquina.setAgua(5000);
        maquina.setCafe(1000);
        maquina.setCrema(1500);
        maquina.setVasos(50);

        // Imprimir estado inicial de la cafetera
        System.out.println("Estado inicial de la cafetera:");
        maquina.mostrarCantidades();

        // Servir algunos cafés
        maquina.servirAmericano();
        maquina.servirExpreso();
        maquina.servirCapuchino();

        // Imprimir estado actual de la cafetera
        System.out.println("Estado actual de la cafetera:");
        maquina.mostrarCantidades();

        // Servir más cafés hasta agotar los recursos
        while (maquina.servirAmericano() && maquina.servirExpreso() && maquina.servirCapuchino());

        // Imprimir estado final de la cafetera
        System.out.println("Estado final de la cafetera:");
        System.out.println(maquina);

    }

}
