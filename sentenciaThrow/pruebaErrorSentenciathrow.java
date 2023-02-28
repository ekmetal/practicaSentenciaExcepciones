package sentenciaThrow;

import java.util.Scanner;

public class pruebaErrorSentenciathrow {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Ingrese su edad");
            int edad = teclado.nextInt();
            final int MAYOR_EDAD = 18;

            try {
                if (edad >= MAYOR_EDAD) {
                    System.out.println("Bienvenido");
                } else {
                    throw new errorSentenciaThrow("Eres menor de edad");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    } // cierra main
} // cierra class
