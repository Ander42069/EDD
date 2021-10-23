/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_copia_objetos;

/**
 *
 * @author Perla
 */
public class EVA1_7_COPIA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Dos varibles del mismo objeto
        Prueba obj1 = new Prueba();
        System.out.println(obj1);
        Prueba obj2 = obj1;
        System.out.println(obj2);
        System.out.println("Valor de la x = " + obj1.x);
        obj2.x++;
        System.out.println("Valor de la x = " + obj1.x);
    }
    
}

class Prueba{
    int x = 10;
}
