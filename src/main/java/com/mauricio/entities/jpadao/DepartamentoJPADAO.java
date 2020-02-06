package com.mauricio.entities.jpadao;

import com.mauricio.dao.GenericJPADAO;
import com.mauricio.dao.services.DepartamentoDAO;
import com.mauricio.entities.Departamento;

public class DepartamentoJPADAO extends GenericJPADAO<Departamento> implements DepartamentoDAO{

	public DepartamentoJPADAO() {
		super(Departamento.class);
		
	}

	
	
}
