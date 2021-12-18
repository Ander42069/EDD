package eva2_10_stack;

/**
 *
 * @author Perla
 */
public class EVA2_10_STACK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack myStack = new MyStack();
        myStack.add(100);
        myStack.add(200);
        myStack.add(300);
        myStack.add(400);
        myStack.add(500);
        myStack.printList();
        try{
        System.out.println("Primer elemento de la fila: " + myStack.peek(100));
        } catch (Exception ex){
            ex.printStackTrace();
        }
        myStack.printList();
        try{
        System.out.println("Primer elemento de la fila: " + myStack.pop(100));
        } catch (Exception ex){
            ex.printStackTrace();
        }
        myStack.printList();
    }
 }
    

