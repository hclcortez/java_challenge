package br.com.hclcortez.entity;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private String nome;
	private String mesContrato;
	private int anoContrato;
	private Cargo cargo;
	private List<Venda> vendas = new ArrayList<Venda>();
	
	public Funcionario(String nome, String mesContrato, int anoContrato, Cargo cargo) {
		this.nome = nome;
		this.mesContrato = mesContrato;
		this.anoContrato = anoContrato;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMesContrato() {
		return mesContrato;
	}

	public void setMesContrato(String mesContrato) {
		this.mesContrato = mesContrato;
	}

	public int getAnoContrato() {
		return anoContrato;
	}

	public void setAnoContrato(int anoContrato) {
		this.anoContrato = anoContrato;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	public List<Venda> getVendas(){
		return vendas;
	}
	
	public void addVendas(Venda venda) {
		this.vendas.add(venda);
	}
	
}
