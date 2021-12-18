/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_9_queue;

/**
 *
 * @author Perla
 */
public class MyQueue extends Lista{
    //COMO LA FILA DEL SUPERMERCADO
    //LOS ELEMENTOS SE AGREGAN AL FINAL DE LA LISTA
    //METODO ADD DE LA LISTA --> SIN CAMBIOS
    //SOLO PODEMOS ACCEDER A LOS ELEMENTOS AL INICIO DE LA LISTA
    public int peek() throws Exception {//REGRESA EL VALOR DEL ELEMENTO AL INICIO DE LA LISTA
        return get(0);
    }
    
    public int poll() throws Exception {//REGRESA Y ELIMINA EL ELEMENTO AL INICIO DE LA LISTA
        //GUARDAR EL VALOR
        int iVal = get(0);
        //ELIMINAMOS EL VALOR
        deleteAt(0);
        //ENVIAMOS EL VALOR
        return iVal;
    }
}
