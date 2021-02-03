package com.dhyegopedroso.workshopmongo.serives;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhyegopedroso.workshopmongo.domain.Post;
import com.dhyegopedroso.workshopmongo.repository.PostRepository;
import com.dhyegopedroso.workshopmongo.serives.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;

	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

	public List<Post> findByTitle(String text){
		return repository.searchTitulo(text);
	}
	
}
