package com.dhyegopedroso.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.dhyegopedroso.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
	List<Post> findByTituloContainingIgnoreCase(String text);
	
	@Query("{ 'titulo': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitulo(String text);
	
}
