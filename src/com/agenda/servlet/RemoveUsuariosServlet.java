package com.agenda.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.agenda.service.CadastroUsuarioService;

@WebServlet("/remover-contatos")
public class RemoveUsuariosServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet remover executada com sucesso");
		
		CadastroUsuarioService service = new CadastroUsuarioService();
		
		service.removerContato(null);
	}
}
