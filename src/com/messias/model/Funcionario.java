package com.messias.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario {

 private DadosPessoais dadosPessoais;


	public DadosPessoais getDadosPessoais() {
	return dadosPessoais;
}


public void setDadosPessoais(DadosPessoais dadosPessoais) {
	this.dadosPessoais = dadosPessoais;
}


	public void AtualizarSalario(BigDecimal aumento) {
		this.dadosPessoais.setSalario(aumento);
		this.dadosPessoais.setDataUltimoReajuste(LocalDate.now());
		
	}

	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo); 
		
	}

}