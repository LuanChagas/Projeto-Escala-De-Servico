package Servicos;

import Modelo.Escala;

public class TelaServicos {
	
	private Escala EscalaA;
	private Escala EscalaB;
	private Escala EscalaC;
	private Escala EscalaD;

	public TelaServicos(Escala escalaA, Escala escalaB, Escala escalaC, Escala escalaD) {
		this.EscalaA = escalaA;
		this.EscalaB = escalaB;
		this.EscalaC = escalaC;
		this.EscalaD = escalaD;

	}

	public Escala getEscalaA() {
		return EscalaA;
	}

	public void setEscalaA(Escala escalaA) {
		EscalaA = escalaA;
	}

	public Escala getEscalaB() {
		return EscalaB;
	}

	public void setEscalaB(Escala escalaB) {
		EscalaB = escalaB;
	}

	public Escala getEscalaC() {
		return EscalaC;
	}

	public void setEscalaC(Escala escalaC) {
		EscalaC = escalaC;
	}

	public Escala getEscalaD() {
		return EscalaD;
	}

	public void setEscalaD(Escala escalaD) {
		EscalaD = escalaD;
	}

	
	
}
