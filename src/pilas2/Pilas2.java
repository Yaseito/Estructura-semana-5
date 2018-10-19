/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas2;

import java.util.ArrayList;

/**
 *
 * @author Familia_Borja_Li
 */
public class Pilas2 {

    class Nodo {

        int info;
    }
    private int tope = 0;
    private int nCantidadElementos = 15;
    public ArrayList<Nodo> Pila = new ArrayList<Nodo>();

    public int getTope() {
        return this.tope;
    }

    public int getCantidadElementos() {
        return this.nCantidadElementos;
    }

    private void AumentarTope() {
        this.tope++;
    }

    private void DisminuirTope() {
        this.tope--;
    }

    public void push(int dato) {

        if (this.tope < this.nCantidadElementos) {
            Nodo onodo = new Nodo();
            onodo.info = dato;
            Pila.add(onodo);
            this.AumentarTope();
            onodo = null;
        } else {
            System.out.println("La Pila esta llena");
        }

    }

    public void pop() {
        if (this.tope > 0) {
            Pila.remove(this.tope - 1);
            this.DisminuirTope();
        } else {
            System.out.println("La Pila esta vacia.");
        }
    }

    public int GetDatoPila(int posicion) {
        Nodo onodo = new Nodo();
        onodo = Pila.get(posicion);
        return onodo.info;
    }

    public void Almacenar_Cadena_Pila(String ls_cadena) {
        for (int i = 0; i < ls_cadena.length(); i++) {
            Nodo onodo = new Nodo();
            onodo.info = (int) (ls_cadena.charAt(i));
            Pila.add(onodo);
            this.AumentarTope();
            onodo = null;
        }
    }

    public void imprimir_pila() {
        System.out.println("ED - PILAS");
        int tope = this.getTope();
        for (int i = tope; i > 0; i--) {

            System.out.println("[" + i + "] ---- > Dato :" + GetDatoPila(i - 1));
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pilas2 pila = new Pilas2();

        String cadena = "123456";
        pila.Almacenar_Cadena_Pila(cadena);
        pila.imprimir_pila();

        Pilas2 pila1 = new Pilas2();

        cadena = "18910Y";
        pila1.Almacenar_Cadena_Pila(cadena);
        pila1.imprimir_pila();

        Pilas2 pila3 = new Pilas2();

        for (int i = 0; i < pila.getTope(); i++) {
            pila3.push(pila.GetDatoPila(i));
        }
        for (int i = 0; i < pila1.getTope(); i++) {
            pila3.push(pila1.GetDatoPila(i));
            
        }
        pila3.imprimir_pila();
    }

}
