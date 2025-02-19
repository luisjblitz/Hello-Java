import java.util.Scanner;

class Ejecutar {
    static void casting(){
        String numeroTexto = "1618";
        int numeroEntero = Integer.parseInt(numeroTexto);
        System.out.println("Numero entero: " + numeroEntero);
        //Entero a texto
        int entero = 15;
        String enteroTexto = String.valueOf(entero);
        System.out.println("numero en texto: " + enteroTexto);

        //De double a entero Narrowing
        double myDouble = 1.618;
        int myInt = (int)myDouble;
        System.out.println(myInt);

        //De Entero a double Widening
        int numero2 = 182;
        double decimal =  numero2;
        System.out.println(decimal);
    }
    static void operadores(){
        int valor1, valor2, valor3, resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor 1...");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el valor2");
        valor2 = entrada.nextInt();
        System.out.println("Ingrese el valor3...");
        valor3 = entrada.nextInt();
        resultado = valor1 + valor2 + valor3;
        System.out.println("Suma: " + resultado);
        resultado = valor1 - valor2 - valor3;
        System.out.println("resta: " + resultado);
        resultado = valor1 * valor2 * valor3;
        System.out.println("Multiplicacion: " + resultado);
        resultado = valor1/valor2;
        System.out.println("Division: " + resultado);
        resultado = valor1 % valor2;
        System.out.println("Residuo: " + resultado);

        //incremento , decremento
        int numero1 = 5;
        System.out.println("Valor inicial " + numero1);
        numero1++;
        System.out.println("Incremento " + numero1);
        numero1+=2;
        System.out.println("Con Incremento de 2; " + numero1);
        int numero2 = 8;
        System.out.println("Valor inicial: " + numero2);
        numero2--;
        System.out.println("Decremento en 1: "+numero2);
        numero2--;
        System.out.println("Decremento en 1: "+numero2);
        numero2-=4;
        System.out.println("Decremento de 4: " + numero2);

        int numero3 = 9;
        System.out.println("Valor original: " + numero3);
        numero3*=20;
        System.out.println("Valor incrementado: " + numero3);
        numero3/=2;
        System.out.println("Valor incrementado: " + numero3);

        int numero4 = 6;
        System.out.println("Valor original: " + numero4);
        numero4 %= 2;
        System.out.println("Valor después de % 2: " + numero4);

             //Con bits
                /*numero4 =10;
                numero4 &= 9;
                System.out.println("Valor después de &9: " + numero4 + "en decimal = 1000 en binario ");//realiza una operación AND bit a bit entre numero4 (que es 10) y 9. El resultado es 1000 en binario, que es 8 en decimal
                numero4|=21;
                System.out.println("Valor después de |21: " + numero4 + "en decimal =  11111 en binario") ;//realiza una operación OR bit a bit
                numero4^=18;
                System.out.println("Valor después de ^18: " + numero4 + "en decimal =  10111 en binario");//realiza una operación XOR bit a bit
                numero4>>=4;
                System.out.println("Valor después de >>4: " + numero4 + "en decimal =  0 en binario");//realiza una operación de desplazamiento a la derecha de 4 bits
                numero4<<=2;
                System.out.println("Valor después de <<2: " + numero4 + "en decimal =  0 en binario");//realiza una operación de desplazamiento a la izquierda de 2 bits*/

        //Operadores de comparacion
        //Igualdad
        int number1 = 90, number2 = 90;
        var result = number1 == number2;
        System.out.println( number1 + " es igual a " + number2 + "? " + result);
        //Distinto a
        result = number1 != number2;
        System.out.println( number1 + " es diferente a " + number2 + "? " + result);
        //Mayor que
        result = number1 > number2;
        System.out.println( number1 + " es mayor a " + number2 + "? " + result);
        //Menor que
        result = number1 < number2;
        System.out.println( number1 + " es menor a " + number2 + "? " + result);
        //Menor o igual que
        result = number1 >= number2;
        System.out.println( number1 + " es mayor o igual a " + number2 + "? " + result);
        //MAyor o igual que
        result = number1 <= number2;
        System.out.println( number1 + " es menor o igual a " + number2 + "? " + result);



    }
}

public class Main {
    public static void main(String[] args) {
        Ejecutar llamarMetodos = new Ejecutar();
      // llamarMetodos.casting();
       llamarMetodos.operadores();
    }
}
