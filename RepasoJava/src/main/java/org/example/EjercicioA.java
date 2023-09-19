package org.example;

import java.util.Scanner;
public class EjercicioA
{
    public static boolean checkDouble (String st)
    {
        try
        {
            Double.parseDouble(st);
            return true;
        }
        catch (NumberFormatException ex)
        {
            System.out.println("No es double");
            return false;
        }

    }
    public static double convertDouble (String st)
    {
        try
        {
            Double.parseDouble(st);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("No has introducido un numero valido");

        }
        return Double.parseDouble(st);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota del primer control:");
        String nota1 = sc.nextLine();

        System.out.println("Nota del segundo control:");
        String nota2 = sc.nextLine();

        double media = 0;
        boolean control = true;
        while (control)
        {
            if (checkDouble(nota1) && checkDouble(nota2))
            {
                double nota1Double = convertDouble(nota1);
                double nota2Double = convertDouble(nota2);
                if (nota1Double >= 0 && nota2Double >= 0)
                {
                    media = (nota1Double + nota2Double) / 2;

                    if (media >= 5)
                    {
                        System.out.println("Tu nota de programacion es: " + media);
                        control = false;
                    }
                    else
                    {
                        System.out.println("Cual ha sido el resultado de la recuperacion? apto / no apto");
                        String resultado = sc.nextLine();
                        if ("apto".equalsIgnoreCase(resultado))
                        {
                            System.out.println("Tu nota de programacion es 5");
                            control = false;
                        }
                        else if ("no apto".equalsIgnoreCase(resultado))
                        {
                            System.out.println("Tu nota de programacion es " + media);
                            control = false;
                        }
                        else
                        {
                            System.out.println("Debes introducir apto o no apto");
                            resultado = sc.nextLine();
                        }
                    }
                }
            }
            else
            {
                System.out.println("Vuelve a introducir tu primera nota:");
                nota1 = sc.nextLine();
                System.out.println("Vuelve a introducir tu segunda nota:");
                nota2 = sc.nextLine();
            }

        }
    }
}
