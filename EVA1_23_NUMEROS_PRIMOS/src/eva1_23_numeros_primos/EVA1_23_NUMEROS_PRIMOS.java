/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_numeros_primos;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class EVA1_23_NUMEROS_PRIMOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        int iVal = input.nextInt();
        boolean esPrimo = true;
        for (int i = 2; i < iVal; i++){
            //DIVISION: iVal / i --> DIVISION EXACTA -- NO ES PRIMO
            //MODULO --> CALCULA EL RESIDUO DE UNA DIVISION
            //JAVA EL MODULO ES % --> NUM1 % NUM2
            //7 % 5 = 2 DIVISION CON RESIDUO DIFERENTE A CERO
            //15 % 3 = 0 DIVISION EXACTA
            int iMod = iVal % i;
            if(iMod == 0){//modulo es igual cero, NO ES PRIMO hay que terminar, el programa esta diseñado para detectar cuando el numero NO ES PRIMO
                esPrimo = false;
                break;//DETIENE PERMAMENTEMENTE EL FOR
                //continue;//DETIENE LA ITERACION ACTUAL
            }
            //Si la division es exacta --> terminamos NO ES PRIMO
            //Si terminamos el for sin dividir exactamente: ES PRIMO
        }
        //IMPRIMIR SI ES PRIMO O NO
        if(esPrimo)
            System.out.println("El numero es primo");
        else
            System.out.println("El numero no es primo");
    }
    
}
