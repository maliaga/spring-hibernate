package com.marioaliaga.service;

import com.marioaliaga.capadatos.domain.Persona;

import java.util.List;


public interface PersonaService {

    public List<Persona> listarPersonas();

    public Persona recuperarPersona(Persona persona);

    public void agregarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
