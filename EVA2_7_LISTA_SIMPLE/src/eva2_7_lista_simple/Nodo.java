package eva2_7_lista_simple;

/**
 *
 * @author Edgar Anderson
 */
public class Nodo {
    private int dato;
    private Nodo siguiente;//REFERENCIA
    
    //constructores
    public Nodo(){//default
        this.siguiente = null;
    }
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
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
}
