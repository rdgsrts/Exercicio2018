
public class Modalidade
{
	private int id, ouro, prata, bronze;
	private String nome;
	
	public Modalidade() 
	{
		id = 0;
		ouro = 0;
		prata = 0;
		bronze = 0;
		nome = "";
	}

	public Modalidade(int id, int ouro, int prata, int bronze, String nome) 
	{
		this.id = id;
		this.ouro = ouro;
		this.prata = prata;
		this.bronze = bronze;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
