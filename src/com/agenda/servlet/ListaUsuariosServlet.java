package com.agenda.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelos.Pessoas;
import com.agenda.service.CadastroUsuarioService;

public class ListaUsuariosServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	private CadastroUsuarioService service;
	
	public String execute(HttpServletRequest request, HttpServletResponse response)throws Exception{
		this.service = new CadastroUsuarioService();
		
		List<Pessoas> contatos = this.service.buscaPessoas();		
		request.setAttribute("contatos", contatos);
		
		return "teste.jsp";
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
//		System.out.println("Servlet Lista Usuario funcionando");
		try {
			request.getRequestDispatcher(execute(request, response)).forward(request, response);
		}catch (Exception e){
			throw new ServletException("A lógica de negócios causou uma exceção", e);
		}
	}
	
}
