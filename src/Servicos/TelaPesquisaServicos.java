package Servicos;

import java.util.List;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import org.joda.time.DateTime;

import Modelo.Escala;

public class TelaPesquisaServicos {

	private final Scanner sc = new Scanner(System.in);

	private Escala EscalaA;
	private Escala EscalaB;
	private Escala EscalaC;
	private Escala EscalaD;

	public TelaPesquisaServicos(Escala escalaA, Escala escalaB, Escala escalaC, Escala escalaD) {
		this.EscalaA = escalaA;
		this.EscalaB = escalaB;
		this.EscalaC = escalaC;
		this.EscalaD = escalaD;

	}

	public void PesquisaDia(List<Integer> lista) {

		Escala EscA = EscalaA;
		Escala EscB = EscalaB;
		Escala EscC = EscalaC;
		Escala EscD = EscalaD;

		DateTime DataDia = new DateTime(lista.get(2), lista.get(1), lista.get(0), 0, 0, 0);

		LimparTela();
		System.out.println("DIA " + DataDia.getDayOfMonth() + " DE " + DataDia.monthOfYear().getAsText().toUpperCase());

		EscA.getEstado().forEach((K, V) -> {
			if (K.equals(DataDia)) {
				System.out.println(EscA.getNome() + " - " + V.toString());
			}
		});
		EscB.getEstado().forEach((K, V) -> {
			if (K.equals(DataDia)) {
				System.out.println(EscB.getNome() + " - " + V.toString());
			}
		});
		EscC.getEstado().forEach((K, V) -> {
			if (K.equals(DataDia)) {
				System.out.println(EscC.getNome() + " - " + V.toString());
			}
		});
		EscD.getEstado().forEach((K, V) -> {
			if (K.equals(DataDia)) {
				System.out.println(EscD.getNome() + " - " + V.toString());
			}
		});

		sc.nextLine();

	}

	public void PesquisaMes(List<Integer> lista) {

		DateTime DataMes = new DateTime(lista.get(1), lista.get(0), 01, 0, 0, 0);

		Escala EscA = EscalaA;
		Escala EscB = EscalaB;
		Escala EscC = EscalaC;
		Escala EscD = EscalaD;

		LimparTela();
		while (DataMes.getMonthOfYear() == lista.get(0)) {

			DateTime Retorno = DataMes;

			System.out.println(String.format("DIA  %d DE %s", DataMes.getDayOfMonth(),DataMes.monthOfYear().getAsText().toUpperCase()));
			EscA.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscA.getNome() + " - " + V.toString());
				}
			});
			EscB.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscB.getNome() + " - " + V.toString());
				}
			});
			EscC.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscC.getNome() + " - " + V.toString());
				}
			});
			EscD.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscD.getNome() + " -  " + V.toString());
				}
			});
			System.out.println("");
			DateTime Retorno2 = DataMes.plusDays(1);
			DataMes = Retorno2;
		}
		sc.nextLine();
	}

	public void PesquisaPeriodo(List<Integer> lista) {

		DateTime DataInicio = new DateTime(lista.get(1), lista.get(0), 01, 0, 0, 0);
		DateTime DataIntermediaria = new DateTime(lista.get(3), lista.get(2), 01, 0, 0, 0);
		DateTime DataFim = DataIntermediaria.dayOfMonth().withMaximumValue();
		Escala EscA = EscalaA;
		Escala EscB = EscalaB;
		Escala EscC = EscalaC;
		Escala EscD = EscalaD;

		while (DataInicio.getMonthOfYear() <= lista.get(2)) {

			DateTime Retorno = DataInicio;
			System.out.println("Mes " + DataInicio.monthOfYear().getAsText().toUpperCase());
			System.out.println(String.format("Dia %d", Retorno.getDayOfMonth()));
			EscA.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscA.getNome() + " - " + V.toString());
				}
			});
			EscB.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscB.getNome() + " - " + V.toString());
				}
			});
			EscC.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscC.getNome() + " - " + V.toString());
				}
			});
			EscD.getEstado().forEach((K, V) -> {
				if (K.equals(Retorno)) {
					System.out.println(EscD.getNome() + " -  " + V.toString());
				}
			});
			System.out.println("");
			DateTime Retorno2 = DataInicio.plusDays(1);
			DataInicio = Retorno2;
		}
		sc.nextLine();

	}

	public void LimparTela() {
		for (int i = 0; i <= 50; i++) {
			System.out.println("");
		}
	}
}
