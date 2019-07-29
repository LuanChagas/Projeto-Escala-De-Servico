package Aplicacao;

import java.util.Scanner;

import Modelo.Escala;
import Modelo.Escala_A;
import Modelo.Escala_B;
import Modelo.Escala_C;
import Modelo.Escala_D;
import Servicos.TelaPesquisaServicos;
import Servicos.TelaServicos;
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
		TelaServicos TelaServicos = null;
		TelaPesquisaServicos TelaPesSer = null;
		if(Tela.getTelaInicial().NomearEscalas() == 'S') {
		if (EscalaInicio.getTipo().equals('A')) {
			EscalaA = new Escala_A();
			MinhaEscala = new Escala_A(EscalaInicio.getNome());
			EscalaB = Tela.getTelaInicial().NomeandoEscalaB();
			EscalaC = Tela.getTelaInicial().NomeandoEscalaC();
			EscalaD = Tela.getTelaInicial().NomeandoEscalaD();
			TelaServicos = new TelaServicos( MinhaEscala,EscalaB, EscalaC, EscalaD);
		} else if (EscalaInicio.getTipo().equals('B')) {
				EscalaB = new Escala_B();
				MinhaEscala = new Escala_B(EscalaInicio.getNome());
				EscalaA = Tela.getTelaInicial().NomeandoEscalaA();
				EscalaC = Tela.getTelaInicial().NomeandoEscalaC();
				EscalaD = Tela.getTelaInicial().NomeandoEscalaD();
				TelaServicos = new TelaServicos(EscalaA, MinhaEscala, EscalaC, EscalaD);
			} else if (EscalaInicio.getTipo().equals('C')) {
				EscalaC = new Escala_C();
				MinhaEscala = new Escala_C(EscalaInicio.getNome());
				EscalaA = Tela.getTelaInicial().NomeandoEscalaA();
				EscalaB = Tela.getTelaInicial().NomeandoEscalaB();
				EscalaD = Tela.getTelaInicial().NomeandoEscalaD();
				TelaServicos = new TelaServicos(EscalaA, EscalaB, MinhaEscala, EscalaD);
			} else if (EscalaInicio.getTipo().equals('D')) {
				EscalaD = new Escala_D();
				MinhaEscala = new Escala_D(EscalaInicio.getNome());
				EscalaA = Tela.getTelaInicial().NomeandoEscalaA();
				EscalaB = Tela.getTelaInicial().NomeandoEscalaB();
				EscalaC = Tela.getTelaInicial().NomeandoEscalaC();
				TelaServicos = new TelaServicos(EscalaA, EscalaB, EscalaC, MinhaEscala);
			}
		} else if (EscalaInicio.getTipo().equals('A')) {
			EscalaA = new Escala_A();
			MinhaEscala = new Escala_A(EscalaInicio.getNome());
			EscalaB = new Escala_B();
			EscalaC = new Escala_C();
			EscalaD = new Escala_D();
			TelaServicos = new TelaServicos(MinhaEscala, EscalaB, EscalaC, EscalaD);
		} else if (EscalaInicio.getTipo().equals('B')) {
			EscalaB = new Escala_B();
			EscalaA = new Escala_A();
			MinhaEscala = new Escala_B(EscalaInicio.getNome());
			EscalaC = new Escala_C();
			EscalaD = new Escala_D();
			TelaServicos = new TelaServicos(EscalaA, MinhaEscala, EscalaC, EscalaD);
		} else if (EscalaInicio.getTipo().equals('C')) {
			EscalaC = new Escala_C();
			MinhaEscala = new Escala_C(EscalaInicio.getNome());
			EscalaA = new Escala_A();
			EscalaB = new Escala_B();
			EscalaD = new Escala_D();
			TelaServicos = new TelaServicos(EscalaA, EscalaB, MinhaEscala, EscalaD);
		} else if (EscalaInicio.getTipo().equals('D')) {
			EscalaD = new Escala_D();
			MinhaEscala = new Escala_D(EscalaInicio.getNome());
			EscalaA = new Escala_A();
			EscalaB = new Escala_B();
			EscalaC = new Escala_C();
			TelaServicos = new TelaServicos(EscalaA, EscalaB, EscalaC, MinhaEscala);
		}

		int opcao;

		do {
			opcao = Tela.MostrarTela();
			switch (opcao) {
			case 1:
				int opcaoPesquisa;
				do {
					opcaoPesquisa = Tela.getTelaPesquisa().TelaPesquisa();
					TelaPesquisaServicos PesquisaServicos= new TelaPesquisaServicos(TelaServicos);
					switch (opcaoPesquisa) {

					case 1:
						
						PesquisaServicos.PesquisaDia(Tela.getTelaPesquisa().PesquisaDia());
						Tela.getTelaPesquisa().TelaPesquisa();
						break;
					case 2:
						PesquisaServicos.PesquisaMes(Tela.getTelaPesquisa().PesquisaMes());
						Tela.getTelaPesquisa().TelaPesquisa();
						break;

					case 3:
						PesquisaServicos.PesquisaPeriodo(Tela.getTelaPesquisa().PesquisaPeriodo());
						Tela.getTelaPesquisa().TelaPesquisa();
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
						Escala NovaEscala = Tela.MostrarInicio();
						System.out.println("Escala ALTERADA");
						System.out.println("ESCALA " + MinhaEscala.getTipo() + " ESTA SEM NOME");
						System.out.println("SE QUISER EDITA-LA VÁ PARA EDITAR-> NOMEAR OUTRAS ESCALAS");
							if(NovaEscala.getTipo().equals('A')){
								MinhaEscala = new Escala_A(NovaEscala.getNome());
								TelaServicos = new TelaServicos(MinhaEscala, EscalaB, EscalaC, EscalaD);
								
							}else
							if(NovaEscala.getTipo().equals('B')){
								MinhaEscala = new Escala_B(NovaEscala.getNome());
								TelaServicos = new TelaServicos(EscalaA,MinhaEscala, EscalaC, EscalaD);
							}else
							if(NovaEscala.getTipo().equals('C')){
								MinhaEscala = new Escala_C(NovaEscala.getNome());
								TelaServicos = new TelaServicos(EscalaA,MinhaEscala, EscalaB, EscalaD);
							}else
							if(NovaEscala.getTipo().equals('D')){
								MinhaEscala = new Escala_D(NovaEscala.getNome());
								TelaServicos = new TelaServicos(MinhaEscala, EscalaB, EscalaC, EscalaA);
							}
							break;
					case 2:
						System.out.println("EDITAR OUTRAS ESCALAS");
						
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
