
package cl.duoc.poo.modelo;

import cl.duoc.poo.controlador.Cobro;

/**
 *
 * @author Leoanrdo Ulloa
 */
public class Refrigerado extends Contenedor {
  
    //Atributos
    private int tempActual;
    private int tempMaxima;
    private int tempMinina;

    public Refrigerado(int tempActual, int tempMinina, int tempMaxima, int numeroSerie, double pesoMercaderia, String paisOrigen, String rutCliente, int codigoDimensiones, int precio) {
        super(numeroSerie, pesoMercaderia, paisOrigen, rutCliente, codigoDimensiones, precio);
        this.tempActual = tempActual;
        this.tempMinina = tempMinina;
        this.tempMaxima = tempMaxima;
    }

    @Override
    public String toString() {
        return super.toString()+"Refrigerado{" + "tempActual=" + tempActual + ", tempMaxima=" + tempMaxima + ", tempMinina=" + tempMinina + '}';
    }
    
    

    public int getTempActual() {
        return tempActual;
    }

    public void setTempActual(int tempActual) {
        this.tempActual = tempActual;
    }

    public int getTempMaxima() {
        return tempMaxima;
    }

    public void setTempMaxima(int tempMaxima) {
        this.tempMaxima = tempMaxima;
    }

    public int getTempMinina() {
        return tempMinina;
    }

    public void setTempMinina(int tempMinina) {
        this.tempMinina = tempMinina;
    }
  
}

    