package br.com.gabzay.demo.model;

import java.time.LocalDate;

public class Vendas {
 int idVenda;
 String CPFVendedor;
 LocalDate dataVenda;
 int codigoPedido;
 
public int getCodigoPedido() {
	return codigoPedido;
}
public void setCodigoPedido(int codigoPedido) {
	this.codigoPedido = codigoPedido;
}
public int getIdVenda() {
	return idVenda;
}
public void setIdVenda(int idVenda) {
	this.idVenda = idVenda;
}
public String getCPFVendedor() {
	return CPFVendedor;
}
public void setCPFVendedor(String cPFVendedor) {
	CPFVendedor = cPFVendedor;
}
public LocalDate getDataVenda() {
	return dataVenda;
}
public void setDataVenda(LocalDate dataVenda) {
	this.dataVenda = dataVenda;
}
 
}
