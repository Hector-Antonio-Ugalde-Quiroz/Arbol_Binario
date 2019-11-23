/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolbinario;

/**
 *
 * @author heuga
 */
public class ArbolBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arbol a1 = new Arbol(23);
        a1.agregar(new Nodo(14), a1.getRaiz());
        a1.agregar(new Nodo(9), a1.getRaiz());
        a1.agregar(new Nodo(2), a1.getRaiz());
        a1.agregar(new Nodo(10), a1.getRaiz());
        a1.agregar(new Nodo(16), a1.getRaiz());
        a1.agregar(new Nodo(15), a1.getRaiz());
        a1.agregar(new Nodo(20), a1.getRaiz());
        a1.agregar(new Nodo(50), a1.getRaiz());
        a1.agregar(new Nodo(31), a1.getRaiz());
        a1.agregar(new Nodo(51), a1.getRaiz());
        a1.recorrerPreorden(a1.getRaiz());

    }

}
