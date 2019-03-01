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
public class Camioneta extends Carga {

    public Camioneta(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer toneladas, boolean publico) {
        super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
    }
    
    public String toString(){
        return String.format("Placa: %s\nN\u00famero de serie: %s\nMarca: %s\nModelo: %d\nValor factura: $%f\nToneladas: %d\nP\u00fablico: %b",
                super.getPlaca(),
                this.getNoSerie(),
                this.getMarca(),
                this.getModelo(),
                this.getValorFactura(),
                this.getToneladas(),
                this.isPublico());
    }
    
}