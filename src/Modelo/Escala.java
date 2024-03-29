package Modelo;

import java.util.Map;

import org.joda.time.DateTime;

public class Escala {

	private Character Tipo;
	private String Nome;
	private Map<DateTime, String> estado;

	public Escala() {
		this.estado = Padrao();
		
	}
	
	public Escala(String nome) {
		this.Nome = nome;
		this.estado = Padrao();
	}

	public Escala(char Tipo,String nome) {
		this.Tipo = Tipo;
		this.Nome = nome;
		this.estado = Padrao();
	}
	
	
	
	
	
	public Character getTipo() {
		return Tipo;
	}

	public void setTipo(Character tipo) {
		Tipo = tipo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	

	public Map<DateTime, String> getEstado() {
		return estado;
	}
	

	public void setEstado(Map<DateTime, String> estado) {
		this.estado = estado;
	}
	
	public Map<DateTime,String> Padrao(){
		return null;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());

		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Escala other = (Escala) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Escala [Nome=" + Nome + ", estado=" + estado + "]";
	}

	
	
}
