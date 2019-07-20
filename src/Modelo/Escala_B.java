package Modelo;

import java.util.Map;

import org.joda.time.DateTime;

public class Escala_B extends Escala{

	public Escala_B() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Escala_B(char tipo, String nome) {
		super(tipo, nome);
		// TODO Auto-generated constructor stub
	}

	public Escala_B(char tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Map<DateTime,String> Padrao(){
		return null;
	}
	

}
