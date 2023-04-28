package br.com.hclcortez.entity;

import java.time.Year;

public class Vendedor extends Cargo{

	public Vendedor() {
		super();
	}
	
	@Override
	public double salario(int anoContrato) {
		return 12000 + (1800 * (Year.now().getValue() - anoContrato));
	}
	
}
