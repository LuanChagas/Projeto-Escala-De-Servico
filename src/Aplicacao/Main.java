package Aplicacao;

import java.util.Scanner;

import Modelo.Escala;
import Modelo.Escala_D;
import Servicos.TelaPesquisaServicos;
import Tela.View;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Escala MinhaEscala;
		View Tela = new View();
	//	Escala EscalaInicio  = Tela.MostrarInicio();
	  //  MinhaEscala = new Escala_A(EscalaInicio.getNome());
		int opcao;
		
		Escala escala = new Escala_D();
		
		TelaPesquisaServicos tela = new TelaPesquisaServicos();
		
		tela.PesquisaDia(10, 07, 2019);
		
		
//				do {
//					opcao = Tela.MostrarTela(MinhaEscala);
//			switch (opcao) {
//				case 1:
//				  int opcaoPesquisa;
//				  	do {
//					 opcaoPesquisa = Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
//						switch(opcaoPesquisa) {
//							case 1 : 
//								System.out.println("POR DIA");
//								Tela.getTelaPesquisa().TelaPesquisa(MinhaEscala);
//								break;
//							case 2 : 
//								System.out.println("POR MES");
//								break;
//							
//							case 3 : 
//								System.out.println("PERIODO");
//								break;
//							case 4 : 
//								System.out.println("SAIR");
//								break;
//							}
//				  			}while(opcaoPesquisa!= 4);
//					break;
//				case 2:
//					int opcaoEditar;
//					do {
//					  opcaoEditar = Tela.getTelaEditar().TelaEditarPrincipal();
//						switch (opcaoEditar) {
//							case 1 :
//									System.out.println("EDITAR SUA ESCALA");;
//									break;
//							case 2 : 
//									System.out.println("EDITAR OUTRAS ESCALAS");;
//									break;
//							case 3 : 
//									System.out.println("SAIR");;
//									break;
//									}
//						}while(opcaoEditar!=3);
//					break;
//				case 3:
//					System.out.println("Finalizado programa");
//					break;
//				default:
//					System.out.println("Numero Invalido");
//					break;
//								}	
//					}while(opcao!=3);	
		
		
		
				
				
}
}


