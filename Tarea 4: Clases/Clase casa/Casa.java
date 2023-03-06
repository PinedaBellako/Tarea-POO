public class Casa {
    // Atributos
    private String direccion;
    private int Habitaciones;
    private double superficie;
    private boolean TieneCochera;
    private String Propietario;

    // Constructor
    public Casa(String direccion, int Habitaciones, double superficie, boolean TieneCochera, String propietario) {
        this.direccion = direccion;
        this.Habitaciones = Habitaciones;
        this.superficie = superficie;
        this.TieneCochera = TieneCochera;
        this.Propietario = propietario;
    }

    // Métodos de acceso
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getHabitaciones() {
        return Habitaciones;
    }
    public void setHabitaciones(int habitaciones) {
        this.Habitaciones = habitaciones;
    }
    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
    public boolean isTieneCochera() {
        return TieneCochera;
    }
    public void setTieneCochera(boolean tieneCochera) {
        this.TieneCochera = tieneCochera;
    }
    public String getPropietario() {
        return Propietario;
    }
    public void setPropietario(String Propietario) {
        this.Propietario = Propietario;
    }

    // Método toString
    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                ", Habitaciones=" + Habitaciones +
                ", Superficie=" + superficie +
                ", TieneCochera=" + TieneCochera +
                ", Propietario='" + Propietario + '\'' +
                '}';
    }

    // Métodos de uso general
    public void pagarImpuestos(double cantidad) {
        System.out.println("El propietario " + Propietario + " debe pagar " + cantidad + " pesos de impuestos");
    }
    public void alquilar(String inquilino, double precio) {
        System.out.println("La casa que se ubicada en " + direccion + " se renta a " + inquilino + " por " + precio + " pesos mensuales");
    }
    public void vender(double precioVenta) {
        System.out.println("La casa que se ubicada en " + direccion + " se vende por " + precioVenta + " pesos");
    }
}
