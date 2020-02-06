package com.mauricio.entities.jpadao;

import com.mauricio.dao.GenericJPADAO;
import com.mauricio.dao.services.FuncionarioLimpezaDAO;
import com.mauricio.entities.FuncionarioLimpeza;

public class FuncionarioLimpezaJPADAO extends GenericJPADAO<FuncionarioLimpeza> implements FuncionarioLimpezaDAO{

	public FuncionarioLimpezaJPADAO() {
		super(FuncionarioLimpeza.class);
		
	}
	
}
