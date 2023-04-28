package br.com.hclcortez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hclcortez.JavaChallengeApplication;
import br.com.hclcortez.Service.SalarioPorMesService;

@RestController
public class SalarioPorMesController {

	@Autowired
	private SalarioPorMesService salarioPorMesService;
	
	@RequestMapping("/salariopormes")
	public double handle() {
		return this.salarioPorMesService.execute(JavaChallengeApplication.funcionarios, "12", 2021);
	}
	
}
