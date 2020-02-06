package com.mauricio.entities.jpadao;

import com.mauricio.dao.GenericJPADAO;
import com.mauricio.dao.services.ProjetoDAO;
import com.mauricio.entities.Projeto;

public class ProjetoJPADAO extends GenericJPADAO<Projeto> implements ProjetoDAO{

	public ProjetoJPADAO() {
		super(Projeto.class);
		
	}	
	
}
