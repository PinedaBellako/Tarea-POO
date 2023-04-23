package org.example.herenciamultiple;

public class AlumnoDeportistaArtista extends Alumno implements Deportista,Artista{
    private int idActividadesExtra;
    private String deporte;
    private String arte;

    public AlumnoDeportistaArtista() {
    }

    public AlumnoDeportistaArtista(int edad, String nombre, int numeroCuenta, String carrera, double promedio, int idActividadesExtra, String deporte, String arte) {
        super(edad, nombre, numeroCuenta, carrera, promedio);
        this.idActividadesExtra = idActividadesExtra;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getiIdActividadesExtra() {
        return idActividadesExtra;
    }

    public void setIdActividadesExtra(int idActividadesExtra) {
        this.idActividadesExtra = idActividadesExtra;
    }

    public String getdeporte() {
        return deporte;
    }

    public void setdeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return super.toString()+
                "AlumnoDeportistaArtista{" +
                "idActividadesExtra=" + idActividadesExtra +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensayar(String diciplina) {
        System.out.println("El alumno esta ensayando "+this.arte);
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre()+" está presentando su obra...");
        return false;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre()+" está entrenando el deporte " + deporte);
        return 2;
    }

    @Override
    public boolean presentarCompetencia(String ubicacion) {
        System.out.println(getNombre()+" está en competencia del deporte " + deporte);
        return true;
    }
}