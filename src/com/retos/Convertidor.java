package com.retos;

import java.util.InputMismatchException;

public class Convertidor {

    public static int stringToNumero(String str) throws InputMismatchException{

        switch (str) {
            case "cero":
                return 0;
            case "un":
                return 1;
            case "dos":
                return 2;
            case "tres":
                return 3;
            case "cuatro":
                return 4;
            case "cinco":
                return 5;
            case "seis":
                return 6;
            case "siete":
                return 7;
            case "ocho":
                return 8;
            case "nueve":
                return 9;
            default:
                System.out.println("ERROR: " + str + " no es un string que represente un numero valido");
                throw new InputMismatchException();
        }
    }

    public static int resultado(String str, int valor1, int valor2) throws ArithmeticException{
        switch (str){
            case "suma":
                return (valor1 + valor2);
            case "resta":
                return (valor1 - valor2);
            case "multiplica":
                return (valor1 * valor2);
            case "divide":
                return (valor1 / valor2);
            default:
                System.out.println("ERROR: " + str + " no es una operación válida");
                throw new ArithmeticException();
        }
    }

    public static int operacionExtra(String str, int resultado, int valorExtra) throws ArithmeticException{
        switch (str){
            case "sumale":
                return (resultado + valorExtra);
            case "restale":
                return (resultado - valorExtra);
            case "multiplicalo":
                return (resultado * valorExtra);
            case "dividelo":
                return (resultado / valorExtra);
            default:
                System.out.println("ERROR: " + str + " no es una operación válida");
                throw new ArithmeticException();
        }
    }

    public static boolean esY(String str) throws NoEsYException{

        if (!str.equalsIgnoreCase("y")) {
            System.out.println("ERROR: " + str + " no es y");
            throw new NoEsYException();
        } else
            return true;
    }

    public static String[] separarStrings(String operacion){

        return operacion.split(" ");
    }
}
