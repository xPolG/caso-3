/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miproyecto.pkg3;
import javax.swing.JOptionPane;
/**
 *
 * @author POLG
 */
public class MainApp {
    public static void main(String[] args) {
        Iglesia iglesia = Iglesia.ingresarDatosIglesia();
        Feligreses[] feligreses = Feligreses.ingresarDatosFeligreses(iglesia.getCantFeligreses());

        generarInforme(iglesia, feligreses);
    }

    private static void generarInforme(Iglesia iglesia, Feligreses[] feligreses) {
        double totalGanancias = 0;
        for (Feligreses feligres : feligreses) {
            totalGanancias += feligres.getDiezmo();
        }

        double impuestoInfraestructura = totalGanancias * 0.09;
        double impuestoComedor = totalGanancias * 0.21;
        double gananciaPastor = totalGanancias * 0.70;

        System.out.println("\n--- Informe de la Iglesia ---");
        System.out.println("Nombre de la Iglesia: " + iglesia.getNombre());
        System.out.println("Nombre del Pastor: " + iglesia.getNombrePastor());
        System.out.println("\nMonto total de ganancias de la iglesia: $" + totalGanancias);
        System.out.println("Monto para la municipalidad para infraestructura: $" + impuestoInfraestructura);
        System.out.println("Monto para el comedor municipal: $" + impuestoComedor);
        System.out.println("Monto de ganancia para el pastor: $" + gananciaPastor);
    }
}

