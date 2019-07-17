package Aplicacao;

import Modelo.Escala;
import Tela.View;

public class Main {

	public static void main(String[] args) {
		
		
		View Tela = new View();
		Escala escala = Tela.MostrarInicio();
		Tela.setEscala(escala);
		Tela.MostrarTela(escala);
		
		
		
	}

}
