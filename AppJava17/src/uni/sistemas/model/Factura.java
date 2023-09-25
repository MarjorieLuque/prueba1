/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni.sistemas.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import uni.sistemas.service.ComprobanteAbstract;
import uni.sistemas.util.Constante;

/**
 *
 * @author VELIZ
 */
public class Factura extends ComprobanteAbstract {

    @Override
    public String Documento(String cliente, double total) {
        Date fecha = new Date();
        //formato de fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        //calcular consumo,impuesto, servicio y total general
        double consumo = total / (1 + Constante.IGV);
        double impuesto = total - consumo;
        double servicio = total * Constante.SERVICIO;
        double totalgeneral = total + servicio;
        //generar factura
        return "F A C T U R A\n" + "------------------"
                + "\nCliente :" + cliente
                + "\nFecha :" + formato.format(fecha)
                + "\nConsumo :" + consumo
                + "\nImpuesto(18%) :" + impuesto
                + "\nTotal :" + total
                + "\nServicio(10%):" + servicio
                + "\nTotal General :" + totalgeneral;
    }

}
