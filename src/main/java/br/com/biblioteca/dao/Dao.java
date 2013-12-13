package br.com.biblioteca.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao<Entidade> {
	
	Entidade carregarPorId(Serializable id);
	
	List<Entidade> listar();
	
	void salvar(Entidade livro);
	
	void atualizar(Entidade livro);
	
	void deletar(Entidade livro);
	
}
