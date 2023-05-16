
package com.porfolio.jonna.Interface;

import com.porfolio.jonna.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer a la lista de personas
    public List<Persona> getPersonas();
    
    //Guarda un objeto del tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario, buscado por id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
    
}
