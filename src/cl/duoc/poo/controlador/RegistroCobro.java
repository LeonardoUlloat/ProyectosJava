package cl.duoc.poo.controlador;

import cl.duoc.poo.controlador.Cobro;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class RegistroCobro {

    ArrayList<Cobro> listacobro;

    public RegistroCobro() {
        listacobro = new ArrayList<>();
    }

    public boolean buscarCobro(String codigo) {
        boolean valida = false;

        for (Cobro temp : listacobro) {
            if (temp.getCodigo().equals(codigo)) {
                valida = true;
                break;
            }
        }
        return valida;
    }

    public void agregarCobro(Cobro cobro) {

        if (cobro != null) {

            if (buscarCobro(cobro.getCodigo()) == false) {
                listacobro.add(cobro);
            } else {
                System.out.println("** EL COBRO SE ENCUENTRA REGISTRADO **");
            }

        } else {
            System.out.println("** NO SE ENCUENTRA EL COBRO SOLICITADO **");
        }
    }

    public void mostrarTotalCobros() {
        int total = 0;

        for (Cobro temp : listacobro) {
            System.out.println("Cobro " + temp.toString());
            total += temp.getTotalCobrar();
        }
        System.out.println(" Cantidad de Cobro " + listacobro.size());
        System.out.println(" Total Venta: " + total);
    }
}
