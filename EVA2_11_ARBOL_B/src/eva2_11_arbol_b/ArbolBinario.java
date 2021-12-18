/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_arbol_b;

/**
 *
 * @author Perla
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        this.root = null; //Arbol vacio
    }
    
    //A PARTIR DE AQUI TODO ES RECURSIVO
    //AGREGAR NODO
    public void add(int valor){
        Nodo nuevo = new Nodo(valor);
        //VERIFICACION SI HAY NODOS EN EL ARBOL
        if(root == null){//ARBOL VACIO
            root = nuevo;
        }else{//HAY NODOS
            //metodo recursivo para agregar nodos
            addRecu(root, nuevo);
        }
    }
    
    //metodo recursivo (nodo actual, nodo nuevo)
    private void addRecu(Nodo actual, Nodo nuevo){
        //VERIFICAR EL LADO AL QUE VA EL NODO
        if(nuevo.getDato() < actual.getDato()){//IZQ: NUEVO MENOR QUE NODO ACTUAL
            if(actual.getIzquierda() == null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NODO NUEVO
                actual.setIzquierda(nuevo);
            }else{//Llamar de nuevo al metodo recursivo, pero moviendome a la izquierda
                addRecu(actual.getIzquierda(), nuevo);
            }
        }else if(nuevo.getDato() > actual.getDato()){//DERECHA
            if(actual.getDerecha() == null){//TENEMOS ESPACIO, AQUI INSERTAMOS EL NODO NUEVO
                actual.setDerecha(nuevo);
            }else{//Llamar de nuevo al metodo recursivo, pero moviendome a la derecha
                addRecu(actual.getDerecha(), nuevo);
            }
        }else{//VALOR IGUAL AL ACTUAL
            System.out.println("El valor ya existe en el árbol");
        }
    }
    
        //IMPRIMIR NODOS DEL ARBOL
        public void printPreOrder(){
            preOrder(root);
        }
        
        public void printPostOrder(){
            postOrder(root);
        }
        
        public void printInOrder(){
            inOrder(root);
        }
        
        private void preOrder(Nodo actual){
            if(actual != null){
                System.out.print("[" + actual.getDato() + "]");//Visit node
                preOrder(actual.getIzquierda());//travers left subtree
                preOrder(actual.getDerecha());//travers right subtree
            }
        }
        
        private void postOrder(Nodo actual){
            if(actual != null){
                postOrder(actual.getIzquierda());//travers left subtree
                postOrder(actual.getDerecha());//travers right subtree
                System.out.print("[" + actual.getDato() + "]");//Visit node
            }
        }
         
        private void inOrder(Nodo actual){
            if(actual != null){
                inOrder(actual.getIzquierda());//travers left subtree
                System.out.print("[" + actual.getDato() + "]");//Visit node
                inOrder(actual.getDerecha());//travers right subtree
            }
        }
    }

