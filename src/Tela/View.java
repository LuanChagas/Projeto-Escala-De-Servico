package Tela;

import java.util.Scanner;

import Modelo.Escala;

public class View {
	private final Scanner sc = new Scanner(System.in);

	private TelaInicial telaInicial;
	private TelaPrincipal telaPrincipal;
	private TelaPesquisa telaPesquisa;
	private TelaEditar telaEditar;

	private Escala MinhaEscala;

	public View() {
		telaInicial = new TelaInicial();
		telaPrincipal = new TelaPrincipal();
		telaPesquisa = new TelaPesquisa();
		telaEditar = new TelaEditar();
		Escala MinhaEscala = new Escala();
	}

	public Escala getEscala() {
		return MinhaEscala;
	}

	public void setEscala(Escala escala) {
		this.MinhaEscala = escala;
	}

	public Escala MostrarInicio() {
		return telaInicial.TelaInicial();

	}

	public void MostrarTela(Escala escala) {
		setEscala(escala);
		TransicaoPrincipal(telaPrincipal.TelaPrincipal(this.MinhaEscala));

	}

	public void LimparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println(" ");
		}
	}

	public void TransicaoPrincipal(int opcao) {
		switch (opcao) {
		case 1:
			telaPesquisa.TelaPesquisa(MinhaEscala);
			break;
		case 2:
			telaEditar.TelaEditarPrincipal();
			break;
		case 3:
			System.out.println("Fechando o programa");
			break;
		default:
			System.out.println("NUmero invalido: Tente Novamente");
			MostrarTela(getEscala());
			;
		}
	}

}
