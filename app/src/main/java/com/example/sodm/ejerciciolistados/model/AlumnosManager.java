package com.example.sodm.ejerciciolistados.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sodm on 4/28/2017.
 */

public class AlumnosManager {

    public List<Alumno> obtenerAlumnos() {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Luis", 22));
        alumnos.add(new Alumno("Jose", 20));

        return alumnos;
    }


}
