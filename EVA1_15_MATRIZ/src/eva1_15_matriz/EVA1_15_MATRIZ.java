/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_matriz;

/**
 *
 * @author Perla
 */
public class EVA1_15_MATRIZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int iMatriz[][] = new int[5][3];
        //ACCEDER A UN ELEMENTO:
        iMatriz[0][0] = 1000;//PRIMER POSICION
        iMatriz[4][2] = 2000;//ULTIMA POSICION
        System.out.println("TAMAÑO DEL ARREGLO: " + iMatriz.length);
        //CICLOS X CADA DIMENSION
        //CICLOS ANIDADOS (CICLO DENTRO DE OTRO CICLO)
        for(int i = 0;i < iMatriz.length;i++){//FILAS (DE 0 A 4); FILAS iMatriz.length
            for (int j = 0; j < 3;j++){//COLUMNAS (0 A 3)
                iMatriz[i][j] = 1000;
            }
        }
        for(int i = 0;i < iMatriz.length;i++){//FILAS (DE 0 A 4); FILAS iMatriz.length
            for (int j = 0; j < 3;j++){//COLUMNAS (0 A 3)
                 System.out.print("[" + iMatriz[i][j] + "]");
            }
            System.out.println("");
    }
  }
}