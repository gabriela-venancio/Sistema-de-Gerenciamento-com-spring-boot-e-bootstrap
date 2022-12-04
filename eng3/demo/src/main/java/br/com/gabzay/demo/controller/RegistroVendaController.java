package br.com.gabzay.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.gabzay.demo.model.RegistroVendas;

@Controller
public class RegistroVendaController {

	public List<RegistroVendas> rgs = Arrays.asList();
	
	
	
	@GetMapping("/registroVenda")
public String registroVenda(Model model){
	
		RegistroVendas rv = new RegistroVendas();
		//rv.setCodigoVenda(1);
		
		List<RegistroVendas> rvs = Arrays.asList(rv);
		model.addAttribute("rvs", rvs);
		
		return null;
		
}
	
	
}
