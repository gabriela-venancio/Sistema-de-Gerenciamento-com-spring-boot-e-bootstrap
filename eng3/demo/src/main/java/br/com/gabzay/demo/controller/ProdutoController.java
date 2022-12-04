package br.com.gabzay.demo.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gabzay.demo.DAO.DAOProdutos;
import br.com.gabzay.demo.model.NovoProduto;
import br.com.gabzay.demo.model.Produtos;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {
	
	DAOProdutos daos;
	
	 public  DAOProdutos daop=new DAOProdutos();
	
	@GetMapping()
	public String produto(Model model) {
		System.out.println("passou no primeiro select model");
		List<Produtos> produtos = daop.buscaProduto();
		model.addAttribute("produtos", produtos);

		return "produtos";
	}
	
	
	@GetMapping("buscaNome")
	public String buscaNome(String buscaNome, Model model) throws SQLException {
		buscaNome= buscaNome.concat("%");
		List<Produtos> produtos = daop.BuscaPorNome(buscaNome);
		model.addAttribute("produtos", produtos);
		
		return "produtos";
	}
	
	@GetMapping("deletaProduto")
	public String deletaProduto(int deletaProduto, Model model) throws SQLException, ClassNotFoundException {
		System.out.println("entrou no controller deleta   " +deletaProduto);
		
		
		daop.DeletaProduto(deletaProduto);
		
		List<Produtos> produtos = daop.buscaProduto();
		model.addAttribute("produtos", produtos);
		
		return "redirect:/produtos";
	}
	
	@GetMapping("detalhes")
	public String detalhes(String detalhes, Model model) throws SQLException, ClassNotFoundException {
		System.out.println("entrou no controller deleta   " +detalhes);
		
		
		List<Produtos> produtos = daop.BuscaPorNome(detalhes);
		model.addAttribute("produtos", produtos);
		
		return "redirect:/produtos/Modaldetalhes";
	}
	@GetMapping("{id}/editaproduto")
	public String editaproduto(@PathVariable int id, NovoProduto editaproduto, Model model) throws SQLException, ClassNotFoundException {
		
		Produtos produtos = this.daop.BuscaPorId(id);
		System.out.println("entrou no controller edita  " +id);
		
		
		System.out.println(produtos);
		
		model.addAttribute("produto", produtos);		
		System.out.println("entrou no controller edita  " +produtos.getNomeProduto());
		
		return "editaproduto";
	}

	@PostMapping("novo")
	public String novo( NovoProduto novoProduto) {
		/*if(result.hasErrors()) {
			return "produtos";
		}
		*/
		
		System.out.println("enviou");
		
		Produtos produto = novoProduto.toNovoProduto();
		daop.salvar(produto);
		System.out.println(produto);
		return "redirect:/produtos";
	}
	

	
}
