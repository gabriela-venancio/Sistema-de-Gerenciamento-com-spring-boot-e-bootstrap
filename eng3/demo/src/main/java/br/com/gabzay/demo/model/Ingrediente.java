package br.com.gabzay.demo.model;

public class Ingrediente {

	int id;
	int codigoItem;
	int codigoPorduto;
	String tipo;
	String categoria;
	Double valor;
	String nomeProduto;
	Double quantidade;
	String nomeIngrediente;
	int quantidadeIngrPorProduto;
	int soma;
	
	
	public int getSoma() {
		return soma;
	}
	public void setSoma(int soma) {
		this.soma = soma;
	}
	public int getQuantidadeIngrPorProduto() {
		return quantidadeIngrPorProduto;
	}
	public void setQuantidadeIngrPorProduto(int quantidadeIngrPorProduto) {
		this.quantidadeIngrPorProduto = quantidadeIngrPorProduto;
	}
	public String getNomeIngrediente() {
		return nomeIngrediente;
	}
	public void setNomeIngrediente(String nomeIngrediente) {
		this.nomeIngrediente = nomeIngrediente;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public int getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	public int getCodigoPorduto() {
		return codigoPorduto;
	}
	public void setCodigoPorduto(int codigoPorduto) {
		this.codigoPorduto = codigoPorduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Double getValor() {
		return valor;
	}
	public void setValor(Double Valor) {
		this.valor = Valor;
	}



}
