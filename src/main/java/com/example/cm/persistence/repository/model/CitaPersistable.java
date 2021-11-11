package com.example.cm.persistence.repository.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Setter
@Getter
@Entity
@Table(name = "cita")
public class CitaPersistable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int estado;
    private int usuario_id;
    private String titulo;
    private String descripcion;
    private int doctor_id;
}
