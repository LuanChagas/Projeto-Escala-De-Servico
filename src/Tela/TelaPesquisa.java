package Tela;

import java.util.Scanner;

import Modelo.Escala;

public class TelaPesquisa {
											private	final Scanner sc = new Scanner(System.in);
	
		
											
	public void TelaPesquisa(Escala escala) {
		
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
		System.out.println("                 * *                       ***    1 - PESQUISA DIA     ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       ***    2 - PESQUISA MES     ***                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       ***       3 - PERIODO       ***                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       ***       4 - SAIR          ***                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		 int opcao = sc.nextInt();
		 TransicaoTelaPesquisa(opcao,escala);
	}

	public void TransicaoTelaPesquisa(int opcao,Escala escala) {
		View view = new View();
		Escala MinhaEscala = escala;
		switch (opcao) {
		case 1 : 
			PesquisaDia();
			break;
		
		case 2 : 
			PesquisaMes();
			break;
		
		case 3 : 
			PesquisaPeriodo();
			break;
		
		case 4 : 
			view.MostrarTela(MinhaEscala);
			break;
		}
	}

	private void PesquisaPeriodo() {
		// TODO Auto-generated method stub
		
	}

	private void PesquisaMes() {
		// TODO Auto-generated method stub
		
	}

	private void PesquisaDia() {
		// TODO Auto-generated method stub
		
	}
}
