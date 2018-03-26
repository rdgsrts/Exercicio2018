package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import model.Pais;
import service.PaisService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PaisTest {
	Pais pais, copia;
	static int id = 0;
	PaisService paisService; 
	/*
	 * Antes de rodar este teste, certifique-se que nao ha no banco nenhuma
	 * linha com o id igual ao do escolhido para o to instanciado abaixo. Se
	 * houver, delete. 
	 * Certifique-se também que sobrecarregou o equals na classe
	 * Pais. 
	 * Certifique-se que a fixture pais1 foi criada no banco.
	 * Além disso, a ordem de execução dos testes é importante; por
	 * isso a anotação FixMethodOrder logo acima do nome desta classe
	 */
	@Before
	public void setUp() throws Exception {
		
		paisService = new PaisService ();
		
		System.out.println("setup");
		pais = new Pais(id);
		copia = new Pais(id);
		System.out.println(pais);
		System.out.println(copia);
		System.out.println(id);
	}
	
	@Test
	public void test00Carregar() {
		System.out.println("carregar");
		Pais fixture = new Pais(id);
		Pais novo = new Pais(id);
		paisService.carregar(id);
		assertEquals("testa inclusao", novo, fixture);
	}

	@Test
	public void test01Criar() {
		System.out.println("criar");
		paisService.criar(pais);
		id = pais.getId();
		System.out.println(id);
		copia.setId(id);
		assertEquals("testa criacao", pais, copia);
	}

	@Test
	public void test02Atualizar() {
		System.out.println("atualizar");
;		
		paisService.atualizar(pais);
		paisService.carregar(id);
		assertEquals("testa atualizacao", pais, copia);
	}

	@Test
	public void test03Excluir() {
		System.out.println("excluir");
		copia.setId(-1);
		paisService.excluir(id);
		paisService.carregar(id);
		assertEquals("testa exclusao", pais, copia);
	}
}
