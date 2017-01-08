/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edad;

import javax.swing.JOptionPane;

/**
 *
 * @author JR
 */
public class Edad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Declaracion de variables
       int anio_act, anionac, edad;
       
       //Proceso
       anio_act=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año actual"));
       anionac=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento"));
       edad=anio_act-anionac;
       
    }
    
}
