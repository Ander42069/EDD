
package comparara;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Edgar Anderson
 */
public class COMPARARA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] iArreglo = new int[10];
        int[] iArreglo2 = new int[10];
        int i, j;
        for (i = 0; i < iArreglo.length ; i++) {
            System.out.println("Ingresa los valores de tu primer arreglo: ");
            int valor1 = input.nextInt();
            iArreglo[i]=valor1;
        }

        for (j=0; j<iArreglo2.length; j++){
            System.out.println("Ingresa los valores de tu segundo arreglo: ");
            int valor2 = input.nextInt();
            iArreglo2[j]=valor2;
        }
 
        System.out.println("Primer arreglo:");
        for (i = 0; i< iArreglo.length; i++) {
            System.out.print("[" + iArreglo[i] + "]");
        }
        System.out.println("");

        System.out.println("Segundo arreglo: ");
        for (j = 0; j<iArreglo2.length;j++){
            System.out.print("[" + iArreglo2[j] + "]");
        }

        System.out.println("");
        if (Arrays.equals(iArreglo,iArreglo2)){
            System.out.println("Los arreglos son idénticos");
        }else{
            System.out.println("No son iguales");
        }
      }
    }
    

