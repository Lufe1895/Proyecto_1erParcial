/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolinomioMain;

import Polinomios.Monomio;
import Polinomios.Polinomio;

/**
 *
 * @author luisl
 */
public class Main {
    public static void main(String[] args) {
        Polinomio poli1 = new Polinomio();
        Polinomio poli2 = new Polinomio();
        poli1.add(new Monomio(-2,2));
        poli1.add(new Monomio(-2,2));
        poli1.add(new Monomio(3,3));
        poli1.add(new Monomio(-3,3));
        poli2.add(new Monomio(4,2));
        poli2.add(new Monomio(4,3));
        System.out.print("Polinomio 1: ");
        poli1.imprimir();
        System.out.println("");
        
        System.out.print("Polinomio 1 reducido:");
        poli1.reducir();
        poli1.imprimir();
        
        System.out.println("");
        System.out.print("Polinomio 2: ");
        poli2.imprimir();
        
        System.out.println("");
        
        System.out.print("Los polinomios sumados: ");
        poli1.sumar(poli2);
        
        System.out.println("");
        
        System.out.print("Los polinomios restados: ");
        poli1.restar(poli2);
        
        System.out.println("");
        
        System.out.print("Los polinomios multiplicados: ");
        poli1.multiplicar(poli2);
        
        System.out.println("");
        
              
    }
}