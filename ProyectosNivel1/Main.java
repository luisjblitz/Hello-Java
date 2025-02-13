import javax.swing.*;
class IndiceMasaCorporal {
    double peso;
    double altura;

    public void solicitarDatos() {
        String pesoTexto = JOptionPane.showInputDialog(null, "Ingrese su peso en kg...");
        peso = Double.parseDouble(pesoTexto);
        String alturaTexto = JOptionPane.showInputDialog(null, "Ingrese su altura en metros...");
        altura = Double.parseDouble(alturaTexto);
    }

    public void calculoDeImc() {
        double imc = peso / Math.pow(altura, 2);


        if (imc < 18.5) {
            JOptionPane.showMessageDialog(null, "Bajo peso , tu IMC es: " + String.format("%.2f",imc));
        } else if (imc < 24.9) {
            JOptionPane.showMessageDialog(null, "Peso normal , tu IMC es: " + String.format("%.2f",imc));
        } else if (imc < 29.9) {
            JOptionPane.showMessageDialog(null, "Sobrepeso, tu IMC es: " + String.format("%.2f",imc));
        } else {
            JOptionPane.showMessageDialog(null, "Obseidad, tu IMC es: " + String.format("%.2f",imc));
        }

    }

}
public class Main {
    public static void main (String [] args ){
        IndiceMasaCorporal persona1 = new IndiceMasaCorporal();
        persona1.solicitarDatos();
        persona1.calculoDeImc();
    }
}