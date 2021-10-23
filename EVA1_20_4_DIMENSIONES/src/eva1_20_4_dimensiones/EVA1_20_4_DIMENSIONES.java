/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_4_dimensiones;

/**
 *
 * @author Perla
 */
public class EVA1_20_4_DIMENSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][][][] iTese = new int[5][3][2][6];
        //¿Cuantos enteros almacena? = (5*3*2*6) --> 180 enteros
        
        for (int i =0; i < iTese.length; i++){//primera dimension directamente del nombre del arreglo
            for (int j =0; j < iTese[i].length; j++){//segunda dimension aqui se agrega el primer arreglo y dentro de ese arreglo se le agrega el i
                for (int k =0; k < iTese[i][j].length; k++){//tercera dimension se le agrega el primer y segundo arreglo y dentro de ellos el i y el j
                    for (int l =0; l < iTese[i][j][k].length; l++){//cuarta dimension se le agrega el primer, segundo y tercer arreglo y dentro se escribira i, j, k todo esto es para saber la poscion
                        iTese[i][j][k][l] = 100;//Aqui va el valor al que vamos a acceder
                    }
                }
            }
        }
    }
    
}
