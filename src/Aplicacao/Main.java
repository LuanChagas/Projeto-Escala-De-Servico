package Aplicacao;

import java.util.Scanner;

import Modelo.Escala;
import Modelo.Escala_A;
import Modelo.Escala_B;
import Modelo.Escala_C;
import Modelo.Escala_D;
import Servicos.TelaPesquisaServicos;
import Tela.View;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		View Tela = new View();
		Escala EscalaInicio = Tela.MostrarInicio();
		Escala MinhaEscala = null;
		Escala EscalaA = null;
		Escala EscalaB = null;
		Escala EscalaC = null;
		Escala EscalaD = null;
		;
		TelaPesquisaServicos PesquisaServicos = null;
		if(Tela.getTelaInicial().NomearEscalas() == 'S') {
		if (EscalaInicio.getTipo().equals('A')) {
			MinhaEscala = new Escala_A(EscalaInicio.getNome());
			EscalaB = Tela.getTelaInicial().NomeandoEscalaB();
			EscalaC = Tela.getTelaInicial().NomeandoEscalaC();
			EscalaD = Tela.getTelaInicial().NomeandoEscalaD();
			PesquisaServicos = new TelaPesquisaServicos(MinhaEscala, EscalaB, EscalaC, EscalaD);
		} else if (EscalaInicio.getTipo().equals('B')) {
				MinhaEscala = new Escala_B(EscalaInicio.getNome());
				EscalaA = Tela.getTelaInicial().NomeandoEscalaA();
				EscalaC = Tela.getTelaInicial().NomeandoEscalaC();
				EscalaD = Tela.getTelaInicial().NomeandoEscalaD();
				PesquisaServicos = new TelaPesquisaServicos(EscalaA, MinhaEscala, EscalaC, EscalaD);
			} else if (EscalaInicio.getTipo().equals('C')) {
				MinhaEscala = new Escala_C(EscalaInicio.getNome());
				EscalaA = Tela.getTelaInicial().NomeandoEscalaA();
				EscalaB = Tela.getTelaInicial().NomeandoEscalaB();
				EscalaD = Tela.getTelaInicial().NomeandoEscalaD();
				PesquisaServicos = new TelaPesquisaServicos(EscalaA, EscalaB, MinhaEscala, EscalaD);
			} else if (EscalaInicio.getTipo().equals('D')) {
				MinhaEscala = new Escala_D(EscalaInicio.getNome());
				EscalaA = Tela.getTelaInicial().NomeandoEscalaA();
				EscalaB = Tela.getTelaInicial().NomeandoEscalaB();
				EscalaC = Tela.getTelaInicial().NomeandoEscalaC();
				PesquisaServicos = new TelaPesquisaServicos(EscalaA, EscalaB, EscalaC, MinhaEscala);
			}
		} else if (EscalaInicio.getTipo().equals('A')) {
			MinhaEscala = new Escala_A(EscalaInicio.getNome());
			EscalaB = new Escala_B();
			EscalaC = new Escala_C();
			EscalaD = new Escala_D();
			PesquisaServicos = new TelaPesquisaServicos(MinhaEscala, EscalaB, EscalaC, EscalaD);
		} else if (EscalaInicio.getTipo().equals('B')) {
			EscalaA = new Escala_A();
			MinhaEscala = new Escala_B(EscalaInicio.getNome());
			EscalaC = new Escala_C();
			EscalaD = new Escala_D();
			PesquisaServicos = new TelaPesquisaServicos(EscalaA, MinhaEscala, EscalaC, EscalaD);
		} else if (EscalaInicio.getTipo().equals('C')) {
			MinhaEscala = new Escala_C(EscalaInicio.getNome());
			EscalaA = new Escala_A();
			EscalaB = new Escala_B();
			EscalaD = new Escala_D();
			PesquisaServicos = new TelaPesquisaServicos(EscalaA, EscalaB, MinhaEscala, EscalaD);
		} else if (EscalaInicio.getTipo().equals('D')) {
			MinhaEscala = new Escala_D(EscalaInicio.getNome());
			EscalaA = new Escala_A();
			EscalaB = new Escala_B();
			EscalaC = new Escala_C();
			PesquisaServicos = new TelaPesquisaServicos(EscalaA, EscalaB, EscalaC, MinhaEscala);
		}

		int opcao;

		do {
			opcao = Tela.MostrarTela(MinhaEscala);
			switch (opcao) {
			case 1:
				int opcaoPesquisa;
				do {
					opcaoPesquisa = Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
					switch (opcaoPesquisa) {

					case 1:
						PesquisaServicos.PesquisaDia(Tela.getTelaPesquisa().PesquisaDia());
						Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
						break;
					case 2:
						PesquisaServicos.PesquisaMes(Tela.getTelaPesquisa().PesquisaMes());
						Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
						break;

					case 3:
						PesquisaServicos.PesquisaPeriodo(Tela.getTelaPesquisa().PesquisaPeriodo());
						Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
						break;
					default:
					}
				} while (opcaoPesquisa != 4);
				break;
			case 2:
				int opcaoEditar;
				do {
					opcaoEditar = Tela.getTelaEditar().TelaEditarPrincipal();
					switch (opcaoEditar) {
					case 1:
						System.out.println("EDITAR SUA ESCALA");
						;
						break;
					case 2:
						System.out.println("EDITAR OUTRAS ESCALAS");
						;
						break;
					case 3:
						System.out.println("SAIR");
						break;
					}
				} while (opcaoEditar != 3);
				break;
			case 3:
				System.out.println("Finalizado programa");
				break;
			default:
				System.out.println("Numero Invalido");
				break;
			}
		} while (opcao != 3);

	}
}
