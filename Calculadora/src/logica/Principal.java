package logica;

import interfazGrafica.Ventana;
import java.awt.Toolkit;

public class Principal {

    public static void main(String[] args) {

        Ventana calculadora = new Ventana();
        calculadora.setVisible(true);
        calculadora.setLocationRelativeTo(null);
        calculadora.setTitle("Calculadora");
    }

}
