package br.com.hclcortez;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.hclcortez.entity.Funcionario;
import br.com.hclcortez.entity.Gerente;
import br.com.hclcortez.entity.Secretario;
import br.com.hclcortez.entity.Venda;
import br.com.hclcortez.entity.Vendedor;


@SpringBootApplication
public class JavaChallengeApplication {
	
	public static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	public static List<Funcionario> vendedores = new ArrayList<Funcionario>();
 
	public static void main(String[] args) {
		SpringApplication.run(JavaChallengeApplication.class, args);
		
		Funcionario fun1 = new Funcionario("Jorge Carvalho", "01", 2018,  new Secretario());
		Funcionario fun2 = new Funcionario("Maria Souza", "12", 2015, new Secretario());
		Funcionario fun3 = new Funcionario("Ana Silva", "12", 2021, new Vendedor());
		Funcionario fun4 = new Funcionario("João Mendes", "12", 2021, new Vendedor());
		Funcionario fun5 = new Funcionario("Juliana Alves", "07",2017, new Gerente());
		Funcionario fun6 = new Funcionario("Bento Albino", "03", 2014, new Gerente());
		
		fun3.addVendas(new Venda("12", 2021, 5200));
		fun3.addVendas(new Venda("01", 2022, 4000));
		fun3.addVendas(new Venda("02", 2022, 4200));
		fun3.addVendas(new Venda("03", 2022, 5850));
		fun3.addVendas(new Venda("04", 2022, 7000));
		
		fun4.addVendas(new Venda("12", 2021, 3400));
		fun4.addVendas(new Venda("01", 2022, 7700));
		fun4.addVendas(new Venda("02", 2022, 5000));
		fun4.addVendas(new Venda("03", 2022, 5900));
		fun4.addVendas(new Venda("04", 2022, 6500));
		
		funcionarios.add(fun1);
		funcionarios.add(fun2);
		funcionarios.add(fun3);
		funcionarios.add(fun4);
		funcionarios.add(fun5);
		funcionarios.add(fun6);
		
		vendedores.add(fun3);
		vendedores.add(fun4);
		
	}

}
