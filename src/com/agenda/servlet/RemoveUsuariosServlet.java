package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelos.Pessoas;
import com.agenda.service.CadastroUsuarioService;

@WebServlet("/remover-contatos")
public class RemoveUsuariosServlet extends HttpServlet{
	
	

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idPessoa = Integer.parseInt(request.getParameter("idPessoa"));
		
		CadastroUsuarioService service;
		System.out.println("Servlet remover executada com sucesso");
		Pessoas pessoas = new Pessoas();
		pessoas.setIdPessoa(idPessoa);

		service = new CadastroUsuarioService();
		service.removerContato(pessoas);
		
		response.sendRedirect("lista-usuario");
	}
}
