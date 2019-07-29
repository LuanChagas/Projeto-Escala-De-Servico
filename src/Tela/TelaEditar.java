package Tela;

import java.util.Scanner;

public class TelaEditar {
	private static final Scanner sc = new Scanner(System.in);
	
	
	public int TelaEditarPrincipal() {
		
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
		System.out.println("                 * *                       *1- EDITAR DADOS DA SUA ESCALA*                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       ***2 - NOMEAR OUTRAS ESCALA ***                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       ***       3 - SAIR          ***                     * *");
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		int opcao = sc.nextInt();
		LimparTela();
		return opcao;
	}
	
	public void LimparTela(){
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println(" ");
		}

}
	
	
}
