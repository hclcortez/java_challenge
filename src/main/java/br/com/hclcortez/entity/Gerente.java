package br.com.hclcortez.entity;

import java.time.Year;

public class Gerente extends Cargo {

	public Gerente() {
		super();
	}

	@Override
	public double salario(int anoContrato) {
		return 20000 + (3000 * (Year.now().getValue() - anoContrato));
	}

}
