package com.messias.model;

import java.math.BigDecimal;

public class Tercerizado extends Funcionario{
	
	private DadosPessoais dadosPessoais;
	private String empresa;
	
	


	public Tercerizado(DadosPessoais dadosPessoais, String empresa) {
		super();
		this.dadosPessoais = dadosPessoais;
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}

	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	
	

	
}
