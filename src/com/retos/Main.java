package com.retos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String operacion = " ";
        Scanner scanner = new Scanner(System.in);
        boolean again = false;

        do {

            System.out.println("\nDigite la operación a realizar: ");
            operacion = scanner.nextLine();

            String []splitedWords = Convertidor.separarStrings(operacion);

            try {

                if (operacionSimples(splitedWords)){
                    resultadoSimples(splitedWords);
                } else {
                    resultadoComplejo(splitedWords);
                }

            System.out.println("\n¿Otra vez?: ");
            again = scanner.nextBoolean();
            scanner.nextLine();
            } catch (NumeroDeArgumentosInvalidoException e){}
            catch(InputMismatchException e){}
            catch (Exception e){}

        } while (again);
    }

    public static boolean operacionSimples(String []splitedWords) throws NumeroDeArgumentosInvalidoException{

        if (splitedWords.length == 4)
            return true;
        else if (splitedWords.length == 8 || splitedWords.length == 7)
            return false;
        else {
            System.out.println("ERROR: Numero de argumentos invalido");
            throw new NumeroDeArgumentosInvalidoException();
        }
    }

    public static void resultadoSimples(String []splitedWords){
        int valor1 = 0, valor2 = 0;

        try {
            for (int i = 0; i < splitedWords.length; i++) {

                if (i == 1)
                    valor1 = Convertidor.stringToNumero(splitedWords[i]);
                if (i == 2)
                    Convertidor.esY(splitedWords[2]);
                if (i == 3)
                    valor2 = Convertidor.stringToNumero(splitedWords[i]);
            }

            System.out.println("Resultado: " + Convertidor.resultado(splitedWords[0], valor1, valor2));

        } catch (InputMismatchException e){}
        catch (ArithmeticException e){}
        catch (NoEsYException e){}
    }

    public static void resultadoComplejo(String []splitedWords){
        int valor1 = 0, valor2 = 0, valorExtra = 0, resultadoSimples = 0;
        try {
            for (int i = 0; i < splitedWords.length; i++) {

                if (i == 1)
                    valor1 = Convertidor.stringToNumero(splitedWords[i]);
                if (i == 2)
                    Convertidor.esY(splitedWords[2]);
                if (i == 3)
                    valor2 = Convertidor.stringToNumero(splitedWords[i]);
                if (i==4)
                    Convertidor.esY(splitedWords[4]);
                if (i == splitedWords.length -1)
                    valorExtra = Convertidor.stringToNumero(splitedWords[i]);
            }

            resultadoSimples = Convertidor.resultado(splitedWords[0], valor1, valor2);
            System.out.println("Resultado: " + Convertidor.operacionExtra(
                    splitedWords[5], resultadoSimples, valorExtra)
            );

        } catch (InputMismatchException e){}
        catch (ArithmeticException e){}
        catch (NoEsYException e){}
        catch (Exception e){}
    }
}
