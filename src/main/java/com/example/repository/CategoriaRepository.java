package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	@Query("SELECT count(c) FROM Categoria c  WHERE c.descripcion=?1")
	int verificarExistencia(String descripcion);
	List<Categoria> findByDescripcionContainingIgnoreCase(String descripcion);
	List<Categoria> findByEstado(int e);
}
