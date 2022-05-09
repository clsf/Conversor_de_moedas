package model.entities;

public class Conversor {
	
	private Moeda moeda;

	public Moeda getMoeda() {
		return moeda;
	}

	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	
	public static Double converter(Moeda moeda1,Moeda moeda2, Double valor) {
		Double resultado =0.0;
		//Dolar
		if(moeda1.equals(Moeda.DOLAR) && moeda2.equals(Moeda.DOLAR)) {
			resultado=valor*1;
		}
		else if(moeda1.equals(Moeda.DOLAR) && moeda2.equals(Moeda.EURO)){
			resultado = valor * 0.95;
		}
		else if(moeda1.equals(Moeda.DOLAR) && moeda2.equals(Moeda.REAL)){
			resultado = valor * 5.08;
		}
		else if(moeda1.equals(Moeda.DOLAR) && moeda2.equals(Moeda.LIBRA_ESTERLINA)){
			resultado = valor * 0.81;
		}
		
		//Euro
		else if(moeda1.equals(Moeda.EURO) && moeda2.equals(Moeda.EURO)) {
			resultado = valor * 1;
		}
		else if(moeda1.equals(Moeda.EURO) && moeda2.equals(Moeda.DOLAR)) {
			resultado = valor * 1.05;
		}
		else if(moeda1.equals(Moeda.EURO) && moeda2.equals(Moeda.LIBRA_ESTERLINA)) {
			resultado = valor * 0.86;
		}
		else if(moeda1.equals(Moeda.EURO) && moeda2.equals(Moeda.REAL)) {
			resultado = valor * 5.34;
		}
		
		//Libra esterlina
		else if(moeda1.equals(Moeda.LIBRA_ESTERLINA) && moeda2.equals(Moeda.LIBRA_ESTERLINA)){
			resultado = valor * 1;
		}
		else if(moeda1.equals(Moeda.LIBRA_ESTERLINA) && moeda2.equals(Moeda.DOLAR)){
			resultado = valor * 1.23;
		}
		else if(moeda1.equals(Moeda.LIBRA_ESTERLINA) && moeda2.equals(Moeda.EURO)){
			resultado = valor * 1.17;
		}
		else if(moeda1.equals(Moeda.LIBRA_ESTERLINA) && moeda2.equals(Moeda.REAL)){
			resultado = valor * 6.23;
		}
		
		//Real
		else if(moeda1.equals(Moeda.REAL) && moeda2.equals(Moeda.REAL)){
			resultado = valor * 1;
		}
		else if(moeda1.equals(Moeda.REAL) && moeda2.equals(Moeda.DOLAR)){
			resultado = valor * 0.2;
		}
		else if(moeda1.equals(Moeda.REAL) && moeda2.equals(Moeda.EURO)){
			resultado = valor * 0.19;
		}
		else if(moeda1.equals(Moeda.REAL) && moeda2.equals(Moeda.LIBRA_ESTERLINA)){
			resultado = valor * 0.16;
		}
		
		return resultado;
	}
	
	
}
