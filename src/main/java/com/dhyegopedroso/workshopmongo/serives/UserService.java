package com.dhyegopedroso.workshopmongo.serives;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dhyegopedroso.workshopmongo.domain.User;
import com.dhyegopedroso.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

}
