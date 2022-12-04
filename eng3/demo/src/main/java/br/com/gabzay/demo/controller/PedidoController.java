package br.com.gabzay.demo.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.gabzay.demo.model.Pedido;
@Controller
public class PedidoController {

	
	
	@GetMapping("/pedidos")
	public String pedido(Model model) {
		Pedido p = new Pedido();
		
		long data=new Date().getTime();
		p.setCodigoFuncionario(2);
		p.setNomeDoProduto("skol");
		p.setQuantidade(5);
		p.setData(data);
		p.setValorTotal(200);
		
		List<Pedido>ps = Arrays.asList(p);
		
		model.addAttribute("ps", ps);

		return "pedidos";
	}
}
