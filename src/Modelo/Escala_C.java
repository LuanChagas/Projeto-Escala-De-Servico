package Modelo;

import java.util.Map;

import org.joda.time.DateTime;

public class Escala_C  extends Escala{

	public Escala_C() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Escala_C(char tipo, String nome) {
		super(tipo, nome);
		// TODO Auto-generated constructor stub
	}

	public Escala_C(char tipo) {
		super(tipo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<DateTime,String> Padrao(){
		return null;
	}
	
}
