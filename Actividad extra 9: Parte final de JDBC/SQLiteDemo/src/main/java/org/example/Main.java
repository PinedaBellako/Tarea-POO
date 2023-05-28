package org.example;

import org.example.vista.VentanaLibro;
import org.example.controlador.ControladorLibro;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("jvm");
        ControladorLibro controller = new ControladorLibro(view);
    }
}