package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
public class EjercicioB {

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
        boolean control = true;
        int porcentajeIva = 0;
        double valorPromocion = 0;
        String base = "";
        double baseDouble = 0;
        String codigoPromocional = "";
        String iva = "";
        while (control)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca base imponible:");
            base = sc.nextLine();
            if (checkDouble(base)) {
                baseDouble = convertDouble(base);
                if (baseDouble >= 0) {
                    System.out.println("Introduzca el tipo de IVA (general, reducido o superreducido):");
                    iva = sc.nextLine().toLowerCase();
                    if (iva.equals("general") || iva.equals("reducido") || iva.equals("superreducido"))
                    {
                        switch (iva)
                        {
                            case "general": porcentajeIva = 21;
                                break;
                            case "reducido": porcentajeIva = 10;
                                break;
                            case "superreducido": porcentajeIva = 4;
                                break;
                            default: porcentajeIva = 21;
                            iva = "IVA no valido, se aplica general";
                        }
                    } else {
                        System.out.println("IVA no valido, se aplica general");
                        iva = "general";
                        porcentajeIva = 21;
                    }

                    System.out.println("Introduzca el codigo promocional (nopro, mitad, meno5 o 5porc):");
                    codigoPromocional = sc.nextLine().toLowerCase();
                    if (codigoPromocional.equals("nopro") || codigoPromocional.equals("mitad") || codigoPromocional.equals("meno5") || codigoPromocional.equals("5porc"))
                    {
                        switch (codigoPromocional)
                        {
                            case "nopro": valorPromocion = 0;
                                break;
                            case "mitad": valorPromocion = baseDouble / 2;
                                break;
                            case "meno5": valorPromocion = 5;
                                break;
                            case "5porc" : valorPromocion = (baseDouble * 5) / 100;
                                break;

                        }

                    } else {
                        System.out.println("Codigo promocional no valido, no se aplica");
                        codigoPromocional = "no valido";
                    }
                    control = false;
                }
            }
        }
        double ivaCalculado = (baseDouble * porcentajeIva) / 100;
        double precioFinal = (baseDouble + ivaCalculado) - valorPromocion;

        System.out.println("Base imponible  " + baseDouble);
        System.out.println("IVA (" + porcentajeIva + "%)    " + ivaCalculado);
        System.out.println("Precio con IVA  " + (baseDouble + ivaCalculado));
        System.out.println("Cod. promo. (" + codigoPromocional + "): - " + valorPromocion);
        System.out.println("TOTAL           " + precioFinal);
    }
}
