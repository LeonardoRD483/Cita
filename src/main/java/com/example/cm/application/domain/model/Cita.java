package com.example.cm.application.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cita {

    private int estado;
    private int usuario_id;
    private String titulo;
    private String descripcion;
    private int doctor_id;

}
