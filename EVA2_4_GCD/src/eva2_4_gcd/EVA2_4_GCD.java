package eva2_4_gcd;

/**
 *
 * @author Perla
 */
public class EVA2_4_GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El MCD de 180 y 48 es " + gcd(180,48));
    }
    
    public static int gcd(int iDividendo, int iDivisor){
        if(iDivisor == 0)//DETENERNOS
            return iDividendo;
        else{            //RECURSIVIDAD
            int iResi = iDividendo % iDivisor;
            return gcd(iDivisor, iResi);
        }
    }
    
}
