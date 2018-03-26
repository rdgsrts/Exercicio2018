package service;

import DAO.PaisDAO;
import model.Pais;

public class PaisService {
	PaisDAO paisDAO = new PaisDAO();
	
	public void criar(Pais pais) {
		paisDAO.criar(pais);
	}

	public void atualizar(Pais pais) {
		paisDAO.atualiza(pais);
	}

	public void excluir(int id) {
		paisDAO.excluir(id);
	}

	public void carregar(int id) {
		paisDAO.carregar(id);
	}


}
