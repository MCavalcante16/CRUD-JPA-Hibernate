package com.mauricio.entities.jpadao;

import com.mauricio.dao.GenericJPADAO;
import com.mauricio.dao.services.DependenteDAO;
import com.mauricio.entities.Dependente;

public class DependenteJPADAO extends GenericJPADAO<Dependente> implements DependenteDAO{

	public DependenteJPADAO() {
		super(Dependente.class);
		
	}

	
	
}
