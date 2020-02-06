package com.mauricio.entities.jpadao;

import com.mauricio.dao.GenericJPADAO;
import com.mauricio.dao.services.PesquisadorDAO;
import com.mauricio.entities.Pesquisador;

public class PesquisadorJPADAO extends GenericJPADAO<Pesquisador> implements PesquisadorDAO{

	public PesquisadorJPADAO() {
		super(Pesquisador.class);
		
	}

	
	
}
