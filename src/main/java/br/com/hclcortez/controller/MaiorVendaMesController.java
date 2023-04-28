package br.com.hclcortez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hclcortez.entity.Funcionario;

@RestController
public class MaiorVendaMesController {

	@RequestMapping("/maiorvendames")
	public Funcionario handle() {
		return null;
	}
	
}
