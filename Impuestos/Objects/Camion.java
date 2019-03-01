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
public class Camion extends Carga {

    private Integer ejes;
    public Camion(String placa, String noSerie, String marca, Integer modelo, double valorFactura, Integer toneladas, boolean publico,Integer ejes) {
        super(placa, noSerie, marca, modelo, valorFactura, toneladas, publico);
        this.ejes=ejes;
    }

    @Override
    public double calcularBaseGravable() {
        return super.calcularBaseGravable()*(1+(this.ejes*0.01));
    }

    public String toString(){
        return String.format("Placa: %s\nN\u00famero de serie: %s\nMarca: %s\nModelo: %d\nValor factura: $%f\nToneladas: %d\nP\u00fablico: %b\nEjes: %d",
                super.getPlaca(),
                this.getNoSerie(),
                this.getMarca(),
                this.getModelo(),
                this.getValorFactura(),
                this.getToneladas(),
                this.isPublico(),
                this.getEjes());
    }
    
    public Integer getEjes() {
        return ejes;
    }

    public void setEjes(Integer ejes) {
        this.ejes = ejes;
    }
    
}