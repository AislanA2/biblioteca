package br.com.biblioteca.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

public class JpaDao<Entidade> implements Dao<Entidade> {
	
	private EntityManager entityManager;
	private Class<Entidade> tipo;
	
	
	public JpaDao(Class<Entidade> tipo, EntityManager entityManager) {
		this.entityManager = entityManager;
		this.tipo = tipo;
	}

	@Override
	public Entidade carregarPorId(Serializable id) {
		return entityManager.find(tipo, id);
	}

	@Override
	public List<Entidade> listar() {
		
		List<Entidade> entidades = entityManager.createQuery("select l from " + tipo.getSimpleName() + " l", tipo).getResultList();
		
		return entidades;
	}

	@Override
	public void salvar(Entidade entidade) {
		
		entityManager.persist(entidade);
		
	}

	@Override
	public void atualizar(Entidade entidade) {
		
		entityManager.merge(entidade);

	}

	@Override
	public void deletar(Entidade entidade) {
		
		entityManager.remove(entidade);

	}
	
}
