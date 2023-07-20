/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miproyecto.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author POLG
 */

public class Iglesia {
    private String nombre;
    private String nombrePastor;
    private int cantFeligreses;

    public void ingresarDatos(String nombre, String nombrePastor, int cantFeligreses) {
        this.nombre = nombre;
        this.nombrePastor = nombrePastor;
        this.cantFeligreses = cantFeligreses;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombrePastor() {
        return nombrePastor;
    }

    public int getCantFeligreses() {
        return cantFeligreses;
    }

    public static Iglesia ingresarDatosIglesia() {
        Iglesia iglesia = new Iglesia();

        iglesia.ingresarDatos(
            JOptionPane.showInputDialog("Digite el nombre de la iglesia"),
            JOptionPane.showInputDialog("Digite el nombre del pastor"),
            Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de feligreses"))
        );

        return iglesia;
    }
}


