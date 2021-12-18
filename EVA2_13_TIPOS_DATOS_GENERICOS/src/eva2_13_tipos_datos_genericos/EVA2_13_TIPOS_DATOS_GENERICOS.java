/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_tipos_datos_genericos;

/**
 *
 * @author Perla
 */
public class EVA2_13_TIPOS_DATOS_GENERICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba<Integer> prueba = new Prueba();
        prueba.setValor(100);
        System.out.println(prueba.getValor());
        System.out.println(prueba);
    }
    
}

class Prueba <T>{//TEMPLATE --> PLANTILLA
    private T valor;

    public Prueba() {
    }

    public Prueba(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }
    
    

}