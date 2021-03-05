package com.curso.resourses;



import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.curso.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourse {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat3 = new Categoria(3,"Informática");
		Categoria cat4 = new Categoria(4,"Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat3);
		lista.add(cat4);
		
		return lista;
	}
}