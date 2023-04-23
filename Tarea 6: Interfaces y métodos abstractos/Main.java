package org.example;

import org.example.herenciamultiple.AlumnoDeportistaArtista;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Cuadrado cuadrado=new Cuadrado();
        cuadrado.setLado(5);
        System.out.println("Area "+cuadrado.calcularArea());

        Circulo circulo = new Circulo();
        circulo.setRadio(2.4);
        System.out.println("Area del circulo: "+circulo.calcularArea());

        AlumnoDeportistaArtista Juanito =new AlumnoDeportistaArtista();
        Juanito.setNombre("Juan");
        Juanito.setArte("Pintura");
        Juanito.setdeporte("basket ball");
        System.out.println(Juanito);
        Juanito.ensayar("Oleo");
        Juanito.entrenar();
        Juanito.presentarCompetencia("Naucalli");
    }
}