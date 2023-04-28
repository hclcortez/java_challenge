package br.com.hclcortez.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValorTotalPagoController {
	
	@RequestMapping("/valortotalpago")
	public double handle() {
		return 0D;
	}
}
