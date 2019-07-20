package Tela;

import java.util.Scanner;

import Modelo.Escala;

public class TelaPesquisa {
											private	final Scanner sc = new Scanner(System.in);
	
		
											
	public int TelaPesquisa(Escala escala) {
		
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
		 return opcao;
	}

	public int TransicaoTelaPesquisa(int opcao,Escala escala) {
		return opcao;
	
	}



}
