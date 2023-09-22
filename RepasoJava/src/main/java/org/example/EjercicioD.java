package org.example;
import java.util.Scanner;
public class EjercicioD {
    public static void main(String[] args) {
        //Realiza un programa que pida primero un número y a continuación un dígito. El programa nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese dígito en  el número introducido.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        int numUsuario = sc.nextInt();
        System.out.println("Introduzca un digito: ");
        int digito = sc.nextInt();

        int posicion = 1;
        int longitud = 0;
        int numAlReves = 0;

        int copiaNum = 0;
        copiaNum = numUsuario * 10 + 1; // por si termina en 0, se anade 1

        if (copiaNum == 0)
        {
            longitud = 1;
        }

        while (copiaNum > 0)
        {
            numAlReves = (numAlReves * 10) + (copiaNum % 10);
            copiaNum /= 10;
            longitud++;
        }

        while (numAlReves != 1)
        {
            if ((numAlReves % 10) == digito)
            {
                System.out.println("El digito " + digito + " esta en la posicion " + posicion);
            }
            numAlReves /= 10;
            posicion++;
        }

    }
}
