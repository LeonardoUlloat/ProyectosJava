
package cl.duoc.poo.interfaz;

/**
 *
 * @author Leoanrdo Ulloa
 */
public interface Icalculable {
    
    public static final double CONTENEDOR_REFRIGERADO = 1.15; // 15%
    
    public static final double CONTENEDOR_MERCADERIA = 1.05;  // 5%
    
    public double calcularRecargo(Object tic); 
    
    public void calcularTotalCobro();
                                                                          
}
