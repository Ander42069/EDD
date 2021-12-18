/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_arbol_b;

/**
 *
 * @author Perla
 */
public class Nodo {
    private int dato;
    private Nodo derecha;//REFERENCIA
    private Nodo izquierda;
    
    //constructores
    public Nodo(){//default
        this.derecha = null;
        this.izquierda = null;
    }
    public Nodo(int dato){
        this.dato = dato;
        this.derecha = null;
        this.izquierda = null;
    }
    //get y set
    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }
    public Nodo getDerecha() {
        return derecha;
    }
    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    public Nodo getIzquierda() {
        return izquierda;
    }
    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }  
}
