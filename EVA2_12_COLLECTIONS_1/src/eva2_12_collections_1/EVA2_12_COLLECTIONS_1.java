/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_collections_1;

import java.util.LinkedList;

/**
 *
 * @author Perla
 */
public class EVA2_12_COLLECTIONS_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //lista enlazada --> LinkedList
        LinkedList<Integer> linkedList = new LinkedList();
        //SIMPLE? -->
        //DOBLE? <--> JAVA
        /*<> Tipos de datos genéricos*/
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.add(400);
        linkedList.add(500);
        linkedList.add(600);
        linkedList.add(700);
        System.out.println(linkedList);
        System.out.println(linkedList.get(4));
        linkedList.remove(4);
        System.out.println(linkedList);
        linkedList.clear();
        System.out.println(linkedList);
    }
    
}
