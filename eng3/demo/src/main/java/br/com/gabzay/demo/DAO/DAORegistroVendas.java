package br.com.gabzay.demo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.gabzay.demo.factory.FactoryConnection;
import br.com.gabzay.demo.model.Produtos;
import br.com.gabzay.demo.model.RegistroVendas;

public class DAORegistroVendas {

public void salvar(Produtos produtos) {
		
		String sql ="call inclui_novo_produto(?,?,?,?,?,?,?,?,?,?,?)";
		
		Connection conn= null;
		
		PreparedStatement pstm = null;
		
		try {
			conn=FactoryConnection.createConnectionToMySql();
			
			pstm=(PreparedStatement) conn.prepareStatement(sql);
			
			
			
			pstm.setString(1, produtos.getNomeProduto());
			pstm.setString(2, produtos.getSabor());
			pstm.setString(3, produtos.getCategoria());
			pstm.setString(4, produtos.getTipo());
			pstm.setDouble(5, produtos.getValorVenda());
			pstm.setString(6, produtos.getUrlImagem());
			pstm.setString(7, produtos.getComposto());
			pstm.setString(8, produtos.getEmbalagem());
			pstm.setString(9, produtos.getTamanho());
			pstm.setInt(10,produtos.getQuantidadeEstoque());
			pstm.setDouble(11, produtos.getValorCompra());
			
			
			pstm.execute();
			}catch(Exception e) {
				e.printStackTrace();
				
			}finally {
				try {
					if(pstm!= null) {
						pstm.close();
					}
					if(conn!= null) {
						conn.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
	}
	
}
