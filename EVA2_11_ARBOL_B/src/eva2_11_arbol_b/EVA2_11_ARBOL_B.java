/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_arbol_b;

/**
 *
 * @author Perla
 */
public class EVA2_11_ARBOL_B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario arbolB = new ArbolBinario();
        arbolB.add(13);
        arbolB.add(10);
        arbolB.add(18);
        arbolB.add(2);
        arbolB.add(11);
        arbolB.add(17);
        arbolB.add(10);
        arbolB.add(16);
        //pre order
        System.out.println("PRE ORDER:");
        arbolB.printPreOrder();
        System.out.println("");
        System.out.println("POST ORDER:");
        arbolB.printPostOrder();
        System.out.println("");
        System.out.println("IN ORDER:");
        arbolB.printInOrder();
    }
}
