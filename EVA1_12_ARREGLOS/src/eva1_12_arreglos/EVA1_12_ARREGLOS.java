/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_arreglos;

/**
 *
 * @author Perla
 */
public class EVA1_12_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] iArreglo = new int[3];
        System.out.println("Direccion de iArreglo = " + iArreglo);
        iArreglo[0] = 1000;
        iArreglo[1] = 2000;
        iArreglo[2] = 3000;
        //iArreglo[3] = 3; //error: ArrayIndexOutOfBound --> Nos pasamos de los limites del arreglo
        for(int i = 0; i < iArreglo.length; i++){
            System.out.println("CUENTA " + i + " = $" + iArreglo[i]);
        }
        iArreglo = new int[2];
         System.out.println("Direccion de iArreglo modificado = " + iArreglo);
         for(int i = 0; i < iArreglo.length; i++){
            System.out.println("CUENTA MODIFICADA " + i + " = $" + iArreglo[i]);
        }
    }
    
}
