/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_cubo;

/**
 *
 * @author Perla
 */
public class EVA1_19_CUBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ARREGLO DE 3 DIMENSIONES
        int[][][] aiCubo = new int[3][4][2];
        //CUANTOS ENTEROS SON?
        //24 enteros (3 x 4 x 2)
        for (int i = 0; i < aiCubo.length;i++){
            for (int j = 0; j < aiCubo[i].length;j++){
                for (int k = 0; k < aiCubo[i][j].length;k++){
                    aiCubo[i][j][k] = 100;
                }
            }
        }
    }
    
}
