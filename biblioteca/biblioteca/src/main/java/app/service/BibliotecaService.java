package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Biblioteca;

@Service
public class BibliotecaService {
	
	public String save(Biblioteca biblioteca) {
		//COMUNICAÇÃO BD
		return "Biblioteca salvo com sucesso!";
	}
	
	public String delete(long id) {
		//CONVERSA COM O BD
		return "Biblioteca deletado com sucesso!";
	}
	
	public Biblioteca findById(long id) {
		//BD
		
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setNome("abc");
		
		return biblioteca;
	}
	
	public String update(long id, Biblioteca biblioteca) {
		//BD
		return "Biblioteca foi atualizado com sucesso!";
	}
	
	public List<Biblioteca> findAll(){
		List<Biblioteca> lista = new ArrayList<>();
		
		Biblioteca biblioteca1 = new Biblioteca();
		biblioteca1.setNome("abc");
		
		Biblioteca biblioteca2 = new Biblioteca();
		biblioteca2.setNome("bcd");
		
		lista.add(biblioteca1);
		lista.add(biblioteca2);
		
		return lista;
	}

}