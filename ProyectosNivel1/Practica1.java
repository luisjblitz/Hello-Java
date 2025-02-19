import javax.swing.*;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el primer numero entero...");
        int numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero entero...");
        int numero2 = entrada.nextInt();
        entrada.close();

        String number3Text = JOptionPane.showInputDialog("Ingresa el tercer numero entero...");
        int numero3 = Integer.parseInt(number3Text);
        String number4Text = JOptionPane.showInputDialog("Ingresa el cuarto numero entero...");
        int numero4 = Integer.parseInt(number4Text);
        int sumaScanner = numero1 + numero2;
        int productoJOption = numero3 * numero4;
        sumaScanner++;
        productoJOption--;

        double promedio = (double)(numero1 + numero2 +  numero3 + numero4) / 4;
        var comparacion = sumaScanner > productoJOption;
        boolean rangoDelPromedio = ( 20<= promedio && promedio <=50);
        boolean condicion = comparacion ^ rangoDelPromedio; //Verdadero si y solo sí una es verdad
        JOptionPane.showMessageDialog(null, "¿" +sumaScanner + "  es mayor que " +productoJOption+ "? _"+ comparacion +" _"+ "\n"
                + promedio +  " ¿está entre 20 y 50? _" + rangoDelPromedio+"_\n"
                +"Resultado final XOR:  " + condicion);
    }
}
