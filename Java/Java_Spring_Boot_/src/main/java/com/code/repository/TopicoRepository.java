package com.code.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.code.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	List<Topico> findByCurso_Nome(String nomeCurso);
	
	@Query("SELECT tl FROM Topico tl WHERE tl.curso.nome = :nomeCurso")
	List<Topico> carregarPorNomeCurso(@Param("nomCurso") String nomeCurso);
	
}
