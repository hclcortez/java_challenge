package br.com.hclcortez.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hclcortez.JavaChallengeApplication;
import br.com.hclcortez.entity.Funcionario;

@RestController
public class IndexController {
	
	@RequestMapping("/")
	public double index() {
		double retorno = 0D;
		
		Funcionario funcionario = JavaChallengeApplication.funcionarios.get(2);
		
		retorno = funcionario.getCargo().salario(funcionario.getAnoContrato());
		
		return retorno;
	}

}
