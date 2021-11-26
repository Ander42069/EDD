package eva2_7_lista_simple;

/**
 *
 * @author Perla
 */
public class Lista { //LISTA SIMPLEMENTE ENLAZADA (LINKED LIST)
    private Nodo inicio;//ACCESO A MI LISTA, PUNTO DE PARTIDA
    private Nodo fin;
    private int tama;//contador de nodos
    
    public Lista(){
        inicio = null; //LISTA VACIA
        fin = null;
        tama = 0;
    }
    
    //AGREGAR NODOS
    public void add(int valor){//O(1)
        Nodo nuevo = new Nodo(valor);
        
        //HAY NODOS EN LA LISTA?
        if(inicio == null){ //LISTA VACIA
            inicio = nuevo; //conectamos el primer nodo a la lista
            fin = nuevo;//conectamos el primer nodo a la lista
        }else{ //LISTA CON NODOS
            
             //HAY QUE MOVERNOS AL FINAL DE LA LISTA O(N)
             //USANDO TEMP, NODO POR NODO HASTA LLEGAR AL FINAL
             /*Nodo temp = inicio;//aqui empezamos
             //WHILE
             while(temp.getSiguiente() != null){//MIENTRAS TEMP.GETSIGUIENTE != NULL NOS VAMOS A MOVER
                 temp = temp.getSiguiente();//mover temp al siguiente nodo  
             }
             temp.setSiguiente(nuevo);*/
             
             //conectamos al final de la lista al nuevo nodo
             fin.setSiguiente(nuevo);
             fin = nuevo;//NOS MOVEMOS AL FINAL DE LA LISTA
        }
        tama++;
    }
    //IMPRIMIR LA LISTA 
    public void printList(){//O(N)
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while(temp != null){//MIENTRAS TEMP != NULL NOS VAMOS A MOVER
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
    }
    //BORRAR LA LISTA   O(1)
    public void clear(){//borramos todos los nodos de la Lista
        inicio = null;
        fin = null;
        tama = 0;
    }
    
    //CONTAR TODOS LOS NODOS:
    public int length(){ //O(1)
        /*int iCont = 0; //O(N)
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while(temp != null){//MIENTRAS TEMP != NULL NOS VAMOS A MOVER
            iCont++;
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }*/
        //return iCont;
        return tama;
    }
    
    //LA LISTA ESTA VACIA: TRUE, CON NODOS: FALSE   
    public boolean isEmpty(){
        if(inicio == null)
            return true;
        else
            return false;
    }
    
    //RECUPERAR UN VALOR DE LA LISTA:
    public int get(int pos) throws Exception{//O(N)
        //VERIFICACION
        if(isEmpty()){//LISTA VACIA
            throw new Exception("No hay valores almacenados en la lista!!");
        }else{//POSICION QUE NO EXISTA: POSICION NEGATIVA O QUE NOS PASEMOS
            //pos tiene que estar entre cero y N-1 --> N es el tamaño (length)
            if((pos < 0) || (pos >= length()))//si pos es menor a cero 0 pos es mayor o igual a N
                throw new Exception("El valor " + pos +" no es una posicion valida en la lista!!");
        }
        
         Nodo temp = inicio;
         for(int i = 0; i < pos; i++){
             temp = temp.getSiguiente();//mover temp al siguiente nodo
         }
         return temp.getDato();
    }   
    
    private void insertAtBegging(Nodo nuevo){   //O(1)
        nuevo.setSiguiente(inicio);//PRIMERO CONECTAMOS EL NUEVO NODO A LA LISTA
        inicio = nuevo;           //CONECTAR LA LISTA AL NUEVO NODO
    }
    
    public void insertAt(int pos, int valor){//O(N)
        Nodo nuevo = new Nodo(valor);
        //VALIDAR
        //SITUACIONES:
        //INSERTAR AL INICIO
        if(pos == 0){
            insertAtBegging(nuevo);
        }else{//CUALQUIER OTRO CASO(nodos intermedios)
             //MOVERNOS AL NODO PREVIO A LA POSICION
            Nodo temp = inicio;
            for(int i = 0; i < (pos - 1); i++){
                temp = temp.getSiguiente();//mover temp al siguiente nodo
         }
             //RECONECCION
             //primero conectamos el nuevo nodo
            nuevo.setSiguiente(temp.getSiguiente());
             //conectamos la lista al nuevo nodo
            temp.setSiguiente(nuevo);
        }
        tama++;
    }
    
    public void deleteAt(int pos){//O(1)
        int iTamaLista = length();//obtengo el tamaño de la lista
        //VALIDAR
        if(iTamaLista == 1){
            clear();
        }else{
            //SITUACIONES
            if(pos == 0){//BORRAR NODO AL INICIO
                inicio = inicio.getSiguiente();
            }else{//CUALQUIER OTRO CASO(nodos intermedios)
                 //MOVERNOS AL NODO PREVIO A LA POSICION
                Nodo temp = inicio;
                for(int i = 0; i < (pos - 1); i++){
                 temp = temp.getSiguiente();//mover temp al siguiente nodo
                }
                //RECONECCIÓN
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if(pos == (iTamaLista - 1))//verifico si es el ultimo nodo de la lista
                    fin = temp;
        }
            tama--;
   }
 }
}