
package cl.duoc.poo.vista;

import cl.duoc.poo.controlador.RegistroCobro;
import cl.duoc.poo.controlador.Cobro;
import cl.duoc.poo.modelo.Contenedor;
import cl.duoc.poo.modelo.Mercaderia;
import cl.duoc.poo.modelo.Refrigerado;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author sebas
 */
public class Almacenaje {

    public static void main(String[] args) {
        
        int opcion = 0;
        int opcion_articulo = 0;
        RegistroCobro registroCobro = new RegistroCobro();
        
        do {            
            opcion = menu();            
            switch(opcion){
                case 1:
                    registroCobro.agregarCobro(crearCobro());
                    break;
                case 2:
                    registroCobro.mostrarTotalCobros();
                    break;
                case 3:
                    System.out.println("Ha salido del Sistema");
                    System.exit(0);
                    break;
                default:
                    System.out.println(" - OPCION INVALIDA - ");                        
            }
            
        } while (opcion != 3);        
        
    }//Fin Método Main
    
    
    public static int menu(){
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        System.out.println("------------------------------");
        System.out.println(" [1] Seleccione Contenedor ");
        System.out.println(" ");
        System.out.println(" [2] Mostrar Cobros Contenedores ");
        System.out.println(" ");
        System.out.println(" [3] Salir Sistema ");
        System.out.println("-------------------------------");
        System.out.println(" Ingrese su Opción a Utilizar ");
        System.out.println("-------------------------------");
        opcion = teclado.nextInt();
        return opcion;
    }//Fin Método Menú
    
    public static int menuContenedor(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("-------------------------------");
        System.out.println(" [1] Contenedor Refrigerado ");
        System.out.println(" ");
        System.out.println(" [2] Contenedor Mercaderia ");
        System.out.println("------------------------------ ");
        System.out.println(" - Ingrese Opción Valida - ");
        System.out.println("-------------------------------");
        return teclado.nextInt();
    }//Fin Método SubMenú
    
    public static Cobro crearCobro(){
        Scanner teclado = new Scanner(System.in);
        //Definir Variable de submenú
        int opcion_art = 0;
        
        String paisDeOrigen, rutCliente;
        double peso;
        int numeroDeSerie, codigoDimensiones, precio;
        
        
        //Definir los objetos a Utilizar
        Mercaderia mercaderia = null;
        Refrigerado refrigerado = null;
        Cobro cobro = null;
        
        opcion_art = menuContenedor();
        
        switch(opcion_art){
            case 1: 
                int temperaturaActual, temperaturaMaxima, temperaturaMinima = 0;
                System.out.println("***************************************");
                System.out.println(" UD. ha elegido Contenedor REFRIGERADO...... ");
                System.out.println("Ingrese Temperatura Actual");
                temperaturaActual = teclado.nextInt();
                System.out.println("Ingrese Temperatura Máxima");
                temperaturaMaxima = teclado.nextInt();
                System.out.println("Ingrese Temperatura Mínima");
                temperaturaMinima = teclado.nextInt();
                System.out.println("Ingrese País de Origen: ");
                paisDeOrigen = teclado.next();
                System.out.println("Ingrese Rut del Cliente: ");
                rutCliente = teclado.next();
                System.out.println("Ingrese N° de Serie: ");
                numeroDeSerie = teclado.nextInt();
                System.out.println("Ingrese Precio del Contenedor: ");
                precio = teclado.nextInt();
                System.out.println("Ingrese Peso del Contenedor: ");
                peso = teclado.nextDouble();
                System.out.println("Ingrese Código de Dimensiones: ");
                codigoDimensiones = teclado.nextInt();

                refrigerado = new Refrigerado(temperaturaActual, temperaturaMinima, temperaturaMaxima, numeroDeSerie, peso, paisDeOrigen, rutCliente, codigoDimensiones, precio);
         
                break;
                
            case 2:
                boolean resistenciaExtra;
                String tipoContenido;
                System.out.println("***************************************");
                System.out.println("UD. ha elegido Contenedor de Mercadería...... ");
                System.out.println("Contenedor Posee Resistencia Extra? (S/N)");
                resistenciaExtra = (teclado.next().toUpperCase().equals("S"));
                System.out.println("Seleccione Tipo de Contenido: (F=Frágil, E=Electrodomésticos, P=Plásticos)");
                tipoContenido = teclado.next();
                System.out.println("Ingrese País de Origen: ");
                paisDeOrigen = teclado.next();
                System.out.println("Ingrese Rut del Cliente: ");
                rutCliente = teclado.next();
                System.out.println("Ingrese N° de Serie: ");
                numeroDeSerie = teclado.nextInt();
                System.out.println("Ingrese Precio del Contenedor: ");
                precio = teclado.nextInt();
                System.out.println("Ingrese Peso del Contenedor: ");
                peso = teclado.nextDouble();
                System.out.println("Ingrese Código de Dimensiones: ");
                codigoDimensiones = teclado.nextInt();
                
                mercaderia = new Mercaderia(resistenciaExtra, tipoContenido, numeroDeSerie, peso, paisDeOrigen, rutCliente, codigoDimensiones, precio);
                
                break;
        }//Fin de Switch
        
        String codigo;
        int cantidad = 0;
        int totalDespacho = 0;
        int cargo = 0;
        
        System.out.println("Ingrese Código del Cobro : ");
        codigo = teclado.next();
        
        if(opcion_art == 1){
            cobro = new Cobro(refrigerado, codigo);
            cobro.calcularRecargo(refrigerado);
        }else if(opcion_art == 2){
            cobro = new Cobro(mercaderia, codigo);
            cobro.calcularRecargo(mercaderia);
        }else{
            System.out.println("Opción Inválida");
        }
    
        return cobro;
    }
    
}

