package com.br.amerex.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.amerex.controller.CustomUserDetail;
import com.br.amerex.repo.UserRepository;
import com.br.amerex.tfinterface.entities.LoginPage;

@Service
public class CustomUserDetailService implements UserDetailsService   {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		LoginPage lgp = this.userRepository.findByUsername(username);
			if(lgp==null) {
				throw new UsernameNotFoundException("Not Found");
			}
		return new CustomUserDetail(lgp);
	}

}
