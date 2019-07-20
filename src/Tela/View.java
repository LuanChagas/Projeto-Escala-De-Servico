package Tela;

import java.util.Scanner;

import Modelo.Escala;

public class View {
	private final Scanner sc = new Scanner(System.in);

	private TelaInicial telaInicial;
	private TelaPrincipal telaPrincipal;
	private TelaPesquisa telaPesquisa;
	private TelaEditar telaEditar;

	

	public View() {
		telaInicial = new TelaInicial();
		telaPrincipal = new TelaPrincipal();
		telaPesquisa = new TelaPesquisa();
		telaEditar = new TelaEditar();
		
	}

	public TelaInicial getTelaInicial() {
		return telaInicial;
	}



	public TelaPrincipal getTelaPrincipal() {
		return telaPrincipal;
	}



	public TelaPesquisa getTelaPesquisa() {
		return telaPesquisa;
	}



	public TelaEditar getTelaEditar() {
		return telaEditar;
	}

	public Escala MostrarInicio() {
		return telaInicial.TelaInicial();

	}

	public int MostrarTela(Escala escala) {
		return telaPrincipal.TelaPrincipal(escala);

	}

	public void LimparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println(" ");
		}
	}

	
	
}
