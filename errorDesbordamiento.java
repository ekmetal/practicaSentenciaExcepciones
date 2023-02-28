// Realizar un programa donde se provoque una excepción de tipo “error por desbordamiento”. 
// Tratar la excepción mediante los bloques try y catch y mostrar un mensaje indicando la situación. 
// Por ejemplo: “Se produjo un error por desbordamiento”.

import java.util.Scanner;

public class errorDesbordamiento {

    private static final int t_f = 2;

    public static void main(String[] args) {
        int vector[] = new int[t_f];

        try (Scanner teclado = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                vector[i] = 1;
            }
        } catch (Exception e) {
            System.out.println("Hemos provocado un error por desbordamiento."); 
        } 

    } // cierra main
} // cierra class