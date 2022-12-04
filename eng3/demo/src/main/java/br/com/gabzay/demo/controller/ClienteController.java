package br.com.gabzay.demo.controller;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.gabzay.demo.model.Cliente;


@Controller
public class ClienteController {

	
	@GetMapping("/clientes")
	public String cliente(Model model) {
		Cliente cliente = new Cliente();
		cliente.setCpf("12345678910");
		cliente.setNome("dantin wossiman");
		cliente.setRua("rua nova");
		cliente.setBairro("nova camp");
		cliente.setCidade("São paulo");
		cliente.setUrl("https://scontent.fgru6-1.fna.fbcdn.net/v/t39.30808-6/289576388_1060616558225467_3040506079679585063_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=8bfeb9&_nc_eui2=AeHft35pqP_meqT_HQriMl7CjuoAfNF5kuCO6gB80XmS4JCXaJ7BS35Ts0TMSLahNe109yY-OKkL0bUPtTqf5qCW&_nc_ohc=ZeRkMMpRE-sAX-4MYD0&_nc_ht=scontent.fgru6-1.fna&oh=00_AfDRhNH3k683ODrhZ_P5bvgh8L02N9b4Lwjb8J1njYUEpQ&oe=637E08F5");
		
		List<Cliente> clientes = Arrays.asList(cliente);
		model.addAttribute("clientes", clientes);
		return "clientes";
		
	}
}
