package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;
public class EjercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean control = true;
        int contadorPar = 0;
        int contadorImpar = 0;
        int num = 0;
        int suma = 0;
        int mediaImpar = 0;
        int maxPar = 0;
        System.out.println("Introduce numeros. Si se introduce negativo, se detiene el programa");
        while (control){
            num = sc.nextInt();
            if (num < 0)
            {
                control = false;
            }
            else if (num % 2 == 0)
            {
                if (num > maxPar)
                {
                    maxPar = num;
                }
                contadorPar++;
            }
            else if (num % 2 != 0)
            {
                contadorImpar++;
                suma += num;
            }
        }
        mediaImpar = suma / contadorImpar;
        System.out.println("Cantidad de numeros introducidos: " + (contadorPar + contadorImpar));
        System.out.println("Media de los impares: " + mediaImpar);
        System.out.println("Mayor de los pares: " + maxPar);
    }
}
