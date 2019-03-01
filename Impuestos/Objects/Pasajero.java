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
public abstract class Pasajero extends Vehiculo {
    private Integer noPasajeros;
    public Pasajero(String placa, String noSerie, String marca, Integer modelo, double valorFactura,Integer noPasajeros){
        super(placa,noSerie,marca,modelo,valorFactura);
        this.noPasajeros=noPasajeros;
    }

    /**
     * @return the noPasajeros
     */
    public Integer getNoPasajeros() {
        return noPasajeros;
    }

    /**
     * @param noPasajeros the noPasajeros to set
     */
    public void setNoPasajeros(Integer noPasajeros) {
        this.noPasajeros = noPasajeros;
    }
    
    @Override
    public String toString(){
        return String.format("Placa: %s\nN\u00famero de serie: %s\nMarca: %s\nModelo: %d\nValor factura: $%f\nN\u00famero de pasajeros: %d",
                super.getPlaca(),
                this.getNoSerie(),
                this.getMarca(),
                this.getModelo(),
                this.getValorFactura(),
                this.getNoPasajeros());
    }

    @Override
    public double calcularTenencia() {
        return this.getValorFactura()*calcularBaseGravable();
    }
    
}