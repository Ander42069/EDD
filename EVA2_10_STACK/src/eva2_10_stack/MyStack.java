/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_10_stack;

/**
 *
 * @author Perla
 */
public class MyStack extends Lista{
    
    public int peek(int pos) throws Exception{
        return get(length() - 1);
    }
    
    public int pop(int pos) throws Exception{
        int temp = get(length() - 1);
        deleteAt(length() - 1);
        return temp;
    }
    
    /*public int peek(int pos) throws Exception {
        int iTamaLis = length();
        
        if (iTamaLis == 0)
            throw new Exception("No hay valores almacenados en la lista!!");
        return get(pos - 1);
    }
    
    public int pop(int pos) throws Exception{
        int iVal = get(pos - 1);
        deleteAt(pos - 1);
        return iVal;
    }*/

}
