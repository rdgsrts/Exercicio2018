package model;

public class Modalidade extends Ano {

	private String Nome;

	public Modalidade() {
	
	}

	public Modalidade(String nome) {
		super();
		Nome = nome;
	}

	@Override
	public String getTipo() {
		return super.getTipo();
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	@Override
	public String toString() {
		return "Modalidade [Nome=" + Nome + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Nome == null) ? 0 : Nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modalidade other = (Modalidade) obj;
		if (Nome == null) {
			if (other.Nome != null)
				return false;
		} else if (!Nome.equals(other.Nome))
			return false;
		return true;
	}
		
}
