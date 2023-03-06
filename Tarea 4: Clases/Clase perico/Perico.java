public class Perico {
    // Atributos
    private String nombre;
    private int edad;
    private String color;
    private boolean canta;
    private String especie;

    // Constructor
    public Perico(String nombre, int edad, String color, boolean habla, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.canta = habla;
        this.especie = especie;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isCanta() {
        return canta;
    }
    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    // Método toString
    @Override
    public String toString() {
        return "Perico{" +
                "Nombre='" + nombre + '\'' +
                ", Edad=" + edad +
                ", Color='" + color + '\'' +
                ", Canta=" + canta +
                ", Especie='" + especie + '\'' +
                '}';
    }

    // Métodos de uso general
    public void volar() {
        System.out.println(nombre + " está volando");
    }
    public void comer() {
        System.out.println(nombre + " está comiendo semillas");
    }
    public void canta() {
        if (canta) {
            System.out.println(nombre + " canta");
        } else {
            System.out.println(nombre + " no canta");
        }
    }
}
