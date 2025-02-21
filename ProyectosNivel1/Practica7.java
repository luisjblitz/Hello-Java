import javax.swing.*;
import java.util.Scanner;

public class Practica7 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el precio inicial...");
        double precioInicial = entrada.nextDouble();
        entrada.close();
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String interesTexto = JOptionPane.showInputDialog(frame, "Ingrese el interés  en porcentaje...");
        interesTexto = interesTexto.replace(",", ".");
        double interes = Double.parseDouble(interesTexto);
            double precioFinal = Math.round(precioInicial * (1 + interes / 100));
        frame.dispose();
        int totalBilletes = 0;
        int precioCentavos = (int) (precioFinal * 100);
        int billetes50 = precioCentavos / 5000;
        precioCentavos %= 5000;//Residuo de la división
        totalBilletes += billetes50;
        int billetes20 = precioCentavos / 2000;
        precioCentavos %= 2000;//Si el anterior residuo NO es 0, se divide entre 2000 y se guarda el residuo
        totalBilletes += billetes20;
        int billetes10 = precioCentavos / 1000;
        precioCentavos %= 1000;//De igual forma, si el residuo anterior NO es 0, se divide entre 1000 y se guarda el residuo. Así sucesivamente
        totalBilletes += billetes10;
        int billetes5 = precioCentavos / 500;
        precioCentavos %= 500;
        totalBilletes+= billetes5;
        int billetes1 = precioCentavos / 100;
        precioCentavos %= 100;
        totalBilletes += billetes1;
        int moneda10Centavo = precioCentavos / 10;
        precioCentavos %= 10;
        totalBilletes += moneda10Centavo;
        int moneda5Centavo = precioCentavos / 5;
        precioCentavos %= 5;
        totalBilletes += moneda5Centavo;
        int moneda1Centavo = precioCentavos;
        precioCentavos%= 1;
        totalBilletes += moneda1Centavo;
            int noSePuedeDevolver = precioCentavos;

        System.out.println("El precio final es de " + precioFinal + " Dólares");
        System.out.println("Se requiere de " + billetes50 + " billetes de 50, " + "\n"
                + billetes20 + " billetes de 20, " + "\n"
                + billetes10 + " billetes de 10 y " + "\n"
                + billetes5 + " billetes de 5, " + "\n" +
                billetes1 + " billetes de 1, " + "\n" +
                moneda10Centavo + " monedas de 10 centavos, " + "\n" +
                moneda5Centavo + " monedas de 5 centavos y " + "\n" +
                moneda1Centavo + " monedas de 1 centavo.");
        System.out.println();
        System.out.println("En total se requieren " + totalBilletes + " billetes y monedas.");
        System.out.println("Cantidad que no se puede devolver: " + noSePuedeDevolver + " centavos.");
        System.out.println();
        System.out.println("Vericación:" + billetes50 + "Billetes de 50 equivalen a " + billetes50 * 50 + " Dólares\n" +
                billetes20 + "Billetes de 20 equivalen a " + billetes20 * 20 + " Dólares\n" +
                billetes10 + "Billetes de 10 equivalen a " + billetes10 * 10 + " Dólares\n" +
                billetes5 + "Billetes de 5 equivalen a " + billetes5 * 5 + " Dólares\n" +
                billetes1 + "Billetes de 1 equivalen a " + billetes1 * 1 + " Dólares\n" +
                moneda10Centavo + "Monedas de 10 centavos equivalen a " + moneda10Centavo * 0.10 + " Dólares\n" +
                moneda5Centavo + "Monedas de 5 centavos equivalen a " + moneda5Centavo * 0.05 + " Dólares\n" +
                moneda1Centavo + "Monedas de 1 centavo equivalen a " + moneda1Centavo * 0.01 + " Dólares\n");
        System.out.println("Total: " + (billetes50 * 50 + billetes20 * 20 + billetes10 * 10 + billetes5 * 5 + billetes1 * 1 + moneda10Centavo * 0.10 + moneda5Centavo * 0.05 + moneda1Centavo * 0.01) + " Dólares");
    }
}