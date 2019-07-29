package Servicos;

import java.util.Scanner;

import Modelo.Escala;

public class TelaEditarServicos {
	
	private final Scanner sc = new Scanner(System.in);

	private Escala EscalaA;
	private Escala EscalaB;
	private Escala EscalaC;
	private Escala EscalaD;

	public TelaEditarServicos(Escala escalaA, Escala escalaB, Escala escalaC, Escala escalaD) {
		this.EscalaA = escalaA;
		this.EscalaB = escalaB;
		this.EscalaC = escalaC;
		this.EscalaD = escalaD;

	}
	
public String EditandoNomes(char opcao) {
		
		switch(opcao) {
			
		case 'A' :
			System.out.println("\n");
			System.out.println("                 *********************************************************************************");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                                              DIGITE O NOME DA ESCALA A                              ");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 *********************************************************************************");
			sc.nex
		}
		
	}
	
	public char EditarNomesBCD() {
		
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                                                EDITAR NOME DAS ESCALAS ");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                            				    ESCALA A = DIGITE B              ");                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  		    ESCALA B = DIGITE C              ");                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  		    ESCALA C = DIGITE D              ");                                                                                                    
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		
		char opcao = sc.nextLine().toUpperCase().charAt(0);
		return opcao;
}
	
	public char EditarNomesACD() {
		
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                                                EDITAR NOME DAS ESCALAS ");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                            				    ESCALA A = DIGITE A              ");                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  		    ESCALA B = DIGITE C              ");                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  		    ESCALA C = DIGITE D              ");                                                                                                    
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		
		char opcao = sc.nextLine().toUpperCase().charAt(0);
		return opcao;
}
	
	public char EditarNomesABD() {
		
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                                                EDITAR NOME DAS ESCALAS ");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                            				    ESCALA A = DIGITE A              ");                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  		    ESCALA B = DIGITE B              ");                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  		    ESCALA C = DIGITE D              ");                                                                                                    
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		
		char opcao = sc.nextLine().toUpperCase().charAt(0);
		return opcao;
}
	
	public char EditarNomesABC() {
		
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                                                EDITAR NOME DAS ESCALAS ");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                            				    ESCALA A = DIGITE A              ");                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  		    ESCALA B = DIGITE B              ");                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  		    ESCALA C = DIGITE C              ");                                                                                                    
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		
		char opcao = sc.nextLine().toUpperCase().charAt(0);
		return opcao;
}
	
	

}
