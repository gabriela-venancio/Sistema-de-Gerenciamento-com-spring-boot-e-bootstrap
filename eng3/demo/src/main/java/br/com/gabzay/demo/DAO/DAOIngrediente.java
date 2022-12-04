package br.com.gabzay.demo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.gabzay.demo.factory.FactoryConnection;
import br.com.gabzay.demo.model.Ingrediente;
import br.com.gabzay.demo.model.NovoIngredienteProduto;
import br.com.gabzay.demo.model.Produtos;

public class DAOIngrediente {

	
public void salvar(NovoIngredienteProduto Ingrediente) {
		System.out.println("passou no daoingre");
		String sql ="call Adciona_Ingrediente_Produto(?,?,?); ";
		
		Connection conn= null;
		
		PreparedStatement pstm = null;
		
		try {
			conn=FactoryConnection.createConnectionToMySql();
			
			pstm=(PreparedStatement) conn.prepareStatement(sql);
			
			
			
			pstm.setInt(1, Ingrediente.getCodigoPorduto());
			pstm.setInt(2, Ingrediente.getCodigoItem());
			pstm.setDouble(3, Ingrediente.getQuantidade());
			
			
			
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





public List<Ingrediente> busca_item_produto(){
	String sql = "call BuscaIngredientes();";
	
	List<Ingrediente> ingrediente = new ArrayList<Ingrediente>();
	
	Connection conn = null;
	PreparedStatement pstm= null;
	ResultSet rset = null;
	try {
		conn=FactoryConnection.createConnectionToMySql();
		pstm=(PreparedStatement) conn.prepareStatement(sql);
		
		
		rset = pstm.executeQuery();
		while(rset.next()) {
			Ingrediente p = new Ingrediente();
			
			p.setNomeProduto(rset.getString("Nome"));
			p.setNomeIngrediente(rset.getString("nome"));
			p.setCodigoPorduto(rset.getInt("quantidade"));
			p.setQuantidade(rset.getDouble("valor"));
			p.setCodigoItem(rset.getInt("codigoIngrediente"));
			
			
			
			ingrediente.add(p);
		}}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rset!= null) {
					rset.close();
				}
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
		return ingrediente;
}



public List<Ingrediente> buscaIngrediente(){
	String sql = "call buscaTudo();";
	
	List<Ingrediente> ingrediente = new ArrayList<Ingrediente>();
	
	Connection conn = null;
	PreparedStatement pstm= null;
	ResultSet rset = null;
	try {
		conn=FactoryConnection.createConnectionToMySql();
		pstm=(PreparedStatement) conn.prepareStatement(sql);
		
		
		rset = pstm.executeQuery();
		while(rset.next()) {
			Ingrediente p = new Ingrediente();
		
			p.setTipo(rset.getString("tipo"));
			p.setValor(rset.getDouble("valor"));
			p.setCategoria(rset.getString("categoria"));
			p.setNomeProduto(rset.getString("Nome"));
			p.setNomeIngrediente(rset.getString("nomeIngrediente"));
			p.setCodigoPorduto(rset.getInt("Produto"));
			p.setQuantidade(rset.getDouble("quantidade"));
			p.setCodigoItem(rset.getInt("idIngrediente"));
			
			
			ingrediente.add(p);
		}}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rset!= null) {
					rset.close();
				}
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
		return ingrediente;
}






public Ingrediente BuscaPorId(int id) throws SQLException, ClassNotFoundException{
	Connection conn = null;
	PreparedStatement pstm= null;
	ResultSet rset = null;
	String sql = "call busca_por_id_ingrediente(?);";
		
	Ingrediente  p = new Ingrediente();
		try {			

			conn=FactoryConnection.createConnectionToMySql();

			
			pstm=(PreparedStatement) conn.prepareStatement(sql);				
			pstm.setInt(1, id);	

			rset = pstm.executeQuery();
		while(rset.next()) {
			
			p.setTipo(rset.getString("tipo"));
			p.setValor(rset.getDouble("valor"));
			p.setCategoria(rset.getString("categoria"));
			p.setNomeIngrediente(rset.getString("nomeIngrediente"));
			p.setCodigoItem(rset.getInt("idIngrediente"));
			
			System.out.println(p.getNomeIngrediente());
		}}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(rset!= null) {
					rset.close();
				}
				if(pstm!= null) {
					pstm.close();
				}
				if(conn!= null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}return p;
		
}





public void Atualizar(Ingrediente ingrediente) {
	// TODO Auto-generated method stub
	String sql= "call atualizaIngrediente(?,?,1)";
	
	
	Connection conn= null;
	
	PreparedStatement pstm = null;
	
	try {
		conn=FactoryConnection.createConnectionToMySql();
		
		pstm=(PreparedStatement) conn.prepareStatement(sql);
		
		pstm.setInt(1,ingrediente.getCodigoItem());
		pstm.setDouble(2,ingrediente.getValor());
		
		
		//pstm.setInt(10, produtos.getCodigoProduto());
		pstm.execute();
		
	}catch (Exception e){
		e.printStackTrace();
	}finally {
		try {
			if(pstm!=null) {
				pstm.close();
				
			}
			if(conn!=null) {
				conn.close();
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


}



























