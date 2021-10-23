/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Perla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiClase obj = new MiClase();
        System.out.println(obj);
        //ELIMINAMOS EL OBJETO
        obj = null;
        System.out.println(obj);
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
