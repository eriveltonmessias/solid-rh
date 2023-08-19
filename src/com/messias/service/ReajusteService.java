package com.messias.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.messias.model.Funcionario;
import com.messias.model.ValidacaoException;

public class ReajusteService {
	
	public void reajustarSalario(Funcionario funcionario ,BigDecimal aumento) {
		BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
			
		BigDecimal novoSalario = funcionario.getSalario().add(aumento);
		
		funcionario.AtualizarSalario(novoSalario);
		
	}

}
