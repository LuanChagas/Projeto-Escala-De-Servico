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
		
		Scanner sc = new Scanner (System.in);
		Escala MinhaEscala;
		View Tela = new View();
		Escala EscalaInicio  = Tela.MostrarInicio();
	    MinhaEscala = new Escala_A(EscalaInicio.getNome());
		int opcao;
		
		
		Escala B = new Escala_B();
		Escala C = new Escala_C();
		Escala D = new Escala_D();
		TelaPesquisaServicos TelaPesquisaServicos = new TelaPesquisaServicos(MinhaEscala,B,C,D);
					do {
					opcao = Tela.MostrarTela(MinhaEscala);
			switch (opcao) {
				case 1:
				  int opcaoPesquisa;
				  	do {
					 opcaoPesquisa = Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
						switch(opcaoPesquisa) {
						
							case 1 : 
								TelaPesquisaServicos.PesquisaDia(Tela.getTelaPesquisa().PesquisaDia());
								Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
								break;
							case 2 : 
								TelaPesquisaServicos.PesquisaMes(Tela.getTelaPesquisa().PesquisaMes());
								Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
								break;
							
							case 3 : 
								TelaPesquisaServicos.PesquisaPeriodo(Tela.getTelaPesquisa().PesquisaPeriodo());
								Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
								break;
								default:
							}
				  			}while(opcaoPesquisa!= 4);
					break;
				case 2:
					int opcaoEditar;
					do {
					  opcaoEditar = Tela.getTelaEditar().TelaEditarPrincipal();
						switch (opcaoEditar) {
							case 1 :
									System.out.println("EDITAR SUA ESCALA");;
								break;
							case 2 : 
									System.out.println("EDITAR OUTRAS ESCALAS");;
									break;
							case 3 : 
									System.out.println("SAIR");									
						break;
						}
						} while(opcaoEditar!=3);
					break;
				case 3:
					System.out.println("Finalizado programa");
					break;
				default:
					System.out.println("Numero Invalido");
					break;
								}						
					}while(opcao!=3);

}
}
