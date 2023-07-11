package com.conversorDeMoneda.modelo;


import javax.swing.JOptionPane;

public class ElegirConversor {
      
         public void  ingresandoOpciones(){  

        	 
        	  //int contador = 0 ;

               //do {   System.out.println ("Contando... " + (contador+1) );

                 //          contador += 1;

               // } while (contador<10);    }   */
        	 
            ConversorDeMoneda conversorDeMoneda= new ConversorDeMoneda("conversor de moneda");
            ConversorDeTemperatura conversorDeTemperatura =new ConversorDeTemperatura("Conversor de Temperatura");
            String[] options ={(String)conversorDeMoneda.getNombre(),(String)conversorDeTemperatura.getNombre() };
            
            String opciones =(String) JOptionPane.showInputDialog(null, "Elija un tipo de conversor", "Menu",
			JOptionPane.DEFAULT_OPTION, null,options, options[0]);
            
            
           		
	      if(opciones.equals(options[0])){
            conversorDeMoneda.convertirMoneda();
            
        }
	      else if (opciones.equals(options[1])) {
	    	  conversorDeTemperatura.convertirTemperatura();
	      }
         
          
        
       
}   
 }