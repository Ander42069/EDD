/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_arreglos_de_arreglos;

/**
 *
 * @author Perla
 */
public class EVA1_16_ARREGLOS_DE_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //DECLARAR UN ARREGLO DE DOS DIMENSIONES:
        int[][] iMatriz = new int[3][3];//9 enteros en total
        System.out.println("Direccion de la matriz: " + iMatriz);
        System.out.println("Tamaño de la primer dimension (filas): " + iMatriz.length);
        for(int i = 0;i < iMatriz.length;i++){//Filas
            System.out.println("iMatriz["+i+"]= " + iMatriz[i]);
        
        }
    }
    
}
