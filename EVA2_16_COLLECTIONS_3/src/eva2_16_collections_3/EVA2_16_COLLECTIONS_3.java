/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_collections_3;

import java.util.ArrayList;

/**
 *
 * @author Perla
 */
public class EVA2_16_COLLECTIONS_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //MUY SIMILAR A UN LINKEDLIST, PERO TRABAJA CON ARREGLOS:
        //MEJOR PARA ALMACENAR 
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        System.out.println(arrayList);
        System.out.println(arrayList.get(4));
        arrayList.remove(4);
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("[" + arrayList.get(i) + "]");
        }
    }
    
}
