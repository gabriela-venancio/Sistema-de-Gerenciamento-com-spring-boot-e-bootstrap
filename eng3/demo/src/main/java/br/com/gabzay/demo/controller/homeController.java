package br.com.gabzay.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import br.com.gabzay.demo.model.Pedido;

@Controller
public class homeController {

	@GetMapping("/home")
	public String home(Model model) {
		Pedido pedido = new Pedido();		
		pedido.setNomeDoProduto("banana");
		pedido.getData();
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
	
}
