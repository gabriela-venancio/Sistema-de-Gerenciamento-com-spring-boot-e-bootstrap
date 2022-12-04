package br.com.gabzay.demo.model;

import java.time.LocalDate;

public class Pedido {

	String nomeDoProduto;
	
	double  valorTotal;
	long data;
	int quantidade;
	
	
	
	int codigoFuncionario;
	
	
	
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}
	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public void setNomeDoProduto(String nomeDoProduto) {
		this.nomeDoProduto = nomeDoProduto;
	}
	
	public long getData() {
		return data;
	}
	public void setData(long data2) {
		this.data = data2;
	}

	
	
	
}
