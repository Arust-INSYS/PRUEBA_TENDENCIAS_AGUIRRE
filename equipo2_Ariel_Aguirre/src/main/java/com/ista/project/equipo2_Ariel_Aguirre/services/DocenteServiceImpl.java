/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.project.equipo2_Ariel_Aguirre.services;

import com.ista.project.equipo2_Ariel_Aguirre.model.Docente;
import com.ista.project.equipo2_Ariel_Aguirre.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author 59398
 */
@Service
public class DocenteServiceImpl extends GenericServiceImpl<Docente, Integer> implements DocenteService {

    @Autowired
    DocenteRepository docenteaRepository;

    @Override
    public CrudRepository<Docente, Integer> getDao() {
        return docenteaRepository;
    }

}
