package br.com.gabzay.demo.model;

public class NovoIngredienteProduto {

	int id;
	int codigoItem;
	Double quantidade;
	int codigoPorduto;
	Double valor;
	
	public Ingrediente toNovoIngrediente() {
		Ingrediente i = new Ingrediente();
		i.setCodigoPorduto(codigoPorduto);
		i.setCodigoItem(codigoItem);
		i.setQuantidade(quantidade);

		i.setValor(valor);
		
		i.setId(id);
		return i;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public int getCodigoPorduto() {
		return codigoPorduto;
	}
	public void setCodigoPorduto(int codigoPorduto) {
		this.codigoPorduto = codigoPorduto;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodigoItem() {
		return codigoItem;
	}
	public void setCodigoItem(int codigoItem) {
		this.codigoItem = codigoItem;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	
}
