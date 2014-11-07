package com.marioaliaga.capadatos;

/**
 * Created by Mario on 06/11/2014.
 */
import com.marioaliaga.capadatos.domain.Persona;

import java.util.List;


public interface PersonaDao {

    void insertPersona(Persona persona);

    void updatePersona(Persona persona);

    void deletePersona(Persona persona);

    Persona findPersonaById(long idPersona);

    List<Persona> findAllPersonas();

    long contadorPersonas();

    Persona getPersonaByEmail(Persona persona);
}
