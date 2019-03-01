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
public class Monomio {
    private Integer coeficiente;
    private Integer exponente;
    
    private static Character variable='x';
    
    public Monomio(int coeficiente,int exponente){
        this.coeficiente=coeficiente;
        this.exponente=exponente;
    }

    /**
     * @return the coeficiente
     */
    public Integer getCoeficiente() {
        return coeficiente;
    }

    /**
     * @param coeficiente the coeficiente to set
     */
    public void setCoeficiente(Integer coeficiente) {
        this.coeficiente = coeficiente;
    }

    /**
     * @return the exponente
     */
    public Integer getExponente() {
        return exponente;
    }

    /**
     * @param exponente the exponente to set
     */
    public void setExponente(Integer exponente) {
        this.exponente = exponente;
    }

    /**
     * @return the variable
     */
    public static Character getVariable() {
        return variable;
    }

    /**
     * @param aVariable the variable to set
     */
    public static void setVariable(Character aVariable) {
        variable = aVariable;
    }
    
    @Override
    public String toString(){
        if(coeficiente>0){
            return String.format("+%d%c^%d",coeficiente,variable,exponente);
        }else if(coeficiente < 0){
            return String.format("%d%c^%d",coeficiente,variable,exponente);
        }else if(coeficiente == 1){
            return String.format("%c^%d",variable,exponente);
        }else {
            return String.format("");
        }
    }
    
    public Boolean isSemejante(Monomio otro){
        return this.getExponente() == otro.getExponente();
    }
}
