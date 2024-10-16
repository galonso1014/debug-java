// package debugExample;

import java.util.Scanner;

public class ejemplo_Debug {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un número
        System.out.println("Introduce un número entero positivo:");
        int n = scanner.nextInt();

        // Llamar a la función que calcula la suma de los primeros n números
        int suma = sumaNumeros(n);
        System.out.println("La suma de los primeros " + n + " números naturales es: " + suma);

        // Verificar si los números son pares o impares
        verificaParImpar(n);

        scanner.close();  // Cerrar el scanner
    }

    // Función que calcula la suma de los primeros n números
    public static int sumaNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    // Función que verifica si los números son pares o impares
    public static void verificaParImpar(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es un número par.");
            } else {
                System.out.println(i + " es un número impar.");
            }
        }
    }
}
