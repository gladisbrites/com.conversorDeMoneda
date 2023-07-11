package com.conversorDeMoneda.modelo;

import javax.swing.JOptionPane;

public class PrincipalMain {

    public static void main(String[] args) throws Exception {
    	
        ElegirConversor elegirConversor =new ElegirConversor(); 
        elegirConversor.ingresandoOpciones();
        int valor=  JOptionPane.showConfirmDialog(null, " ¿Desea continuar? ");
        if( JOptionPane.OK_OPTION==valor) {
        	while(valor ==JOptionPane.OK_OPTION) {
            	elegirConversor.ingresandoOpciones();
            	valor= JOptionPane.showConfirmDialog(null, "¿Desea continuar? ");
            	if(valor==JOptionPane.NO_OPTION || valor==JOptionPane.CANCEL_OPTION) {
              	  JOptionPane.showMessageDialog(null,"programa terminado ");
              	  break;
              	  }
        		}
        }else if(JOptionPane.NO_OPTION==valor ||valor==JOptionPane.CANCEL_OPTION) {
        	  JOptionPane.showMessageDialog(null,"programa terminado ");
        }
        
     }
 }

    

