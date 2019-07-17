package Tela;

import java.io.InputStream;
import java.util.Scanner;

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
	
	
	public void MostrarInicio() {
		telaInicial.TelaInicial();
	}
	
	public void MostrarTela() {
		TransicaoPrincipal(telaPrincipal.TelaPrincipal());
		
	}

	public void LimparTela() {
		for (int i = 0; i < 50; i++) {
			System.out.println(" ");
		}
	}

	public void TransicaoPrincipal(int opcao) {
		switch (opcao) {
		case 1:
			telaPesquisa.TelaPesquisa();
			break;
		case 2:
			telaEditar.TelaEditarPrincipal();
			break;
		case 3:
			System.out.println("Fechando o programa");
			break;
		default:
			System.out.println("NUmero invalido: Tente Novamente");
			MostrarTela();
		}
	}

}
