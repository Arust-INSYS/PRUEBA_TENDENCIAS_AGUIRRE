/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.project.equipo2_Ariel_Aguirre.services;

import com.ista.project.equipo2_Ariel_Aguirre.model.Asignatura;
import com.ista.project.equipo2_Ariel_Aguirre.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author 59398
 */
@Service
public class AsignaturaServiceImpl extends GenericServiceImpl<Asignatura, Integer> implements AsignaturaService {

    @Autowired
    AsignaturaRepository asignaturaRepository;

    @Override
    public CrudRepository<Asignatura, Integer> getDao() {
        return asignaturaRepository;
    }

    public Asignatura buscarAsignatura(String nombre) {
        return asignaturaRepository.buscarAsignatura(nombre);
    }

}
