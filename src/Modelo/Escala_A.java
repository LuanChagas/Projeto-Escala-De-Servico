package Modelo;

import java.util.Map;

import org.joda.time.DateTime;

public class Escala_A extends Escala{
	public Escala_A() {
		super();
	}

	public Escala_A(char tipo, String nome) {
		super(tipo, nome);	
	}

	public Escala_A(char tipo) {
		super(tipo);	
	}

	@Override
	public Map<DateTime,String> Padrao(){
		return null;
	}
	



	
	
}
