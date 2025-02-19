import javax.swing.*;
import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número entero...");
        int num1 = entrada.nextInt();
        entrada.close();
        String num2Texto = JOptionPane.showInputDialog(null,"Ingrese un número entero...");
        int num2 = Integer.parseInt(num2Texto);
        num1++;
        num1+=10;
        num1%=num2;
        double resultadoDouble = (double)num1;
        resultadoDouble/=3.5;
        boolean condicion = (20>resultadoDouble&& resultadoDouble>5);
        JOptionPane.showMessageDialog(null, "Resultado división: " + resultadoDouble + "\n" +
                "Condición: ¿El resultado está entre 5 y 20 ? " + condicion );
    }
}