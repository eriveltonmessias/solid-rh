package com.messias.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.messias.model.Funcionario;
import com.messias.model.ValidacaoException;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

	@Override
	public void validar(Funcionario funcionario, BigDecimal aumento) {
	
		BigDecimal percentualReajuste = aumento.divide(funcionario.getSalario(), RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}

	}

}
