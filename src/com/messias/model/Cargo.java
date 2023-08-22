package com.messias.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo getProximoCargo() {
			return ANALISTA;
			
		}
	},
	ANALISTA {
		@Override
		public Cargo getProximoCargo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo getProximoCargo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo getProximoCargo() {
			return this;
		}
	};

	public abstract Cargo getProximoCargo();

}