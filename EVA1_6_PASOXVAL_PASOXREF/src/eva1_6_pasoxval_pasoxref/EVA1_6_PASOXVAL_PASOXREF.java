/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_pasoxval_pasoxref;

/**
 *
 * @author Perla
 */
public class EVA1_6_PASOXVAL_PASOXREF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valOrig = 5;
        //PASO POR VALOR
        System.out.println("ValOri en el main = " + valOrig);
        incrementa(valOrig);
        //valOrig = incrementaFuncional(valOrig);
        System.out.println("ValOrig despues de llamar a incrementa = " + valOrig);
        

        //DEMOSTRACION DE PASO POR REFERENCIA
        Prueba objPrueba = new Prueba();
        System.out.println("Valor de la x = " + objPrueba.x);
        System.out.println("ObjPrueba en el main = " + objPrueba);
        incrementaObj(objPrueba);
        System.out.println("Valor de la x despues de incrementa = " + objPrueba.x);
    }
    //PASO POR VALOR --> PASAMOS UNA COPIA DEL VALOR EN UNA VARIABLE (VARIABLES LOCALES PRIMITIVOS)
    public static void incrementa(int val){
        val++;//incremento en uno = val + 1; val +=1;
        System.out.println("VALOR EN INCREMENTA = " + val);
    }
    public static int incrementaFuncional(int val){
        val++;
        return val; 
    }
    //PASO POR REFERENCIA --> PASAN LA DIRECCION EN MEMORIA DEL OBJETO (OBJETOS)
    public static void incrementaObj(Prueba val){
        System.out.println("ObjPrueba en el main = " + val);
        val.x++;
    }
}

class Prueba{
    public int x = 10;
}
