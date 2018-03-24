import java.util.*;

public class Pais 
{
	private int id;
	private String nome; 
	private long populacao;
	private double area;
	
	public ArrayList<Olimpiada> olimpiada;
	
	public Pais() 
	{
		id = 0;
		nome = null;
		populacao = 0;
		area = 0.0;
		olimpiada = new ArrayList<Olimpiada>();
	}

	public Pais(int id, String nome, long populacao, double area) 
	{
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public long getPopulacao() {
		return populacao;
	}



	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}
	
	
	
	
}
