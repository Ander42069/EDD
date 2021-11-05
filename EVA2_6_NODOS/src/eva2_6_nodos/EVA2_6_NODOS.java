package eva2_6_nodos;

/**
 *
 * @author Perla
 */
public class EVA2_6_NODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo inicio = new Nodo();
        inicio.datos = 100;
        inicio.referencia = new Nodo();
        inicio.referencia.datos = 200;
        inicio.referencia.referencia = null;
        System.out.println(inicio);
        System.out.println(inicio.referencia);
        System.out.println(inicio.datos);
        System.out.println(inicio.referencia.datos);
    }
    
}

class Nodo {
    int datos;//DATOS (AQUI GUARDAMOS LA INFORMACION)
    Nodo referencia;//REFERENCIA: NOS PERMITE ENLAZAR NODOS, Y CREAR CADENAS (LISTAS)
}
