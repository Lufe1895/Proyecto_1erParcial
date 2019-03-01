/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomios;

/**
 *
 * @author luisl
 */
public class Nodo {
    private Monomio monomio;
    private Nodo siguiente;
    
    public Nodo(Monomio monomio){
        this.monomio=monomio;
        siguiente=null;
    }
    
    @Override
    public String toString(){
        return monomio.toString();
    }

    /**
     * @return the monomio
     */
    public Monomio getMonomio() {
        return monomio;
    }

    /**
     * @param monomio the monomio to set
     */
    public void setMonomio(Monomio monomio) {
        this.monomio = monomio;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
