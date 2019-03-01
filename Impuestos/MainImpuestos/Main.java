/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainImpuestos;

import Coleccion.MyArrayList;
import Objects.Camion;
import Objects.Camioneta;
import Objects.Particular;
import Objects.Taxi;
import Objects.Vehiculo;

/**
 *
 * @author luisl
 */
public class Main {
    public static void main(String[] args) {
      
        MyArrayList vehiculos= new MyArrayList();
        vehiculos.add(new Camioneta("tjk9","dnujic7", "HONDA", 2012,290000.0,5,true));
        vehiculos.add(new Taxi("tjk8","dnujic8", "HONDA", 2012,290000.0,5,10));
        vehiculos.add(new Particular("tjk7","dnujic7", "HONDA", 2012,290000.0,5));
        vehiculos.add(new Camion("tjk9","dnujic5", "HONDA", 2012,290000.0,5,true,3));
        vehiculos.add(new Camion("tjk0","dnujic9", "HOND", 2012,290000.0,5,true,3));
        
        for(Vehiculo vehiculo:vehiculos){
            System.out.println(vehiculo.toString());
            System.out.println("\n");
        }
        
        for(Vehiculo vehiculo:vehiculos){
            System.out.println(vehiculo.getPlaca());
        }
        System.out.println("");
        for(Vehiculo vehiculo:vehiculos){
            System.out.println(vehiculo.getMarca());
        }
        System.out.println("");
        for(Vehiculo vehiculo:vehiculos){
            System.out.println(vehiculo.getModelo());
        }
        System.out.println("");
        for(Vehiculo vehiculo:vehiculos){
            System.out.println(vehiculo.getValorFactura());
        }
    }
}
