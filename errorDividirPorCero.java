// Realizar un programa que permita el ingreso de dos números por teclado para ser divididos entre sí. 
// Tomar como precaución la utilización del try y el catch por si el segundo número ingresado para dividir se trata de un cero. 
// Mostrar un mensaje adecuado en caso de que se produzca la excepción.

public class errorDividirPorCero {

    public static void main(String[] args) {
        
        try {
            int division = 10;
            division = division / 0;

        } catch (Exception e) {
           System.out.println("Error al dividir un número por cero.");
        }
    } // cierrra main
} // cierra class
