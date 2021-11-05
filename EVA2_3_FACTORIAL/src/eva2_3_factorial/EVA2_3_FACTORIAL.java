
package eva2_3_factorial;

/**
 *
 * @author Perla
 */
public class EVA2_3_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El factorial de 5 es: " + factorial(5));
        System.out.println("El factorial de 3 es: " + factorialFor(3));
        
    }
    
    public static int factorial(int iVal){
        if(iVal == 0)
            return 1;
        else
            return iVal * factorial(iVal - 1);
    }
    
    public static int factorialFor(int iVal){
        int temp = 1;
        for(int i = iVal; i > 0; i--){
            temp = temp * i;
        }
        return temp;
    }
    
}
