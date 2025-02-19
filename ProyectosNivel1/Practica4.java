import javax.swing.*;
import java.awt.*;
import java.util.Scanner;


class Practica4_2{
    public void practica4_2 (){
        JFrame frame = new JFrame();
        frame.setAlwaysOnTop(true);
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Ingrese el saldo inicial (número entero) de la cuenta bancaria...");
        int saldoInicial = entrada2.nextInt();


        String tasaInteresTexto = JOptionPane.showInputDialog(frame, "Ingrese la tasa de interés (número entero)...");
        int tasaInteres = Integer.parseInt(tasaInteresTexto);
        saldoInicial++;
        saldoInicial+=20;
        saldoInicial-=tasaInteres;
        saldoInicial*=tasaInteres;
        saldoInicial%=9;
        double saldoFinal = saldoInicial;
        saldoFinal/=4.2;
        boolean condicion = (500>saldoFinal && saldoFinal >50);
        JOptionPane.showMessageDialog(frame,"Saldo final: " + saldoFinal + "\n" +
                "¿Está el saldo final entre 50 y 500? " + condicion );
        frame.dispose();
    }
}
public class Practica4 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setAlwaysOnTop(true);
        Practica4_2 saldo = new Practica4_2();
        saldo.practica4_2();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su puntaje inicial ...");
        int puntuacion = entrada.nextInt();
        entrada.close();

        String nivelTexto = JOptionPane.showInputDialog(frame , "Ingrese su nivel...");
        int nivel = Integer.parseInt(nivelTexto);

        puntuacion++;
        puntuacion+=15;
        puntuacion-=nivel;
        puntuacion*=nivel;
        puntuacion%=7;

        double puntuacionFinal = puntuacion;
        puntuacionFinal/=2.5;
        boolean pasaRonda = (puntuacionFinal>= 20 && puntuacionFinal <= 100);
        JOptionPane.showMessageDialog(frame, "Puntuación final: " + puntuacionFinal + " ¿Pasa a la siguiente ronda? " + pasaRonda);
        frame.dispose();
    }
}
