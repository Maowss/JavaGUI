package com.agenda.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.agenda.modelos.Pessoas;
import com.agenda.util.ConnectionFactory;

public class PessoaDao {

	private Connection connection;
	private PreparedStatement stmt;
	
	public PessoaDao() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void cadastraDAO(Pessoas pessoa) {

		String SQL = "insert into pessoa (nome, senha, email, telefone, endereco, idPessoa) values (?, ?, ?, ?, ?, ?)";

		try {
			this.stmt = this.connection.prepareStatement(SQL);

			this.stmt.setString(1, pessoa.getNome());
			this.stmt.setString(2, pessoa.getSenha());
			this.stmt.setString(3, pessoa.getEmail());
			this.stmt.setString(4, pessoa.getTelefone());
			this.stmt.setString(5, pessoa.getEndereco());
			this.stmt.setInt(6, pessoa.getIdPessoa());

			this.stmt.execute();
			this.stmt.close();
			
			buscaPessoas();

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	

	public List<Pessoas> buscaPessoas() {
		String SQL = "select * from pessoa";

		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = this.connection.prepareStatement(SQL);

			List<Pessoas> pessoas = new ArrayList<Pessoas>();

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Pessoas pessoa = new Pessoas();
				pessoa.setNome(rs.getString("nome"));
				pessoa.setSenha(rs.getString("senha"));
				pessoa.setEmail(rs.getString("email"));
				pessoa.setEndereco(rs.getString("endereco"));
				pessoa.setTelefone(rs.getString("telefone"));
				pessoa.setIdPessoa(rs.getInt("idPessoa"));
				pessoas.add(pessoa);
			}

			this.stmt.close();
			this.connection.close();

			return pessoas;
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	}


	public void removerContato(Pessoas pessoas) {
		String SQL = "delete from pessoa where idPessoa=?";
		
		try {
			this.connection = new ConnectionFactory().getConnection();
			PreparedStatement stmt = connection.prepareStatement(SQL);
			this.stmt.setInt(1, pessoas.getIdPessoa());
			this.stmt.execute();
			this.stmt.close();
		}
		catch (SQLException e) {
			throw new RuntimeException (e);
		}
		
	}
	
	public void editarContato(Pessoas pessoa) {

		String SQL = "update pessoa set nome=?,senha=?,email=?,telefone=?,"
				+ "endereco=? where idPessoa=?";

		try {
			this.connection = new ConnectionFactory().getConnection();
			
			this.stmt.setString(1, pessoa.getNome());
			this.stmt.setString(2, pessoa.getSenha());
			this.stmt.setString(3, pessoa.getEmail());
			this.stmt.setString(4, pessoa.getTelefone());
			this.stmt.setString(5, pessoa.getEndereco());
			this.stmt.setInt(6, pessoa.getIdPessoa());

			this.stmt.execute();
			this.stmt.close();
			
			editarContato(pessoa);

		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
