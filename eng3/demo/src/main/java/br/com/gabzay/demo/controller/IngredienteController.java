package br.com.gabzay.demo.controller;


import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.gabzay.demo.DAO.DAOIngrediente;
import br.com.gabzay.demo.model.Ingrediente;
import br.com.gabzay.demo.model.NovoIngredienteProduto;

@Controller
@RequestMapping("/ingredientes")
public class IngredienteController {
		DAOIngrediente n =new DAOIngrediente();

	@GetMapping()
	public String ingrediente(Model model) throws SQLException  {
		System.out.println("passou getingrid sem par");

		List<Ingrediente> ingrediente = n.buscaIngrediente();
		model.addAttribute("ingrediente", ingrediente);

		System.out.println("ta buscando ingrediente"+ingrediente.size());
		return "ingrediente";
	}
	

	
	
	@PostMapping("novo")
	public String novo( NovoIngredienteProduto novoIngrediente) {
		
		System.out.println("enviou novo ingrediente");
		
		Ingrediente produto = novoIngrediente.toNovoIngrediente();	
		n.salvar(novoIngrediente);
		System.out.println(novoIngrediente.getQuantidade());
		return "redirect:/ingredientes";
		
	}

	@PostMapping("editaValor")
	public String editaValor( NovoIngredienteProduto editaValor) throws ClassNotFoundException, SQLException {
		
		System.out.println("enviou edita valor ingrediente " +editaValor);
		Ingrediente i = new Ingrediente();
		Ingrediente ingrediente = editaValor.toNovoIngrediente();	
		int id =editaValor.getCodigoItem();
		 Double valor =editaValor.getValor();
		System.out.println("id " +id+ " valor: "+valor);

		i = n.BuscaPorId(id);
		
		
		System.out.println("enviou edita valoringrediente "+ ingrediente.getValor());
		if (valor>=ingrediente.getValor()) {
			ingrediente.setSoma(1);
		}
		System.out.println("enviouedita valor ingrediente "+i.getValor());
		n.Atualizar(ingrediente);
		
		return "redirect:/ingredientes";
		
	}

	
}
