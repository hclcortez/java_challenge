package br.com.hclcortez.entity;

public class Venda {
	private String mes;
	private int ano;
	private double valor;
	
	public Venda(String mes, int ano, double valor) {
		this.mes = mes;
		this.ano = ano;
		this.valor = valor;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
