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
public class Taxi extends Pasajero {
    private Integer aniosConcesion;
    
    public Taxi(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer noPasajeros,Integer anios) {
        super(placa, noSerie, marca, modelo, valorFactura, noPasajeros);
        this.aniosConcesion=anios;
    }
    
    public String toString(){
        return String.format("Placa: %s\nN\u00famero de serie: %s\nMarca: %s\nModelo: %d\nValor factura: $%f\nN\u00famero de pasajeros: %d\nA\u00f1os de concesi\u00f3n: %d",
                super.getPlaca(),
                this.getNoSerie(),
                this.getMarca(),
                this.getModelo(),
                this.getValorFactura(),
                this.getNoPasajeros(),
                this.getAniosConcesion());
    }

    @Override
    public double calcularTenencia() {
        return super.calcularTenencia()*(1+(this.getNoPasajeros()/10.0));
    }

    
    /**
     * @return the aniosConcesion
     */
    public Integer getAniosConcesion() {
        return aniosConcesion;
    }

    /**
     * @param aniosConcesion the aniosConcesion to set
     */
    public void setAniosConcesion(Integer aniosConcesion) {
        this.aniosConcesion = aniosConcesion;
    }
    
}