package com.dhyegopedroso.workshopmongo.serives;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhyegopedroso.workshopmongo.domain.User;
import com.dhyegopedroso.workshopmongo.repository.UserRepository;
import com.dhyegopedroso.workshopmongo.serives.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}
