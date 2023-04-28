package br.com.hclcortez;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Startup {

	public List<String> funcionarios;

	public List<String> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<String> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
}
