/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_usando_arreglos;

/**
 *
 * @author Perla
 */
public class EVA1_9_USANDO_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1. UN ARREGLO DE ENTEROS
        int[] aiDatos = new int[10];//ocupa 40 bytes en el heap
        //2. LLENAR CON VALORES
        //Arreglo: estructura de acceso aleatorio
        //indice: 
        // Primer elemento del arreglo: posicion 0
        // Ultimo elemento del arreglo: posicion N - 1 (N es el tamaño del arreglo)
        //ACCESO A LOS VALORES: 
        for(int i = 0; i < 10; i++){
            aiDatos[i] = (int)(Math.random() * 100); //Random --> valores entre 0.0 y 1.0 x 100 (valores entre 0 y 100)
        }
        //3. IMPRIMIR LOS VALORES
        for(int i = 0; i < 10; i++){
            System.out.print("[" + aiDatos[i] + "]");
    }
    
}
}