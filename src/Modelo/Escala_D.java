package Modelo;

import java.util.Map;
import java.util.TreeMap;

import org.joda.time.DateTime;

public class Escala_D extends Escala{
	
	private Character Tipo;

	public Escala_D() {
		super();
		if(super.getNome() == null) {
			super.setNome("Escala D");
		}
	}
	
	public Escala_D(String nome) {
		super(nome);
		this.Tipo = 'D';	
	}

	
	public Character getTipo() {
		return Tipo;
	}

	@Override
	public Map<DateTime,String> Padrao(){
		Map<DateTime, String> Escala = new TreeMap<DateTime, String>();
		DateTime inicio = new DateTime(2019, 06, 30, 00, 00, 00);
		do {

			

			DateTime folga_7 = inicio.plusDays(1);
			Escala.put(folga_7, "FOLGA");

			DateTime um_1p5 = folga_7.plusDays(1);
			Escala.put(um_1p5, "TRABALHANDO");

			DateTime folga_8 = um_1p5.plusDays(1);
			Escala.put(folga_8, "FOLGA");

			DateTime um_1p6 = um_1p5.plusDays(2);
			Escala.put(um_1p6, "TRABALHANDO");

			DateTime folga_9 = um_1p6.plusDays(1);
			Escala.put(folga_9, "FOLGA");

			DateTime tres_3 = um_1p6.plusDays(2);
			Escala.put(tres_3, "TRABALHANDO");
			DateTime tres_1 = tres_3.plusDays(1);
			Escala.put(tres_1, "TRABALHANDO");
			DateTime tres_2 = tres_1.plusDays(1);
			Escala.put(tres_2, "TRABALHANDO");

			DateTime folga_10 = tres_2.plusDays(1);
			Escala.put(folga_10, "FOLGA");

			DateTime um_1p1 = tres_2.plusDays(2);
			Escala.put(um_1p1, "TRABALHANDO");

			DateTime folga_11 = um_1p1.plusDays(1);
			Escala.put(folga_11, "FOLGA");

			DateTime dois_1p1 = um_1p1.plusDays(2);
			Escala.put(dois_1p1, "TRABALHANDO");
			DateTime dois_1p2 = dois_1p1.plusDays(1);
			Escala.put(dois_1p2, "TRABALHANDO"); // primeiro

			DateTime folga_12 = dois_1p2.plusDays(1);
			Escala.put(folga_12, "FOLGA");

			DateTime dois_1p3 = dois_1p2.plusDays(2);
			Escala.put(dois_1p3, "TRABALHANDO");
			DateTime dois_1p4 = dois_1p3.plusDays(1);
			Escala.put(dois_1p4, "TRABALHANDO");// segundo

			DateTime folga_13 = dois_1p4.plusDays(1);
			Escala.put(folga_13, "FOLGA");

			DateTime dois_1p5 = dois_1p4.plusDays(2);
			Escala.put(dois_1p5, "TRABALHANDO");
			DateTime dois_1p6 = dois_1p5.plusDays(1);
			Escala.put(dois_1p6, "TRABALHANDO");// terceiro

			DateTime folga_14 = dois_1p6.plusDays(1);
			Escala.put(folga_14, "FOLGA");

			DateTime dois_1p7 = dois_1p6.plusDays(2);
			Escala.put(dois_1p7, "TRABALHANDO");
			DateTime dois_1p8 = dois_1p7.plusDays(1);
			Escala.put(dois_1p8, "TRABALHANDO");// quarto

			DateTime folga_1 = dois_1p8.plusDays(1);
			Escala.put(folga_1, "FOLGA");

			DateTime dois_1p9 = dois_1p8.plusDays(2);
			Escala.put(dois_1p9, "TRABALHANDO");
			DateTime dois_1p10 = dois_1p9.plusDays(1);
			Escala.put(dois_1p10, "TRABALHANDO");// quinto

			DateTime folga_2 = dois_1p10.plusDays(1);
			Escala.put(folga_2, "FOLGA");

			DateTime um_1p2 = dois_1p10.plusDays(2);
			Escala.put(um_1p2, "TRABALHANDO");

			DateTime folga_3 = um_1p2.plusDays(1);
			Escala.put(folga_3, "FOLGA");
			DateTime folga_4 = folga_3.plusDays(1);
			Escala.put(folga_4, "FOLGA");

			DateTime dois_1p11 = um_1p2.plusDays(3);
			Escala.put(dois_1p11, "TRABALHANDO");
			DateTime dois_1p12 = dois_1p11.plusDays(1);
			Escala.put(dois_1p12, "TRABALHANDO");

			DateTime folga_5 = dois_1p12.plusDays(1);
			Escala.put(folga_5, "FOLGA");

			DateTime um_1p3 = dois_1p12.plusDays(2);
			Escala.put(um_1p3, "TRABALHANDO");

			DateTime folga_6 = um_1p3.plusDays(1);
			Escala.put(folga_6, "FOLGA");

			DateTime retorno = um_1p3.plusDays(2);
			Escala.put(retorno, "TRABALHANDO");

			inicio = retorno;

		} while (inicio.getYear() <= 2020);
		Escala.entrySet().removeIf(D -> D.getKey().getYear() > 2020);
		return Escala;
	}

}
