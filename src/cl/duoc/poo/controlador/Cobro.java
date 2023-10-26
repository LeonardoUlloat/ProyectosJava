package cl.duoc.poo.controlador;

import cl.duoc.poo.interfaz.Icalculable;
import cl.duoc.poo.modelo.Contenedor;
import cl.duoc.poo.modelo.Mercaderia;
import cl.duoc.poo.modelo.Refrigerado;

/**
 *
 * @author Leoanrdo Ulloa
 */
public class Cobro implements Icalculable {

    private Contenedor contenedor;
    private String codigo;
    private int totalCobrar;

    // constructor sin parametros
    public Cobro() {
    }

    // constructor con parametros
    public Cobro(Contenedor contenedor, String codigo) {
        this.contenedor = contenedor;
        this.codigo = codigo;
        calcularTotalCobro();
    }

    @Override
    public String toString() {
        return "Cobro{" + "contenedor=" + contenedor.toString() + ", codigo=" + codigo + ", totalCobrar=" + totalCobrar + '}';
    }
    
    

    //accesadores y mutadores
    public Contenedor getContenedor() {
        return contenedor;
    }

    public void setContenedor(Contenedor contenedor) {
        this.contenedor = contenedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTotalCobrar() {
        return totalCobrar;
    }

    public void setTotalCobrar(int totalCobrar) {
        this.totalCobrar = totalCobrar;
    }

    @Override
    public double calcularRecargo(Object tic) {

        double recargo = 0;

        if ((tic != null) && (tic instanceof Refrigerado)) {

            Refrigerado temporal = (Refrigerado) tic;

            recargo = temporal.getPrecio() * Icalculable.CONTENEDOR_REFRIGERADO;

        }

        if ((tic != null) && (tic instanceof Mercaderia)) {
            Mercaderia temporal = (Mercaderia) tic;

            recargo = temporal.getPrecio() * Icalculable.CONTENEDOR_MERCADERIA;
        }

        return recargo;
    }

    @Override
    public void calcularTotalCobro() {
        
        int total = 0;
        
        total = (int)(calcularRecargo(contenedor));
        
        this.setTotalCobrar(total);
    }

}
