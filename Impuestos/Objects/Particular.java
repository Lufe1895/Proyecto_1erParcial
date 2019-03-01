/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author luisl
 */
public class Particular extends Pasajero{

    public Particular(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer noPasajeros) {
        super(placa, noSerie, marca, modelo, valorFactura, noPasajeros);
    }
    
    public String toString(){
        return String.format("Placa: %s\nN\u00famero de serie: %s\nMarca: %s\nModelo: %d\nValor factura: $%f\nN\u00famero de pasajeros: %d",
                super.getPlaca(),
                this.getNoSerie(),
                this.getMarca(),
                this.getModelo(),
                this.getValorFactura(),
                this.getNoPasajeros());
    }
    
}