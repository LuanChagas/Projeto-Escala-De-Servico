package Tela;

import java.util.Scanner;

import Modelo.Escala;

public class TelaInicial {
	
	private	final Scanner sc = new Scanner(System.in);
	
	public Escala TelaInicial() {
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
		System.out.println("                 * *                       **  DIGITE A LETRA DA ESCALA **                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		System.out.println("\n");
		System.out.print("                  ESCALA : ");
		char tipo = sc.next().trim().charAt(0);
		System.out.println("\n");
		
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
		System.out.println("                 * *                       **      DIGITE SEU NOME      **                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		System.out.println("\n");
		System.out.print("                  NOME :  ");
		sc.nextLine();
		String nome = sc.nextLine();
		Escala MinhaEscala = new Escala(tipo,nome);
		LimparTela();
		return MinhaEscala;
		
		
		 
	}
	
	
	
	public void LimparTela(){
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println(" ");
		}
	}
}
