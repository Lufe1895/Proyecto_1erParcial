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
public abstract  class Carga extends Vehiculo {

    private Integer toneladas;
    private boolean publico;
    
    public Carga(String placa, String noSerie, String marca, Integer modelo, double valorFactura,Integer toneladas,boolean publico) {
        super(placa, noSerie, marca, modelo, valorFactura);
        this.toneladas=toneladas;
        this.publico=publico;
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

    @Override
    public double calcularBaseGravable() {
        if(!this.publico){
            return super.calcularBaseGravable();
        }else{
           return this.getModelo()>=2009?0.03:0.01;
        }
    }

    @Override
    public double calcularTenencia() {
        return this.getValorFactura()*(1+this.toneladas/10.0)*calcularBaseGravable();
    }
    
    

    public Integer getToneladas() {
        return toneladas;
    }

    public void setToneladas(Integer toneladas) {
        this.toneladas = toneladas;
    }

    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }
    
}