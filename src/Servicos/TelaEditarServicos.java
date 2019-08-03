package Servicos;

import java.util.Scanner;

import Modelo.Escala;

public class TelaEditarServicos {
	
	private final Scanner sc = new Scanner(System.in);

	private Escala EscalaA;
	private Escala EscalaB;
	private Escala EscalaC;
	private Escala EscalaD;

	public TelaEditarServicos(TelaServicos tela) {
		
		this.EscalaA = tela.getEscalaA();
		this.EscalaB = tela.getEscalaB();
		this.EscalaC = tela.getEscalaC();
		this.EscalaD = tela.getEscalaD();

	}
	
	public String EditandoNomes(char opcao) {
		
		String NovoNome = sc.nextLine();
		switch(opcao) {
			
		case 'A' :
			System.out.println("\n");
			System.out.println("                 *********************************************************************************");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                                              DIGITE O NOME DA ESCALA A                           ");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 *********************************************************************************");
			return NovoNome;
			
			
		case 'B' :
			System.out.println("\n");
			System.out.println("                 *********************************************************************************");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                                              DIGITE O NOME DA ESCALA B                           ");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 *********************************************************************************");
			 NovoNome = sc.nextLine();
			return NovoNome;
			
		case 'C' :
			System.out.println("\n");
			System.out.println("                 *********************************************************************************");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                                              DIGITE O NOME DA ESCALA C                           ");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 *********************************************************************************");
			NovoNome = sc.nextLine();
			return NovoNome;
			
		case 'D' :
			System.out.println("\n");
			System.out.println("                 *********************************************************************************");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                                              DIGITE O NOME DA ESCALA D                           ");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 *********************************************************************************");
			NovoNome = sc.nextLine();
			return NovoNome;
			default:
				return "Opção Invalida";
				
		}
		
		
	
	}
			
	public char EditarNomesBCD() {
		char opcao;
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                                                EDITAR NOME DAS ESCALAS ");
		System.out.println("                 * *                            DIGITE A LETRA DA ESCALA                       * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                                		  ESCALA B ("+ EscalaB.getNome() +")");                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  ESCALA C ("+ EscalaC.getNome() +")"              );                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  ESCALA D ("+ EscalaD.getNome() +")"              );                                                                                                    
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		String Letra = sc.nextLine();
		String Vazio = "";
				if(Letra.equals("")) {
			opcao = 'F';
			return opcao;
		}else {
		 opcao = Letra.toUpperCase().charAt(0);
		return opcao;
		}
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
		System.out.println("                            				    ESCALA A (" + EscalaA.getNome() + ")"             );                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  		    ESCALA C (" + EscalaC.getNome() + ")             ");                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  		    ESCALA D (" + EscalaD.getNome() + ")              ");                                                                                                    
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
		System.out.println("                            				    ESCALA A (" + EscalaA.getNome() + ")              ");                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  		    ESCALA B (" + EscalaB.getNome() + ")             ");                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  		    ESCALA D (" + EscalaD.getNome() + ")             ");                                                                                                    
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
		System.out.println("                            				    ESCALA A (" + EscalaA.getNome() + ")              ");                                                                   
		System.out.println("                 * *                                                                           * *");
		System.out.println("                           			  		    ESCALA B (" + EscalaB.getNome() + ")              ");                                          
		System.out.println("                 * *                                                                           * *");
		System.out.println("                         			  		    ESCALA C (" + EscalaC.getNome() + ")              ");                                                                                                    
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
