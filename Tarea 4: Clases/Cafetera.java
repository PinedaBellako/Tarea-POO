public class Cafetera {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

     // Constructor por defecto


    public Cafetera() {
    }

    // Constructor
    public Cafetera(int agua, int cafe, int crema, int vasos) {
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
        this.vasos = vasos;
    }
    // Métodos de acceso
    public int getAgua() { return agua; }

    public void setAgua(int agua) {
        if(agua >= 0 && agua <= 5000){
            this.agua = agua;
        }else {
            System.out.println("Capacidad de agua no valida");
        }
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        if(cafe >= 0 && cafe <=1000){
        this.cafe = cafe;
        } else {
            System.out.println("Capacidad de cafe no valido");
        }
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        if(crema >= 0 && crema <=1500){
            this.crema = crema;
        } else {
            System.out.println("Capacidad de crema no valido");
        }
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        if(vasos >= 0 && vasos <=50){
            this.vasos = vasos;
        } else {
            System.out.println("Capacidad de vasos no valido");
        }
    }

    //Método toString

    @Override
    public String toString() {
        return "Cafetera{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    // Método para servir un café americano
    public boolean servirAmericano() {
        if (agua >= 180 && cafe >= 15 && vasos > 0) {
            agua -= 180;
            cafe -= 15;
            vasos --;
            System.out.println("Aquí está su café americano, recursos suficientes para servir mas cafe americano");
            if (agua < 180 || cafe < 15 || vasos == 0) {
                System.out.println("Advertencia: los recursos para servir más café americano son limitados.");
                System.out.println("Agua: " + agua + " ml");
                System.out.println("Café: " + cafe + " g");
                System.out.println("Crema: " + crema + " ml");
                System.out.println("Vasos: " + vasos);
            }
            return true;
        } else {
            System.out.println("Lo siento, no hay suficientes recursos para servir más café americano");
            return false;
        }
    }

    // Método para servir un café expreso
    public boolean servirExpreso() {
        if (agua >= 120 && cafe >= 20 && vasos > 0) {
            agua -= 120;
            cafe -= 20;
            vasos --;
            System.out.println("Aquí está su café expreso, recursos suficientes para servir mas cafe expreso");
            if (agua < 120 || cafe < 20 || vasos == 0) {
                System.out.println("Advertencia: los recursos para servir más café expreso son limitados.");
                System.out.println("Agua: " + agua + " ml");
                System.out.println("Café: " + cafe + " g");
                System.out.println("Crema: " + crema + " ml");
                System.out.println("Vasos: " + vasos);
            }
            return true;
        } else {
            System.out.println("Lo siento, no hay suficientes recursos para servir más café expreso");
            return false;
        }
    }

    // Método para servir un capuchino
    public boolean servirCapuchino() {
        if (agua >= 100 && cafe >= 14 && crema >= 70 && vasos > 0) {
            agua -= 100;
            cafe -= 14;
            crema -= 70;
            vasos --;
            System.out.println("Aquí está su cafe capuchino, recursos suficientes para servir mas cafe capuchino");
            if (agua < 100 || cafe < 14 || crema < 70 || vasos == 0) {
                System.out.println("Advertencia: los recursos para servir más cafe capuchino son limitados.");
                System.out.println("Agua: " + agua + " ml");
                System.out.println("Café: " + cafe + " g");
                System.out.println("Crema: " + crema + " ml");
                System.out.println("Vasos: " + vasos);
            }
            return true;
        } else {
            System.out.println("Lo siento, no hay suficientes recursos para servir más cafe capuchino");
            return false;
        }
    }
    public void mostrarCantidades() {
        System.out.println("Agua: " + agua + " ml");
        System.out.println("Café: " + cafe + " g");
        System.out.println("Crema: " + crema + " ml");
        System.out.println("Vasos: " + vasos);
    }

}