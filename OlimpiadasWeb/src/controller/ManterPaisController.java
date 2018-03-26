package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pais;
import service.PaisService;

/**
 * Servlet implementation class ManterPaisController
 */
@WebServlet("/ManterPais.do")
public class ManterPaisController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManterPaisController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String populacao = request.getParameter("populacao");
		String area = request.getParameter("area");
		
		Pais pais = new Pais(); 
		pais.setNome(nome); 
		pais.setPopulacao(Integer.parseInt(populacao)); 
		pais.setArea(Integer.parseInt(area)); 
		
		//instanciar o service 
		PaisService cs = new PaisService(); 
		
		cs.criar(pais); 
		pais = cs.carregar(pais.getId()); 
		
		PrintWriter out = response.getWriter(); 
		out.println("<html><head><title>Cliente Cadastrado</title></head><body>");
		out.println( "id: "+pais.getId()+"<br>"); 
		out.println( "nome: "+pais.getNome()+"<br>"); 
		out.println( "populacao: "+pais.getPopulacao()+"<br>"); 
		out.println( "area: "+pais.getArea()+"<br>"); 
		out.println("</body></html>");

	}

}
