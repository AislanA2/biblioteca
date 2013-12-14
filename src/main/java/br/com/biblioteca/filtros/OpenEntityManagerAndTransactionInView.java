package br.com.biblioteca.filtros;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.com.biblioteca.utilitarios.JpaUtil;

@WebFilter("/*")
public class OpenEntityManagerAndTransactionInView implements Filter {

	@Override
	public void destroy() {
		
		JpaUtil.closeEntityManagerFactory();
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		EntityManager entityManager = JpaUtil.getEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			
			chain.doFilter(request, response);
			
			transaction.commit();
		} catch (Exception e) {
			
			if(transaction != null && transaction.isActive()){
				transaction.rollback();
			}
			
		} finally {
			
			JpaUtil.closeEntityManager();
			
		}
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
	}

}
