public class Operadores_Logicos {
    public static void main(String[] args) {
        boolean a = true, b = true;
        //operador AND (Y)
        System.out.println(a && b);

        //Operador OR (O) al menos uno de los valores es verdadero
        System.out.println( a || b);

        //Operador NOT cambiar el valor de verdad
        System.out.println(!a);

        //Operador XOR (O exclusivo) solo uno de los valores debe ser verdadero
        System.out.println(a ^ b);
    }
}
