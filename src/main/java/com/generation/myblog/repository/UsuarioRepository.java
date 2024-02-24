package com.generation.myblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.myblog.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//public Optional<Usuario> findByEmail(String email);
	boolean existsByEmail(String email);

}
