package com.mauricio.entities.jpadao;

import com.mauricio.dao.GenericJPADAO;
import com.mauricio.dao.services.TrabalhoDAO;
import com.mauricio.entities.Trabalho;

public class TrabalhoJPADAO extends GenericJPADAO<Trabalho> implements TrabalhoDAO{

	public TrabalhoJPADAO() {
		super(Trabalho.class);
		
	}

	
	
}
