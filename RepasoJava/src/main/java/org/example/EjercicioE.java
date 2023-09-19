package org.example;

import java.util.Scanner;

// faltan los espacios del medio
public class EjercicioE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la altura de la piramide maya: ");
        int altura = sc.nextInt();
        int nivel = 1;
        int longitudDeLinea = 6;
        int espacios = altura - 1;

        while (nivel <= altura) {

            //espacios
            for (int i = 1; i <= espacios; i++) {
                System.out.print(" ");
            }

            //asteriscos
            for (int i = 1; i <= longitudDeLinea; i++) {
                System.out.print("*");
            }

            System.out.println();

            nivel++;
            espacios--;
            longitudDeLinea += 2;
        }
    }
}
