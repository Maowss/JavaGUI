package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDao;
import com.agenda.modelos.Pessoas;

public class CadastroUsuarioService {

	public void cadastra(Pessoas pessoa) {
		PessoaDao userDAO = new PessoaDao();
		userDAO.cadastraDAO(pessoa);
	}

	private PessoaDao dao;

	public CadastroUsuarioService() {
		this.dao = new PessoaDao();
		
	}

	public void adiciona(Pessoas pessoa) {
		this.dao.cadastraDAO(pessoa);
	}

	public List<Pessoas> buscaPessoas() {
		return this.dao.buscaPessoas();
	}

}
