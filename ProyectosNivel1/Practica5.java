import javax.swing.*;
import java.util.Scanner;

public class Practica5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la puntuación base (número entero)... ");
        int puntuacionBase = entrada.nextInt();
        entrada.close();
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        String pruebasTexto = JOptionPane.showInputDialog(frame, "Ingrese la  cantidad de pruebas realizadas (número entero)...");
        int pruebas = Integer.parseInt(pruebasTexto);

        puntuacionBase++;
        int producto = pruebas * 5;
        puntuacionBase+=producto;
        puntuacionBase-=3;
        puntuacionBase*=pruebas;
        puntuacionBase%=11;
        double puntuacionFinal= puntuacionBase;
        puntuacionFinal/=2.3;
        boolean condicion = (90>puntuacionFinal && puntuacionFinal >10);

        JOptionPane.showMessageDialog(frame, "Puntuación final: " + puntuacionFinal + "\n" +
                "¿La puntuación final está entre 10 y 90? " + condicion);
        frame.dispose();
    }
}
