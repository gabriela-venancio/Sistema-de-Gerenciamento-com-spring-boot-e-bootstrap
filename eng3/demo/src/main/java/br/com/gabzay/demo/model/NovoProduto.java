package br.com.gabzay.demo.model;

public class NovoProduto {

	String nomeProduto;
	String tamanho;
	
	String composto;
	String tipo;
	String categoria;
	double valorVenda;
	String urlImagem;
	String sabor;
	String embalagem;
	int quantidadeEstoque;
	String dataEntrada;
	double valorCompra;
	int sku;
	
	public int getSku() {
		return sku;
	}
	public void setSku(int sku) {
		this.sku = sku;
	}
	public double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
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
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
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
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Produtos toNovoProduto() {
		Produtos p = new Produtos();
		p.setSku(sku);
		p.setNomeProduto(nomeProduto);
		p.setTamanho(tamanho);
		p.setComposto(composto);
		p.setTipo(tipo);
		p.setCategoria(categoria);
		p.setValorVenda(valorVenda);
		p.setUrlImagem(urlImagem);
		p.setSabor(sabor);
		p.setEmbalagem(embalagem);
		p.setQuantidadeEstoque(quantidadeEstoque);
		return p;
	}
	public void fromProduto(Produtos p) {
		this.nomeProduto = p.getNomeProduto();
		this.categoria=p.getCategoria();
		this.sku = p.getSku();
		this.composto = p.getComposto();
		this.embalagem = p.getEmbalagem();
		this.quantidadeEstoque = p.getQuantidadeEstoque();
		this.sabor =p.getSabor();
		this.tamanho = p.getTamanho();
		this.urlImagem = p.getTamanho();
		this.valorVenda =p.getValorVenda();
		
		
	}
}
