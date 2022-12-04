package br.com.gabzay.demo.model;

import java.math.BigDecimal;

public class Produtos {
	int sku;
	String nomeProduto;
	String tamanho;
	String dataEntrada;
	String composto;
	String tipo;
	String categoria;
	double valorVenda;
	String urlImagem;
	String sabor;
	String embalagem;
	int quantidadeEstoque;
	double valorCompra;
	
	
	public Produtos() {
		super();
	}
	public Produtos(int sku, String nomeProduto, String tamanho, String dataEntrada, String composto,
			String tipo, String categoria, double valorVenda, String urlImagem, String sabor, String embalagem,
			int quantidadeEstoque, double valorCompra) {
		super();
		this.sku = sku;
		this.nomeProduto = nomeProduto;
		this.tamanho = tamanho;
		this.dataEntrada = dataEntrada;
		this.composto = composto;
		this.tipo = tipo;
		this.categoria = categoria;
		this.valorVenda = valorVenda;
		this.urlImagem = urlImagem;
		this.sabor = sabor;
		this.embalagem = embalagem;
		this.quantidadeEstoque = quantidadeEstoque;
		this.valorCompra = valorCompra;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getEmbalagem() {
		return embalagem;
	}
	public void setEmbalagem(String embalagem) {
		this.embalagem = embalagem;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	public String getComposto() {
		return composto;
	}
	public void setComposto(String composto) {
		this.composto = composto;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double d) {
		this.valorVenda = d;
	}

	

	
}
