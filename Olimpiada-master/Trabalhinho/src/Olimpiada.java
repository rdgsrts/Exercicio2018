import java.util.ArrayList;

public class Olimpiada
{
	private int ano;
	private String tipo;
	
	public ArrayList<Modalidade> modalidade;
	
	public Olimpiada() 
	{
		ano = 0;
		tipo = "";
		modalidade = new ArrayList<Modalidade>();
	}

	public Olimpiada(int ano, String tipo) 
	{
		this.ano = ano;
		this.tipo = tipo;
	}

	public int getAno() 
	{
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
