package br.com.biblioteca.controladores;

import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.biblioteca.dao.Dao;
import br.com.biblioteca.dao.JpaDao;
import br.com.biblioteca.entidades.Livro;
import br.com.biblioteca.utilitarios.JpaUtil;

@ManagedBean
public class LivroBean {
	
	private Dao<Livro> dao = new JpaDao<Livro>(Livro.class, JpaUtil.getEntityManager());
	
	private String titulo;
	private String autor;
	private String categoria;
	private Date dataPublicacao;
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	public void salva(){
		System.out.println(titulo + autor);
	}
	
	public List<Livro> getLivros(){
		
		return dao.listar();
	}
	
	public void deletar(Livro livro){
		
		dao.deletar(livro);
	}

}
