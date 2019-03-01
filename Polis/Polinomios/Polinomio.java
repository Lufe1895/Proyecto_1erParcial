/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polinomios;
import java.util.ArrayList;
import java.lang.Iterable;
/**
 *
 * @author luisl
 */
public class Polinomio {
    private Nodo inicio;
    
    public Polinomio(){
        this.inicio=null;
    }
    
    public void add(Monomio mono){
        Nodo nuevo = new Nodo(mono);
        if(this.isVacia()){
            setInicio(nuevo);
        }
        else{
            nuevo.setSiguiente(getInicio());
            setInicio(nuevo);
        }
    }
    
    private Boolean isVacia(){
        return getInicio()==null;
    }
    
    public void imprimir(){
        Nodo aux=getInicio();
        while(aux!=null){
            System.out.print(aux.toString()+" ");
            aux=aux.getSiguiente();
        }
    }
    
    public void reducir(){
        Nodo aux1=getInicio();
        Nodo aux2,aux2_1;
        while(aux1!=null){
            aux2_1=aux1;
            aux2=aux1.getSiguiente();
            while(aux2!=null){
                if((aux2 != aux1) && (aux1.getMonomio().getExponente() == aux2.getMonomio().getExponente())){
                    aux1.getMonomio().setCoeficiente(aux1.getMonomio().getCoeficiente() + aux2.getMonomio().getCoeficiente());
                    aux2_1.setSiguiente(aux2.getSiguiente());
                    aux2=aux1;
                }
                aux2_1=aux2;
                aux2=aux2.getSiguiente();
            }
            aux1=aux1.getSiguiente();
        }
    }
    /*
    public void sumar(Polinomio otros){
        Nodo aux1=getInicio();
        Nodo aux2;
        while(aux1!=null){
            aux2=otros.getInicio();
            while(aux2!=null){
                if(aux1.getMonomio().getExponente() == aux2.getMonomio().getExponente()){
                    aux1.getMonomio().setCoeficiente(aux1.getMonomio().getCoeficiente() + aux2.getMonomio().getCoeficiente());
                }
                aux2=aux2.getSiguiente();
            }
            aux1=aux1.getSiguiente();
        }
    }
    
    public void restar(Polinomio otros){
        Nodo aux1=getInicio();
        Nodo aux2;
        while(aux1!=null){
            aux2=otros.getInicio();
            while(aux2!=null){
                if(aux1.getMonomio().getExponente() == aux2.getMonomio().getExponente()){
                    aux1.getMonomio().setCoeficiente(aux1.getMonomio().getCoeficiente() - aux2.getMonomio().getCoeficiente());
                }
                aux2=aux2.getSiguiente();
            }
            aux1=aux1.getSiguiente();
        }
    }*/
    
    public void sumar(Polinomio otro){
        Polinomio resultado = new Polinomio();
        Nodo aux1=getInicio();
        Nodo aux2;
        
        while(aux1!=null){
            aux2=otro.getInicio();
            while(aux2!=null){
                if(aux1.getMonomio().getExponente() == aux2.getMonomio().getExponente()){
                    //aux1.getMonomio().setCoeficiente(aux1.getMonomio().getCoeficiente() - aux2.getMonomio().getCoeficiente());
                    resultado.add(new Monomio(aux1.getMonomio().getCoeficiente() + aux2.getMonomio().getCoeficiente(),aux1.getMonomio().getExponente()));
                }
                aux2=aux2.getSiguiente();
            }
            aux1=aux1.getSiguiente();
        }
        
        aux1=getInicio();
        aux2=otro.getInicio();
        
        while(aux1!=null){
            if(resultado.comprobar(aux1.getMonomio())){
                resultado.add(new Monomio(aux1.getMonomio().getCoeficiente(),aux1.getMonomio().getExponente()));
            }
            aux1=aux1.getSiguiente();
        }
        
        while(aux2!=null){
            if(resultado.comprobar(aux2.getMonomio())){
                resultado.add(new Monomio(aux2.getMonomio().getCoeficiente(),aux2.getMonomio().getExponente()));
            }
            aux2=aux2.getSiguiente();
        }
        
        
        resultado.reducir();
        resultado.imprimir();
    }
    
    public void restar(Polinomio otro){
        Polinomio resultado = new Polinomio();
        Nodo aux1=getInicio();
        Nodo aux2;
        
        while(aux1!=null){
            aux2=otro.getInicio();
            while(aux2!=null){
                if(aux1.getMonomio().getExponente() == aux2.getMonomio().getExponente()){
                    //aux1.getMonomio().setCoeficiente(aux1.getMonomio().getCoeficiente() - aux2.getMonomio().getCoeficiente());
                    resultado.add(new Monomio(aux1.getMonomio().getCoeficiente() - aux2.getMonomio().getCoeficiente(),aux1.getMonomio().getExponente()));
                }
                aux2=aux2.getSiguiente();
            }
            aux1=aux1.getSiguiente();
        }
        
        aux1=getInicio();
        aux2=otro.getInicio();
        
        while(aux1!=null){
            if(resultado.comprobar(aux1.getMonomio())){
                resultado.add(new Monomio(aux1.getMonomio().getCoeficiente(),aux1.getMonomio().getExponente()));
            }
            aux1=aux1.getSiguiente();
        }
        
        while(aux2!=null){
            if(resultado.comprobar(aux2.getMonomio())){
                resultado.add(new Monomio(aux2.getMonomio().getCoeficiente()*-1,aux2.getMonomio().getExponente()));
            }
            aux2=aux2.getSiguiente();
        }
        
        
        resultado.reducir();
        resultado.imprimir();
    }
    
    public void multiplicar(Polinomio otro){
        Polinomio resultado = new Polinomio();
        
        Nodo aux1=getInicio();
        Nodo aux2;
        
        while(aux1!=null){
            aux2=otro.getInicio();
            while(aux2!=null){
                resultado.add(new Monomio(aux1.getMonomio().getCoeficiente()*aux2.getMonomio().getCoeficiente(),aux1.getMonomio().getExponente()+aux2.getMonomio().getExponente()));
                aux2=aux2.getSiguiente();
            }
            aux1=aux1.getSiguiente();
        }
        
        resultado.reducir();
        resultado.imprimir();
        
    }
    
    public Boolean comprobar(Monomio monomio){
        Nodo aux=getInicio();
        while((aux!=null) && (monomio.getExponente()!=aux.getMonomio().getExponente())){
            aux=aux.getSiguiente();
        }
        return aux == null;
        
    }    

    /**
     * @return the inicio
     */
    public Nodo getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }
    
    
}
