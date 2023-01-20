/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.project.equipo2_Ariel_Aguirre.controller;

import com.ista.project.equipo2_Ariel_Aguirre.model.*;
import com.ista.project.equipo2_Ariel_Aguirre.services.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 59398
 */
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/asignatura")
public class AsigaturaController {

    @Autowired
    AsignaturaService asignaturaService;
    

    @GetMapping("/listar")
    public ResponseEntity< List<Asignatura>> obtenerLista() {
        return new ResponseEntity<>(asignaturaService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<Asignatura> crear(@RequestBody Asignatura a){
     return new ResponseEntity<>(asignaturaService.save(a), HttpStatus.CREATED);
    }
    
      @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Asignatura> eliminar(@PathVariable Integer id) {
        asignaturaService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Asignatura> actualizarAsignatura(@PathVariable Integer id, @RequestBody Asignatura a) {
        Asignatura asignatura = asignaturaService.findById(id);
        if (asignatura == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                
                asignatura.setCarrera(a.getCarrera());
                asignatura.setHora_ini(a.getHora_ini());
                asignatura.setHora_fin(a.getHora_fin());
                return new ResponseEntity<>(asignaturaService.save(asignatura), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }
    
    //------------------------------------------------
    //METODOS DE FACTURA
    DocenteService docenteService;
    

    @GetMapping("/listar_docente")
    public ResponseEntity< List<Docente>> Lista_docente() {
        return new ResponseEntity<>(docenteService.findByAll(), HttpStatus.OK);
    }
    
    @PostMapping("/crear_docente")
    public ResponseEntity<Docente> crear_docente(@RequestBody Docente d){
     return new ResponseEntity<>(docenteService.save(d), HttpStatus.CREATED);
    }
    
      @DeleteMapping("/eliminar_docente/{id}")
    public ResponseEntity<Docente> eliminar_docente(@PathVariable Integer id) {
        docenteService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/actualizar_docente/{id}")
    public ResponseEntity<Docente> actualizarDocente(@PathVariable Integer id, @RequestBody Docente d) {
        Docente docente = docenteService.findById(id);
        if (docente == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                docente.setNombre(d.getNombre());
                docente.setApellido(d.getApellido());
                docente.setCelular(d.getCelular());
                docente.setEmail(d.getEmail());
                return new ResponseEntity<>(docenteService.save(docente), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }

        }

    }
    //------------------------------------
   
}
