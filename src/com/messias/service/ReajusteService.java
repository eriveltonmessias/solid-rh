package com.messias.service;

import java.math.BigDecimal;
import java.util.List;

import com.messias.model.Funcionario;

public class ReajusteService {
	
	private List<ValidacaoReajuste> validacaoReajustes;
	
	public ReajusteService(List<ValidacaoReajuste> validacaoReajustes) {
		this.validacaoReajustes = validacaoReajustes;
	}
	
	public void reajustarSalario(Funcionario funcionario ,BigDecimal aumento) {
	
		validacaoReajustes.forEach(v -> v.validar(funcionario, aumento));
		BigDecimal novoSalario = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.AtualizarSalario(novoSalario);
		
	}

}
