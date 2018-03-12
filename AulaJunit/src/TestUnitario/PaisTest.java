package TestUnitario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaisTest {
	@Test
	public void test00Carregar() {
	System.out.println("carregar");
	//para funcionar o cliente 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais();
	Pais novo = new Pais();
	novo.carregar();
	assertEquals("testa inclusao", novo, fxture);
	}

	@Test
	public void testMaiorPais() {
	System.out.println("carregar");
	//para funcionar o cliente 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais(1, "Brasil", "1372470000","2478851");
	copia = new Pais (1, "Brasil", "1372470000","2478851");
	System.out.println(pais);
	System.out.println(copia)
	}
	@Test
	@Test
	public void test00MenorArea() {
	System.out.println("carregar");
	//para funcionar o cliente 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais(1, "Brasil", "1372470000","2478851");
	Pais novo = new Pais();
	novo.carregar();
	assertEquals("testa inclusao", novo, fxture);
	}

	@Test
	public void test02Atualizar() {
	System.out.println("atualizar");
	Object pais;
	pais.setNome("999999");
	copia.setpopulaçao("999999");
	copia.setarea ("9999999");
	atualizar();
	pais.carregar();
	assertEquals("testa atualizacao", pais, copia);
	}
	@Test
	public void test03Excluir() {
	System.out.println("excluir");
	copia.setId(-1);
	copia.setNome(null);
	copia.setpopulação(null);
	copia.setarea(null);
	pais.excluir();
	pais.carregar();
	assertEquals("testa exclusao", pais, copia);

	