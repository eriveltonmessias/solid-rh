package com.messias.service.promocao;

import com.messias.model.Cargo;
import com.messias.model.Funcionario;
import com.messias.model.ValidacaoException;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		
		if(Cargo.GERENTE.equals(funcionario.getDadosPessoais().getCargo())) throw new ValidacaoException("Gerente não pode ser promovido");
		if(!metaBatida) throw new ValidacaoException("Funcionario não bateu a meta");
		
		Cargo novoCargo = funcionario.getDadosPessoais().getCargo().getProximoCargo();
		funcionario.promover(novoCargo);
	}

}
