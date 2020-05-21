/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import DAO.ClientesDAO;
import menu.MenuMetodos;

/**
 *
 * @author Santiago Morales
 */
public class main {

    /**
     * @param args the command line arguments
     */
            static ClientesDAO clientes = new ClientesDAO();
            static MenuMetodos menu = new MenuMetodos();
         
    public static void main(String[] args) {
        if (clientes.getConexion() == null) {
            System.err.println("Programa finalizado: se produjo un error al conectar");
            System.exit(0);
        } else{
            System.out.println("Conexión realizada correctamente\n");
        }
        menu.menu();
    }
    
}
