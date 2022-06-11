package com.code.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	Optional<Usuario> findByEmail(String Email);
}
