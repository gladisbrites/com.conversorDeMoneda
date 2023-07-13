package com.conversorDeMoneda.modelo;

import javax.swing.JOptionPane;

public class ElegirConversor {

	public static void ingresandoOpciones() {

		ConversorDeMoneda conversorDeMoneda = new ConversorDeMoneda();
		ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();

		String[] options = { conversorDeMoneda.toString(), conversorDeTemperatura.toString() };

		String opciones = (String) JOptionPane.showInputDialog(null, "Elija un tipo de conversor", "Menu",
				JOptionPane.DEFAULT_OPTION, null, options, options[0]);

		if (opciones.equals(options[0])) {
			conversorDeMoneda.convertirMoneda();

		} else if (opciones.equals(options[1])) {
			conversorDeTemperatura.convertirTemperatura();
		}

	}

	public static void seguirOParar() {
		int valor = JOptionPane.showConfirmDialog(null, " ¿Desea continuar? ");
		if (JOptionPane.OK_OPTION == valor) {
			while (valor == JOptionPane.OK_OPTION) {
				ingresandoOpciones();
				valor = JOptionPane.showConfirmDialog(null, "¿Desea continuar? ");
				if (valor == JOptionPane.NO_OPTION || valor == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "programa terminado ");
					break;
				}
			}
		} else if (JOptionPane.NO_OPTION == valor || valor == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "programa terminado ");
		}
	}
}