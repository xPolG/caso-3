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


public class Feligreses {
    private String nombre;
    private int cedula;
    private double diezmo;

    public Feligreses(String nombre, int cedula, double diezmo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.diezmo = diezmo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public double getDiezmo() {
        return diezmo;
    }

    public static Feligreses[] ingresarDatosFeligreses(int cantFeligreses) {
        Feligreses[] arrFeli = new Feligreses[cantFeligreses];

        for (int i = 0; i < cantFeligreses; i++) {
            System.out.println("\nFeligres #" + (i + 1));
            String nombreFeligres = JOptionPane.showInputDialog("Digite el nombre del Feligrés");
            int cedulaFeligres = Integer.parseInt(JOptionPane.showInputDialog("Digite la cédula del Feligrés"));
            double diezmoFeligres = Double.parseDouble(JOptionPane.showInputDialog("Digite la cantidad del diezmo"));

            arrFeli[i] = new Feligreses(nombreFeligres, cedulaFeligres, diezmoFeligres);
        }

        return arrFeli;
    }
}


