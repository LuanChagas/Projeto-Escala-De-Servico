package Tela;

import java.util.Scanner;

import Modelo.Escala;
import Modelo.Escala_A;
import Modelo.Escala_B;
import Modelo.Escala_C;
import Modelo.Escala_D;

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
	public char NomearEscalas() {
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
		System.out.println("                 * *                       **   NOMEAR OUTRAS ESCALAS   **                     * *");		                                                                        
		System.out.println("                 * *                       *******     [S/N]       *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		LimparTela(20);
		char tipo = sc.next().toUpperCase().trim().charAt(0);
		
		return tipo;
	}
	
	public Escala_A NomeandoEscalaA(){
		
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
		System.out.println("                 * *                       **     NOME DA ESCALA A      **                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		sc.nextLine();
		String nome = sc.nextLine();
		Escala escala = new Escala_A(nome);
		return (Escala_A) escala;
	}
	
	public Escala_C NomeandoEscalaC(){
			System.out.println("\n");
			System.out.println("                 *********************************************************************************");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * *                       *******************************                     * *");		                                                                        
			System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
			System.out.println("                 * *                       **     NOME DA ESCALA C      **                     * *");		                                                                        
			System.out.println("                 * *                       *******                 *******                     * *");
			System.out.println("                 * *                       *******************************                     * *");
			System.out.println("                 * *                                                                           * *");
			System.out.println("                 * ***************************************************************************** *");
			System.out.println("                 *********************************************************************************");
			
			String nome = sc.nextLine();
			Escala escala = new Escala_C(nome);
			return (Escala_C) escala;
		}

	public Escala_D NomeandoEscalaD(){
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
		System.out.println("                 * *                       **     NOME DA ESCALA D      **                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		String nome = sc.nextLine();
		Escala escala = new Escala_D(nome);
		return (Escala_D) escala;
	}
	
	public Escala_B NomeandoEscalaB(){
		System.out.println("\n");
		System.out.println("                 *********************************************************************************");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 * *                           PROJETO ESCALA SERVICO                          * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                       *******************************                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");		                                                                        
		System.out.println("                 * *                       **     NOME DA ESCALA B      **                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * ***************************************************************************** *");
		System.out.println("                 *********************************************************************************");
		sc.nextLine();
		String nome = sc.nextLine();
		Escala escala = new Escala_B(nome);
		return (Escala_B) escala;
	}
	
	
	
	
	public void LimparTela(){
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println(" ");
		}
	}
	
	public void LimparTela(int esp){
		for(int i = 0 ; i < esp ; i++) {
			System.out.println(" ");
		}
	}
}
