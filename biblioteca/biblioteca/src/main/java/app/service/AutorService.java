package app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import app.entity.Autor;

@Service
public class AutorService {
	
	public String save(Autor autor) {
		//COMUNICAÇÃO BD
		return "Autor salvo com sucesso!";
	}
	
	public String delete(long id) {
		//CONVERSA COM O BD
		return "Autor deletado com sucesso!";
	}
	
	public Autor findById(long id) {
		//BD
		
		Autor autor = new Autor();
		autor.setNomeCompleto("abc");
		
		return autor;
	}
	
	public String update(long id, Autor autor) {
		//BD
		return "Autor foi atualizado com sucesso!";
	}
	
	public List<Autor> findAll(){
		List<Autor> lista = new ArrayList<>();
		
		Autor autor1 = new Autor();
		autor1.setNomeCompleto("abc");
		
		Autor autor2 = new Autor();
		autor2.setNomeCompleto("bcd");
		
		lista.add(autor1);
		lista.add(autor2);
		
		return lista;
	}

}
