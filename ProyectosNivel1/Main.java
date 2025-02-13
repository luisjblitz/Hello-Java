import java.lang.Math;
class Geometria {
    static double calcularAreaCirculo (double radio){
        return Math.PI * Math.pow(radio, 2);
    }
    static double calcularVolumenEsfera (double radio){
        return (4.0/3.0)*Math.PI * Math.pow(radio, 3);
    }
    static double calcularHipotenusa (double catetoA, double catetoB){
        return Math.sqrt(Math.pow(catetoA, 2)+ Math.pow(catetoB, 2));
    }
}
public class Main {
    public  static void main (String[] args){
        double areaCirculo = Geometria.calcularAreaCirculo(1.618);
        double volumenEsfera = Geometria.calcularVolumenEsfera(1.618);
        double hipotenusa = Geometria.calcularHipotenusa(8.0,5.0);

        System.out.printf("Area del círculo = %.5f%n", areaCirculo);
        System.out.printf("Volumen esfera = %.2f%n", volumenEsfera);
        System.out.printf("Hipotenusa = %.2f%n", hipotenusa);
    }
}