package com.messias.service;

import java.math.BigDecimal;

import com.messias.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
