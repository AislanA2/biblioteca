package br.com.biblioteca.configuracoes;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class Config implements ServletContainerInitializer{

	@Override
	public void onStartup(Set<Class<?>> classes, ServletContext context)
			throws ServletException {
		System.setProperty("org.apache.el.parser.COERCE_TO_ZERO", "false");
	}

}
