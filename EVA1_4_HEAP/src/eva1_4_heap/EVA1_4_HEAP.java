/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_heap;

/**
 *
 * @author Perla
 */
public class EVA1_4_HEAP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj.getMensaje());
        System.out.println(obj);//IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP
        MiClase obj2 = new MiClase();
        System.out.println(obj2);//IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP
        EVA1_4_HEAP objHeap = new EVA1_4_HEAP();
        System.out.println(objHeap);//IMPRIMIMOS LA REFERENCIA AL OBJETO EN EL HEAP
    }
    
}

class MiClase{//NUEVO TIPO DE DATO --> TIPO DE DATOS ABSTRACTOS
    String mensaje;//ATRIBUTOS -> ESTADO DEL OBJETO
    public MiClase(){ //METODOS -> COMPORTAMIENTO
        mensaje = "Hola mundo";
    }
    //getter / setter
    public String getMensaje(){
    return mensaje;
    }
    
    public void setMensaje(String mensaje){
    this.mensaje = mensaje;
    }
}
