import javax.swing.*;
import java.util.Scanner;

public class Practica6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nivel de productividad (número entero)...");
        int productividad = entrada.nextInt();
        entrada.close();
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String proyectosTexto = JOptionPane.showInputDialog(frame, "Ingrese la cantidad de proyectos completados (un número entero)...");
        int proyectos = Integer.parseInt(proyectosTexto);
        productividad++;
        int bonus = productividad*4;
        productividad+=bonus;
        productividad-=7;
        productividad*=proyectos;
        productividad%=5;

        double productividadFinal = productividad;
        productividadFinal/=2.7;
        boolean cumple = (80>productividadFinal && productividadFinal>20);
        JOptionPane.showMessageDialog(frame, "El nivel de productividad final es: " + productividadFinal + "\n" +
                "¿Cumple con el nivel de productividad requerido? " + cumple);
    }
}
