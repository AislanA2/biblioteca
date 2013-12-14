package br.com.biblioteca.controladores;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import br.com.biblioteca.dao.Dao;
import br.com.biblioteca.dao.JpaDao;
import br.com.biblioteca.entidades.Livro;
import br.com.biblioteca.utilitarios.JpaUtil;

@ManagedBean
public class LivroBean {
	
	private Dao<Livro> dao = new JpaDao<Livro>(Livro.class, JpaUtil.getEntityManager());
	
	private Livro livro = new Livro();
	
	private List<Livro> livros;
	
	@PostConstruct
	public void carregaLivros(){
		livros = dao.listar();
	}
	
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
	public List<Livro> getLivros(){
		return livros;
	}
	
	public void salvar(){
		dao.salvar(livro);
	}
	
	public void deletar(Livro livro){
		dao.deletar(livro);
	}

}
