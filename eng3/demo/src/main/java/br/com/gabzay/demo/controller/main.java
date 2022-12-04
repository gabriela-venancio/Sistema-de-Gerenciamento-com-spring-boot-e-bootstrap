package br.com.gabzay.demo.controller;

import java.sql.SQLException;
import java.util.List;

import br.com.gabzay.demo.DAO.DAOIngrediente;
import br.com.gabzay.demo.model.Ingrediente;

public class main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// daop.DeletaProduto(9005);
		
	
	//	p = daop.BuscaPorId(9003);
		
		DAOIngrediente p = new DAOIngrediente();
		List<Ingrediente> ingrediente = p.buscaIngrediente();
		
	
		double valor =800;
		double valorCalcualdo;
		  double quantidade = 0.05;
		  valorCalcualdo = ( valor * quantidade);
		  double soma = valorCalcualdo + valor;
		  
	     System.out.println(" \n "+ valor+" soma" +soma);
		  
	}
	}

