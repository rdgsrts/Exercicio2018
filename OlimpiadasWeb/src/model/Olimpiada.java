package model;

public class Olimpiada extends Pais{

	private int ouro, prata, bronze;
	public Olimpiada() {
		
	}

	public Olimpiada(int ouro, int prata, int bronze) {
		super();
		this.ouro = ouro;
		this.prata = prata;
		this.bronze = bronze;
	}

	public int getOuro() {
		return ouro;
	}

	public void setOuro(int ouro) {
		this.ouro = ouro;
	}

	public int getPrata() {
		return prata;
	}

	public void setPrata(int prata) {
		this.prata = prata;
	}

	public int getBronze() {
		return bronze;
	}

	public void setBronze(int bronze) {
		this.bronze = bronze;
	}

	@Override
	public String toString() {
		return "Olimpiada [ouro=" + ouro + ", prata=" + prata + ", bronze=" + bronze + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bronze;
		result = prime * result + ouro;
		result = prime * result + prata;
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
		Olimpiada other = (Olimpiada) obj;
		if (bronze != other.bronze)
			return false;
		if (ouro != other.ouro)
			return false;
		if (prata != other.prata)
			return false;
		return true;
	} 
	
}
