package Servicos;

import org.joda.time.DateTime;

import Modelo.Escala;
import Modelo.Escala_A;
import Modelo.Escala_B;
import Modelo.Escala_C;
import Modelo.Escala_D;

public class TelaPesquisaServicos {
	
	
	
	public void PesquisaDia(int dia,int mes,int ano) {
		Escala EscA = new Escala_A();
		Escala EscB = new Escala_B();
		Escala EscC = new Escala_C();
		Escala EscD = new Escala_D();
		
		DateTime DataDia = new DateTime(ano,mes,dia,0,0,0);
		
		System.out.println("Dia 10");
		
		EscA.getEstado().forEach((K,V)-> {
			if(K.equals(DataDia)) {
				System.out.println(EscA.getNome() + " "+  V.toString());
			}
		}); 
		EscB.getEstado().forEach((K,V)-> {
			if(K.equals(DataDia)) {
				System.out.println(EscB.getNome() + " "+  V.toString());
			}
		});
		EscC.getEstado().forEach((K,V)-> {
			if(K.equals(DataDia)) {
				System.out.println(EscC.getNome() + " "+  V.toString());
			}
		});
		EscD.getEstado().forEach((K,V)-> {
			if(K.equals(DataDia)) {
				System.out.println(EscD.getNome() + " "+  V.toString());
			}
		});
		
	}
	

	
	
}
