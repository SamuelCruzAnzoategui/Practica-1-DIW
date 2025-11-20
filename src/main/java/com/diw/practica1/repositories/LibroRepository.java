package com.diw.practica1.repositories;

import com.diw.practica1.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Integer> {

}