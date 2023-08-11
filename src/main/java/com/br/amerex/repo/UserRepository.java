package com.br.amerex.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.amerex.tfinterface.entities.LoginPage;



public interface UserRepository extends JpaRepository<LoginPage, Integer> {

	public LoginPage findByUsername(String username);
}
