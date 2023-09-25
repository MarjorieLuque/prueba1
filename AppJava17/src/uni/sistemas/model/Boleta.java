package uni.sistemas.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import uni.sistemas.service.ComprobanteAbstract;
import uni.sistemas.util.Constante;

/**
 *
 * @author VELIZ
 */
public class Boleta extends ComprobanteAbstract {

    @Override
    public String Documento(String cliente, double total) {
        Date fecha = new Date();
        //formato de fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //calcular servicio y total general
        double servicio = total * Constante.SERVICIO;
        double totalgeneral = total + servicio;
        //generar boleta
        return "B O L E T A\n" + "------------------"
                + "\nCliente :" + cliente
                + "\nFecha :" + formato.format(fecha)
                + "\nTotal :" + total
                + "\nServicio(10%):" + servicio
                + "\nTotal General :" + totalgeneral;
    }

}
