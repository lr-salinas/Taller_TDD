package edu.ucb.tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class AscensorTest {

    @Test
    public void CrearPersona() throws Exception{

        //Preparacion
        Ascensor person = new Ascensor();

        //Logica de la Prueba
        String  resultado = person.verificar("0");

        //Verificacion o Assert
        assertEquals("O", resultado);
    }

}

