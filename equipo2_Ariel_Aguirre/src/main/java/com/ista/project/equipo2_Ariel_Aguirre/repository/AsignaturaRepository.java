/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ista.project.equipo2_Ariel_Aguirre.repository;

import com.ista.project.equipo2_Ariel_Aguirre.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author 59398
 */
public interface AsignaturaRepository extends JpaRepository<Asignatura, Integer> {

    @Query(value = "Select * from asignatura a where a.nombre = :nombre", nativeQuery = true)
    public Asignatura buscarAsignatura(String nombre);
}
