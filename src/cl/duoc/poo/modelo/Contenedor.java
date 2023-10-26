
package cl.duoc.poo.modelo;



/**
 *
 * @author Leoanrdo Ulloa
 */
public abstract class Contenedor  {
    
    private int numeroSerie;
    private double pesoMercaderia;
    private String paisOrigen;
    private String rutCliente;
    private int codigoDimensiones;
    private boolean bloqueadoAcceso;
    private int precio;

    
    
    // constructor con parametros

    public Contenedor(int numeroSerie, double pesoMercaderia, String paisOrigen, String rutCliente, int codigoDimensiones, int precio) {
        this.numeroSerie = numeroSerie;
        this.pesoMercaderia = pesoMercaderia;
        this.paisOrigen = paisOrigen;
        this.rutCliente = rutCliente;
        this.codigoDimensiones = codigoDimensiones;
        this.bloqueadoAcceso = false;
        this.precio = precio;

    }

    @Override
    public String toString() {
        return "Contenedor{" + "numeroSerie=" + numeroSerie + ", pesoMercaderia=" + pesoMercaderia + ", paisOrigen=" + paisOrigen + ", rutCliente=" + rutCliente + ", codigoDimensiones=" + codigoDimensiones + ", bloqueadoAcceso=" + bloqueadoAcceso + ", precio=" + precio + '}';
    }
    
    

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPesoMercaderia() {
        return pesoMercaderia;
    }

    public void setPesoMercaderia(double pesoMercaderia) {
        this.pesoMercaderia = pesoMercaderia;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public int getCodigoDimensiones() {
        return codigoDimensiones;
    }

    public void setCodigoDimensiones(int codigoDimensiones) {
        this.codigoDimensiones = codigoDimensiones;
    }

    public boolean isBloqueadoAcceso() {
        return bloqueadoAcceso;
    }

    public void modifcarBloqueo() {
        this.bloqueadoAcceso = !this.bloqueadoAcceso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

        
}
