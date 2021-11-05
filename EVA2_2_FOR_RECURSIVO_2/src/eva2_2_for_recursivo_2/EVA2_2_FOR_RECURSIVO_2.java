package eva2_2_for_recursivo_2;

/**
 *
 * @author Perla
 */
public class EVA2_2_FOR_RECURSIVO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fakeForDown(5);
    }
    
    public static void fakeForDown(int iVal){
        System.out.print(iVal + " - ");
        if(iVal > 1){
        fakeForDown(iVal - 1); //ESTO ES LO QUE DEBEMOS CONTROLAR
        }
    }
}
