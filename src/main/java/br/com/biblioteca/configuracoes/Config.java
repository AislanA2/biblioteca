package br.com.biblioteca.configuracoes;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Config implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// do nothing
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.setProperty("org.apache.el.parser.COERCE_TO_ZERO", "false");		
	}

}
