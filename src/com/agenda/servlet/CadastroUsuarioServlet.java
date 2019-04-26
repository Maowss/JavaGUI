package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.modelos.Pessoas;
import com.agenda.service.CadastroUsuarioService;

public class CadastroUsuarioServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		
		Pessoas pessoa = new Pessoas();
		
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setEmail(request.getParameter("email"));
		pessoa.setSenha(request.getParameter("password"));
		pessoa.setTelefone(request.getParameter("telefone"));
		pessoa.setEndereco(request.getParameter("endereco"));
		
	
		CadastroUsuarioService service = new CadastroUsuarioService();
		
		service.cadastra(pessoa);

	}

}
