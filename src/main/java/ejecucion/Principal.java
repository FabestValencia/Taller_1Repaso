package ejecucion;

import Interfaces.JMenuR;
import Interfaces.JRegistrarCliente;


public class Principal {

    public static void main(String[] args) {
        //JMenuR iniciar = new JMenuR();
        //iniciar.setVisible(true);
        JRegistrarCliente cli = new JRegistrarCliente();
        cli.setVisible(true);
    }
}
