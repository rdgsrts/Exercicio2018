package model;


public class Pais  {
	private int id;
	
	public Pais(){
		
	}
	
	public Pais(int id){
		setId(id);
		
	}	
		
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Pais [id]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		Pais other = (Pais) obj;
		if (id != other.id)
			return false;
		return true;
	}



	
}