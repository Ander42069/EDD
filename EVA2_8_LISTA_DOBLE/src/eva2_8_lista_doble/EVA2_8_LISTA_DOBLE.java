/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_lista_doble;

/**
 *
 * @author Perla
 */
public class EVA2_8_LISTA_DOBLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listaDoble = new ListaDoble();
        listaDoble.add(100);
        listaDoble.add(200);
        listaDoble.add(300);
        listaDoble.add(400);
        listaDoble.add(500);
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.printList();
        listaDoble.insertAt(0, 0);
        System.out.println("");
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.printList();
        listaDoble.insertAt(3, -1);
        System.out.println("");
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.printList();
        listaDoble.clear();
        System.out.println("");
        System.out.println("Cantidad de nodos: " + listaDoble.length());
        listaDoble.printList();
        
        System.out.println("");
        listaDoble.deleteAt(3);
        listaDoble.printList();
    }
    
}
