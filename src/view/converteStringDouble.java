package view;

//@SuppressWarnings("serial")
public class converteStringDouble {
	
	
	public double converteDouble(String valor) {
		
		double valor_double = Double.parseDouble(valor);
		
		return Math.round(valor_double);
		
	}
	
	public String converteString(double valor) {
		
		String valor_Txt = String.valueOf(valor);
		
		return valor_Txt;
		
	}

}
