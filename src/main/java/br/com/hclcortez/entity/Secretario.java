package br.com.hclcortez.entity;

import java.time.Year;

import br.com.hclcortez.contracts.Beneficios;

public class Secretario extends Cargo{

	public Secretario() {
		super();
	}
	
	@Override
	public double salario(int anoContrato) {
		return 7000 + (1000 * (Year.now().getValue() - anoContrato));
	}

}
