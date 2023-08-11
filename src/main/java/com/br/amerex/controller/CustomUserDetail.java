package com.br.amerex.controller;

import java.util.Collection;
import java.util.HashSet;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.br.amerex.tfinterface.entities.LoginPage;

public class CustomUserDetail implements UserDetails{
	
	private LoginPage lgp;
	
	

	public CustomUserDetail(LoginPage lgp) {		
		this.lgp = lgp;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

		HashSet<SimpleGrantedAuthority>set= new HashSet<>();
		set.add(new SimpleGrantedAuthority(this.lgp.getUsername()));
		return set;
	}
	

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.lgp.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return this.lgp.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
