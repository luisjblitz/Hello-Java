import javax.swing.*;
import java.util.Scanner;

public class Practica3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el monto total en dólares...");
        double montoOriginal = entrada.nextDouble();

        String ajusteTExto = JOptionPane.showInputDialog(null, "Ingrese el monto de ajuste (en dólares)...");
        ajusteTExto = ajusteTExto.replace(',', '.');
        double ajuste = Double.parseDouble(ajusteTExto);

        int pasosRealizados =0;
        double montoTotal = montoOriginal + ajuste;
        pasosRealizados++;

        int montoCentavos = (int )  Math.round(montoTotal * 100);
        int billetes10 = montoCentavos/1000;
        pasosRealizados++;
        montoCentavos%=1000;

        int billetes1 = montoCentavos/100;

        pasosRealizados++;



        boolean condicion1 = (montoOriginal > 50 && billetes10> 3);

        System.out.println("Monto total ajustado (en dólares): " + montoTotal   +" \n" +
                "Cantidad de billetes de 10 dólares: " + billetes10   + "\n" +
                "Cantidad de billetes de 1 dólar: " + billetes1   +"\n");
                billetes10+=billetes1;
        System.out.println( "Total de billetes acumulados: " + billetes10   +"\n" +
                "Número de operaciones realizadas (contador): " + pasosRealizados + "\n" +
                "¿el monto original (antes del ajuste) era mayor a 50 dólares y  la cantidad de billetes de 10 obtenidos es mayor a 3? "  + condicion1);
    }
}