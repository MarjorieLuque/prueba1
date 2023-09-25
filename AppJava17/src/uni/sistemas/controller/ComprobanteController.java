package uni.sistemas.controller;

import uni.sistemas.model.Boleta;
import uni.sistemas.model.Factura;
import uni.sistemas.service.ComprobanteAbstract;
import uni.sistemas.util.Constante;

/**
 *
 * @author VELIZ
 */
public class ComprobanteController {

    //metodo para crear objeto de tipo documento()
    public static ComprobanteAbstract crearDocumento(int tipo) {
        ComprobanteAbstract com = null;
        switch (tipo) {
            case Constante.FACTURA:
                com = new Factura();
                break;
            case Constante.BOLETA:
                com = new Boleta();
                break;
        }
        return com;
    }
}
