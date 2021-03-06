package br.com.microsevice.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.microsevice.loja.controller.dto.CompraDTO;
import br.com.microsevice.loja.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {
	
	@Autowired
	private CompraService compraService;

	@PostMapping
	public void realizaCompra(@RequestBody CompraDTO compra) {
		compraService.realizaCompra(compra);
	}
	
}
