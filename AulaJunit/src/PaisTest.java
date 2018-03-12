package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import model.pais;
 
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import org.junit.jupiter.api.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, copia;
	static int id = 0;
}

@Before
public void setUp() throws Exception {
	System.out.println("setup");
	pais = new Pais(id, "Suiça", "111231","14875569" );
	copia = new Pais(id, "Suiça", "111231","14875569" );
	System.out.println(pais);
	System.out.println(copia);
	System.out.println(id);
}
class PaisTest {
	@Test
	public void test01Criar( pais) {
	System.out.println("criar");
	pais.criar();
	id = pais.getId();
	System.out.println(id);
	copia.setId(id);
	assertEquals("testa criacao", pais, copia);

	}

	@Test
	public void test02Atualizar() {
	System.out.println("atualizar");
	pais.setpopulação("999999");
	copia.setArea("999999");
	pais.atualizar();
	pais.carregar();
	assertEquals("testa atualizacao", pais, copia);
	
	}	
	@Test
	public void test03Excluir() {
	System.out.println("excluir");
	copia.setId(-1);
	copia.setNome(null);
	copia.setPopulaçao(null);
	copia.setAre(null);
	pais.carregar();
	assertEquals("testa exclusao", pais, copia);

	@Test
	public void test00Carregar() {
	System.out.println("carregar");
	//para funcionar o cliente 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais(1, "Suiça", "111231","14875569");
	Pais novo = new Pais(1, null, null, null);
	novo.carregar();
	assertEquals("testa inclusao", novo, fxture);
	
	@Test
	public void testcarregarmaiorpais() {
	System.out.println("carregar");
	//para funcionar o cliente 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais(1, "Suiça", "111231","14875569");
	Pais novo = new Pais(1, null, null, null);
	novo.carregar();
	assertEquals("testa inclusao", novo, fxture);
	
	}
	@Test
	public void carregarmenorpais() {
	System.out.println("carregar");
	//para funcionar o cliente 1 deve ter sido carregado no banco por fora
	Pais fixture = new Pais(1, "Suiça", "111231","14875569");
	Pais novo = new Pais(1, null, null, null);
	novo.carregar();
	assertEquals("testa inclusao", novo, fxture);
}
