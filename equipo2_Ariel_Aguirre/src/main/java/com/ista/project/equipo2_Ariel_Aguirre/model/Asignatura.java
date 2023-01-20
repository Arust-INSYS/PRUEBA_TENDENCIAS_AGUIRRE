/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ista.project.equipo2_Ariel_Aguirre.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
/**
 *
 * @author Usuario
 */
@Entity
@Getter
@Setter

public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_asignatura")
    private Integer id_asignatura;
    @Column(name="nombre")
    private String nombre;
    @Column(name="carrera")
    private String carrera;
    @Column(name="hora_ini")
    private String hora_ini;
    @Column(name="hora_fin")
    private String hora_fin;
    
    //Relaciones
    @JsonIgnore
    @OneToMany (mappedBy = "asignatura")
    private List<Docente> docente;
    
}
