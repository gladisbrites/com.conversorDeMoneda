package com.conversorDeMoneda.modelo;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {
	public ConversorDeTemperatura(){
		
	}

	public void convertirTemperatura() {
		
		double numeroAConvertir = Double.parseDouble(
				JOptionPane.showInputDialog(null, "ingrese el " + " valor de temperatura que desea convertir "));

		String[] temperaturas = { "grados celsius a fahrenheit", "fahrenheit a grados celsius" };
		
		String opcionTemperaturaConvertida = (String) JOptionPane.showInputDialog(null,
				"Elija a que temperatura " + "desea convertir", "Menu", JOptionPane.DEFAULT_OPTION, null, temperaturas,
				temperaturas[0]);

		double resultado = 0.0;
		if (opcionTemperaturaConvertida.equalsIgnoreCase(temperaturas[0])) {

			resultado = (numeroAConvertir * 9 / 5) + 32;
			resultado = (double) Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, numeroAConvertir + " grados celsius son " + resultado + " fahrenheit ");

		} else if (opcionTemperaturaConvertida.equalsIgnoreCase(temperaturas[1])) {
			resultado = (numeroAConvertir - 32) * 5 / 9;

			resultado = (double) Math.round(resultado * 100d) / 100;
			JOptionPane.showMessageDialog(null, numeroAConvertir + " fahrenheit son " + resultado + " grados celsius ");

		}

	}
	@Override
	public String toString(){
		return "Conversor de Temperatura";
		
	}

}
