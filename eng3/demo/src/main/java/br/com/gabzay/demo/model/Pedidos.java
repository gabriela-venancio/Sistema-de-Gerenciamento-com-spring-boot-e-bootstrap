package br.com.gabzay.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedidos {
 int idPedido;
 int vendaIdVenda;
 LocalDate dataPedido;
 BigDecimal imposto;

public int getIdPedido() {
	return idPedido;
}
public void setIdPedido(int idPedido) {
	this.idPedido = idPedido;
}
public int getVendaIdVenda() {
	return vendaIdVenda;
}
public void setVendaIdVenda(int vendaIdVenda) {
	this.vendaIdVenda = vendaIdVenda;
}
public LocalDate getDataPedido() {
	return dataPedido;
}
public void setDataPedido(LocalDate dataPedido) {
	this.dataPedido = dataPedido;
}
public BigDecimal getImposto() {
	return imposto;
}
public void setImposto(BigDecimal imposto) {
	this.imposto = imposto;
}

 
}
