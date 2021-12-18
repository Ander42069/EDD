/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_8_lista_doble;

/**
 *
 * @author Perla
 */
public class Nodo {
    private int dato;
    private Nodo siguiente;//REFERENCIA
    private Nodo previo;
    
    //constructores
    public Nodo(){//default
        this.siguiente = null;
        this.previo = null;
    }
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
        this.previo = null;
    }
    //get y set
    public int getDato(){
        return dato;
    }
    public void setDato(int dato){
        this.dato = dato;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }

    public Nodo getPrevio() {
        return previo;
    }

    public void setPrevio(Nodo previo) {
        this.previo = previo;
    }
    
}
