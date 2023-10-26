package cl.duoc.poo.modelo;

import cl.duoc.poo.controlador.Cobro;

/**
 *
 * @author sebas
 */
public class Mercaderia extends Contenedor {

    //Atributos
    private boolean resistenciaExtra;
    private String tipoContenido;

    public Mercaderia(boolean resistenciaExtra, String tipoContenido, int numeroSerie, double pesoMercaderia, String paisOrigen, String rutCliente, int codigoDimensiones, int precio) {
        super(numeroSerie, pesoMercaderia, paisOrigen, rutCliente, codigoDimensiones, precio);
        this.resistenciaExtra = resistenciaExtra;
        this.tipoContenido = tipoContenido;
    }

    @Override
    public String toString() {
        return super.toString() + "Mercaderia{" + "resistenciaExtra=" + resistenciaExtra + ", tipoContenido=" + tipoContenido + '}';
    }

    public boolean isResistenciaExtra() {
        return resistenciaExtra;
    }

    public void setResistenciaExtra(boolean resistenciaExtra) {
        this.resistenciaExtra = resistenciaExtra;
    }

    public String getTipoContenido() {
        String resultado = "";
        switch (this.tipoContenido) {
            case "F":
                resultado = "Frágil";
                break;
            case "E":
                resultado = "Electroidomésticos";
                break;
            case "P":
                resultado = "Plásticos";
                break;
        }
        return resultado;
    }

    public void setTipoContenido(String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

}
