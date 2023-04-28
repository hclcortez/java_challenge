package br.com.hclcortez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hclcortez.JavaChallengeApplication;
import br.com.hclcortez.Service.SalarioPorMesService;
import br.com.hclcortez.Service.ValorMaisAltoPorMesService;

@RestController
public class ValorMaisAltoMesController {
	
	@Autowired
	private ValorMaisAltoPorMesService valorMaisAltoPorMesService;
	
	@RequestMapping("/valormaisaltomes")
	public double handle() {
		return this.valorMaisAltoPorMesService.execute(JavaChallengeApplication.funcionarios, "12", 2021);
	}
}
