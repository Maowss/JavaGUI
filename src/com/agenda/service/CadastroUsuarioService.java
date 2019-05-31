package com.agenda.service;

import java.util.List;

import com.agenda.dao.PessoaDao;
import com.agenda.modelos.Pessoas;

public class CadastroUsuarioService {

	private PessoaDao dao;

	public CadastroUsuarioService() {
		this.dao = new PessoaDao();	
	}

//	public void adiciona(Pessoas pessoa) { COMENTAMOS O CÓDIGO POIS ELE ESTÁ EFETUANDO UM CADASTRO
//		this.dao.cadastraDAO(pessoa); QUE AGORA ESTÁ ACONTECENDO NO MÉTODO cadastrarOuAlterar
//	}
	
//	public void alterar(Pessoas pessoa) {
//		this.dao.editarContato(pessoa);
//	}

	public List<Pessoas> buscaPessoas() {
		return this.dao.buscaPessoas();
	}

	public void removerContato(Pessoas pessoas) {
		this.dao.removerContato(pessoas);
	}
	
		
	public void cadastrarOuAlterar(Pessoas pessoa) {
		if(0 != pessoa.getIdPessoa()) {
			this.dao.editarContato(pessoa); //CRIAMOS ESTE NOVO MÉTODO QUE CADASTRA E EDITA, PORQUE
		}else { 							//A INTELIGENCIA FICA AQUI, E AQUI O ID JÁ ESTÁ TRANSFORMADO
			this.dao.cadastraDAO(pessoa);	//POIS A TRANSFORMAÇÃO O CORRE NA SERVLET	
		}
	}
	
}
