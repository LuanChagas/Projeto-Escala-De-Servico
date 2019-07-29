package Tela;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Modelo.Escala;

public class TelaPesquisa {
											private	final Scanner sc = new Scanner(System.in);
	
		
											
	public int TelaPesquisa() {
		
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

	public List<Integer> PesquisaDia() {
		List<Integer> lista = new ArrayList<>();
		LimparTela();
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
		System.out.println("                 * *                       ***      DIGITE O DIA       ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		int opcaoDia = sc.nextInt();
		lista.add(opcaoDia);
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
		System.out.println("                 * *                       ***      DIGITE O MES       ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		int opcaoMes = sc.nextInt();
		lista.add(opcaoMes);
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
		System.out.println("                 * *                       ***      DIGITE O ANO       ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		int opcaoAno = sc.nextInt();
		lista.add(opcaoAno);
		return lista;
		
	}
	
	public List<Integer> PesquisaMes(){
		List<Integer> lista = new ArrayList<>();
		LimparTela();
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
		System.out.println("                 * *                       ***      DIGITE O MES       ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		System.out.println("");
		int opcaoMes  = sc.nextInt();
		lista.add(opcaoMes);
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
		System.out.println("                 * *                       ***      DIGITE O ANO       ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		System.out.println("");
		int opcaoAno  = sc.nextInt();
		lista.add(opcaoAno);
		return lista;
	}
	
	public List<Integer> PesquisaPeriodo(){
		List<Integer> lista = new ArrayList<>();
		LimparTela();
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
		System.out.println("                 * *                       ***   DIGITE O MES INICIO   ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		System.out.println("");
		int opcaoMesInicio  = sc.nextInt();
		lista.add(opcaoMesInicio);
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
		System.out.println("                 * *                       ***   DIGITE O ANO iNICIO   ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		System.out.println("");
		int opcaoAnoInicio  = sc.nextInt();
		lista.add(opcaoAnoInicio);
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
		System.out.println("                 * *                       ***   DIGITE O MES FINAL    ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		System.out.println("");
		int opcaoMesFim = sc.nextInt();
		lista.add(opcaoMesFim);
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
		System.out.println("                 * *                       ***   DIGITE O ANO FINAL    ***                     * *");		                                                                        
		System.out.println("                 * *                       *******                 *******                     * *");
		System.out.println("                 * *                       *******************************                     * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 * *                                                                           * *");
		System.out.println("                 *********************************************************************************");
		System.out.println("");
		int opcaoAnoFim  = sc.nextInt();
		lista.add(opcaoAnoFim);
		return lista;
	}
	
	
	public void LimparTela(){
		for(int i = 0 ; i < 50 ; i++) {
			System.out.println(" ");
		}

}
	
	



}
