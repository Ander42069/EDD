/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_arreglo_objetos;

import java.util.Scanner;

/**
 *
 * @author Perla
 */
public class EVA1_21_ARREGLO_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Persona[] aPersonas = new Persona[10];//ARREGLO TAMAÑO 10 QUE ALMACENA OBJETOS DE TIPO PERSONA
        //PARA USAR UN OBJETO, DEBEN CREARLO
        //PARA CREAR UN OBJETO USAN NEW
        //SI NO LO CREAN, NO EXISTE
        for (int i = 0; i < aPersonas.length; i++){
            aPersonas[i] = new Persona();//CREO UN OBJETO DE TIPO PERSONA EN LA POSICION i
            System.out.println("Introduce un nombre: ");
            String nombre = input.nextLine();
            aPersonas[i].setNombre(nombre);
        }
        for (int i = 0; i < aPersonas.length; i++){
            System.out.println("Nombre: " + aPersonas[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}