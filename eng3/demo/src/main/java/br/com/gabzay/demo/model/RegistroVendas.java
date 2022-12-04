package br.com.gabzay.demo.model;

public class RegistroVendas {

	int sku;
	int idPedido;
	
	int idItem;
	String nome;
	double valor;
	int quantidade;
	double valorQuantidade;
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorQuantidade() {
		return valorQuantidade;
	}
	public void setValorQuantidade(double valorQuantidade) {
		this.valorQuantidade = valorQuantidade;
	}
	
	
	
}
