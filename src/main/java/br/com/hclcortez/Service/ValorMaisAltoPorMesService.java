package br.com.hclcortez.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.hclcortez.entity.Funcionario;

@Service
public class ValorMaisAltoPorMesService {

	public double execute(List<Funcionario> funcionarios, String mes, int ano) {

		double retorno = 0D;

		retorno = funcionarios.stream().filter(funcionario -> funcionario.getAnoContrato() == ano)
				.filter(funcionario -> funcionario.getMesContrato().equals(mes))
				.mapToDouble(funcionario -> funcionario.getCargo().salario(funcionario.getAnoContrato())).sum();
		// .collect(Collectors.toList());

		return retorno;
	}

}
