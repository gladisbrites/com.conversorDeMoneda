package com.conversorDeMoneda.modelo;


import javax.swing.JOptionPane;

public class ConversorDeMoneda {

	public ConversorDeMoneda() {
		
	}

	public   void convertirMoneda(){  
		
            double numeroAConvertir=Double.parseDouble (JOptionPane.showInputDialog(null, "ingrese un "
            		+ " valor a convertir "));           
           
           
            String [] monedas ={"Peso Argentino a Dolar","Peso Argentino a Euros","Peso Argentino a Libras "
            		+ "Esterlina","Peso Argentino a Yen Japones","Peso Argentino a Won sul-coreano","Dolar a"
            				+ " Peso Argentino","Euro a Peso Argentino","Libras Esterlinas a Peso Argentino",
            				"Yen Japones a Peso Argentino","Won sul-coreano a Peso Argentino"};
            
            String aQueMedidaConvertir=(String) JOptionPane.showInputDialog(null, "Elija a que moneda "
            		+ "desea convertir", "Menu", JOptionPane.DEFAULT_OPTION, null, monedas, monedas[0]);
       
            
             
            
            switch(aQueMedidaConvertir) {
                case "Peso Argentino a Dolar":
                convertir(numeroAConvertir, 0.0039,"  dolares");
                    break;
                case "Peso Argentino a Euros":
                convertir(numeroAConvertir, 0.0036,"  Euros");
                    break;
                case "Peso Argentino a Libras Esterlina":
                convertir(numeroAConvertir, 0.0031,"  Libras Esterlinas");
                    break;
                    case "Peso Argentino a Yen Japones":
                convertir(numeroAConvertir, 0.57,"  Yen Japones");
                    break;
                    case "Peso Argentino a Won sul-coreano":
                convertir(numeroAConvertir, 5.15,"  Won sul-coreano");
                    break;
                   case "Dolar a Peso Argentino":
                 convertir(numeroAConvertir, 260.77, "  Pesos Argentinos");
                      break;

                
            }
                
     }
    

	public void convertir(Double numeroAConvertir, Double moneda, String aQueMedidaConvertir) {
		double resultado = numeroAConvertir*moneda;
        resultado= (double) Math.round(resultado*100d)/100;
        JOptionPane.showMessageDialog(null,"tienes "+ resultado+aQueMedidaConvertir);
		
	}
	@Override
	public String toString(){
		return "Conversor de Moneda";
		
	}
}

