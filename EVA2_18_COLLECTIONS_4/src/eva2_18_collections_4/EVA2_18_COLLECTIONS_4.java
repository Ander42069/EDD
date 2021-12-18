/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_18_collections_4;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Perla
 */
public class EVA2_18_COLLECTIONS_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CONJUNTOS: MATEMATICAS DISCRETAS -> NO TIENE ELEMENTOS REPETIDOS
        Set<Integer> conjunto = new LinkedHashSet<>();
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        conjunto.add(400);
        conjunto.add(100);
        conjunto.add(200);
        conjunto.add(300);
        System.out.println(conjunto);
    }
    
}
