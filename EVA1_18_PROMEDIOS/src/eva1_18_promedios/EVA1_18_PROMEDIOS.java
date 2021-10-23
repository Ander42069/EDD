/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_promedios;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class EVA1_18_PROMEDIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int[][] aiGrupos;//SE DECLARA ARREGLO aiGrupos, para poder crear y guardar lo que el usuario desee en en array
        //PREGUNTAR AL USUARIO LOS GRUPOS
        System.out.println("¿Cuantos grupos son?");
        int iNoGrupos = input.nextInt();
        //LOS GRUPOS REPRESENTAN LAS FILAS
        aiGrupos = new int[iNoGrupos][];
        for (int i = 0; i < aiGrupos.length; i++){
            System.out.println("Para el grupo " + i + " ¿Cuantos estudiantes son?");
            int iNoEstu = input.nextInt();
            aiGrupos[i] = new int[iNoEstu];
        }
        
        //VAMOS A PREGUNTAR LAS EDADES
        for (int i = 0; i < aiGrupos.length;i++){//PRIMERA DIMENSION FILAS GRUPOS
             for (int j = 0; j < aiGrupos[i].length;j++){//SEGUNDA DIMENSION, PARA CADA GRUPO, CUANTOS ALUMNOS
                 System.out.print("[" + "]");
        }
        System.out.println("");
        }
   }
}

