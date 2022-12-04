package br.com.gabzay.demo.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.com.gabzay.demo.factory.FactoryConnection;
import br.com.gabzay.demo.model.EditarProduto;
import br.com.gabzay.demo.model.NovoProduto;
import br.com.gabzay.demo.model.Produtos;

public class DAOProdutos {
	
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

	
	
	public List<Produtos> buscaProduto(){
		String sql = "call buscaTudoProduto();";
		
		List<Produtos> produtos = new ArrayList<Produtos>();
		
		Connection conn = null;
		PreparedStatement pstm= null;
		ResultSet rset = null;
		try {
			conn=FactoryConnection.createConnectionToMySql();
			pstm=(PreparedStatement) conn.prepareStatement(sql);
			
			
			rset = pstm.executeQuery();
			while(rset.next()) {
				Produtos p = new Produtos();
				p.setSku(rset.getInt("sku"));
				p.setNomeProduto(rset.getString("Nome"));
				p.setTamanho(rset.getString("Tamanho"));
				p.setComposto(rset.getString("Composto"));
				p.setTipo(rset.getString("tipo"));
				p.setCategoria(rset.getString("categoria"));
				p.setValorVenda(rset.getDouble("valorVenda"));
				p.setUrlImagem(rset.getString("imagem"));
				p.setSabor(rset.getString("sabor"));
				p.setEmbalagem(rset.getString("Embalagem"));
				p.setQuantidadeEstoque(rset.getInt("quantidade"));
				p.setValorCompra(rset.getDouble("valor_compra"));
				p.setDataEntrada(rset.getString("dataEntrada"));
				
				produtos.add(p);
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
			return produtos;
	}

		
		
		
		
	
	
	public void atualiza(Produtos produtos) {
		String sql= "update produto set Nome =?, sabor=?, categoria=?, tipo=?, valorVenda=?, imagem=?, Composto=?, Embalagem=?, Tamanho=?"+
				"where sku =?";
		
		
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
	
	
	
	
	
	public List<Produtos> BuscaPorNome(String nome) throws SQLException{
		Connection conn = null;
		PreparedStatement pstm= null;
		ResultSet rset = null;
		String sql = "call busca_por_nome_produtos(?);";
			List<Produtos> produtos = new ArrayList<Produtos>();
		
			try {			

				conn=FactoryConnection.createConnectionToMySql();

				
				pstm=(PreparedStatement) conn.prepareStatement(sql);				
				pstm.setString(1, nome);	

				rset = pstm.executeQuery();
			while(rset.next()) {
				Produtos p = new Produtos();
				p.setSku(rset.getInt("sku"));
				p.setNomeProduto(rset.getString("Nome"));
				p.setTamanho(rset.getString("Tamanho"));
				p.setComposto(rset.getString("Composto"));
				p.setTipo(rset.getString("tipo"));
				p.setCategoria(rset.getString("categoria"));
				p.setValorVenda(rset.getDouble("valorVenda"));
				p.setUrlImagem(rset.getString("imagem"));
				p.setSabor(rset.getString("sabor"));
				p.setEmbalagem(rset.getString("Embalagem"));
				p.setQuantidadeEstoque(rset.getInt("quantidade"));
				p.setValorCompra(rset.getDouble("valor_compra"));
				p.setDataEntrada(rset.getString("dataEntrada"));
				
				produtos.add(p);
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
			return produtos;
	}

	public void DeletaProduto(int codigo) throws SQLException, ClassNotFoundException{

		String sql=("delete from produto where sku = ?");

		Connection conn= null;
		
		PreparedStatement pstm = null;
		
		try {
			conn=FactoryConnection.createConnectionToMySql();
			
			pstm=(PreparedStatement) conn.prepareStatement(sql);
			pstm.setInt(1, codigo);

			pstm.executeUpdate();
}
catch (SQLException e) {
e.getMessage();
} 
finally {
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
} }

	
		
			
	public Produtos BuscaPorId(int id) throws SQLException, ClassNotFoundException{
		Connection conn = null;
		PreparedStatement pstm= null;
		ResultSet rset = null;
		String sql = "call busca_por_id_produtos(?);";
			
		Produtos  p = new Produtos();
			try {			

				conn=FactoryConnection.createConnectionToMySql();

				
				pstm=(PreparedStatement) conn.prepareStatement(sql);				
				pstm.setInt(1, id);	

				rset = pstm.executeQuery();
			while(rset.next()) {
				
				p.setSku(rset.getInt("sku"));
				p.setNomeProduto(rset.getString("Nome"));
				p.setTamanho(rset.getString("Tamanho"));
				p.setComposto(rset.getString("Composto"));
				p.setTipo(rset.getString("tipo"));
				p.setCategoria(rset.getString("categoria"));
				p.setValorVenda(rset.getDouble("valorVenda"));
				p.setUrlImagem(rset.getString("imagem"));
				p.setSabor(rset.getString("sabor"));
				p.setEmbalagem(rset.getString("Embalagem"));
				p.setQuantidadeEstoque(rset.getInt("quantidade"));
				p.setValorCompra(rset.getDouble("valor_compra"));
				p.setDataEntrada(rset.getString("dataEntrada"));
				
				System.out.println(p.getNomeProduto());
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

		
}
