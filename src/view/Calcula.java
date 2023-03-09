package view;

import java.text.DecimalFormat;

public class Calcula {
	
	//Moeda moeda = new Moeda();
	DecimalFormat df = new DecimalFormat("#0.00");
	private double dolar = 05.20;
	
	
	public double converteDolarReais(double valor) {
		
		double valor_d = valor * dolar;
		
		return valor_d;
	}
	

}
