
package paqueteExt;

import java.util.Scanner;

public class SumaDeVectores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de los vectores:");
        int longitud = scanner.nextInt();

        // Crear los vectores
        int[] vector1 = new int[longitud];
        int[] vector2 = new int[longitud];

        // Llenar el primer vector
        System.out.println("Ingrese los elementos del primer vector:");
        for (int i = 0; i < longitud; i++) {
            vector1[i] = scanner.nextInt();
        }

        // Llenar el segundo vector
        System.out.println("Ingrese los elementos del segundo vector:");
        for (int i = 0; i < longitud; i++) {
            vector2[i] = scanner.nextInt();
        }

        // Sumar los vectores
        int[] result = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            result[i] = vector1[i] + vector2[i];
        }

        // Imprimir el resultado
        System.out.println("El resultado de sumar los vectores es:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
