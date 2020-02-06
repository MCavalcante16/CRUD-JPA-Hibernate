package com.mauricio.entities.jpadao;

import com.mauricio.dao.GenericJPADAO;
import com.mauricio.dao.services.SecretarioDAO;
import com.mauricio.entities.Secretario;

public class SecretarioJPADAO extends GenericJPADAO<Secretario> implements SecretarioDAO{
	
	public SecretarioJPADAO() {
		super(Secretario.class);
		
	}

}
