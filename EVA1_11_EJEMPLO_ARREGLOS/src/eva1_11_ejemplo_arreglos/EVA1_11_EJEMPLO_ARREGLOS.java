/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_ejemplo_arreglos;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class EVA1_11_EJEMPLO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PRIMERO PREGUNTAMOS EL TAMAÑO DEL GRUPO:
        Scanner input = new Scanner(System.in);
        System.out.println("Indica el tamaño del grupo:");
        int iTama = input.nextInt();
        int[] aiEdades = new int[iTama];
        for (int i = 0; i < aiEdades.length; i++){//desde el primer elemento (CERO) a ultimo (n-1)
            System.out.println("Edad:");
            aiEdades[i] = input.nextInt();
        }
        
        //ACUMULADOR
        int iAcum = 0;
        for (int i = 0; i < aiEdades.length; i++){
            System.out.print("[" + aiEdades[i] + "]");
            iAcum = iAcum + aiEdades[i];//iAcum += aiEdades[i];
        }
        double dProm = iAcum / iTama; //aiEdades.length
        System.out.println("Promedio: " + dProm);
    }
    
}
