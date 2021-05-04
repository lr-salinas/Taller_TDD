package edu.ucb.tdd;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class AscensorTest {

    private Ascensor ascensor;

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void CrearPersona() throws Exception{

        //Preparacion
        Ascensor person = new Ascensor();
        //Logica de la Prueba
        String  resultado = person.verificar("1");
        //Verificacion o Assert
        assertEquals("1", resultado);
    }

    @Test
    public void cuandoAscensorOcupadolanzarExcepcion() throws Exception{

        ascensor.direccion(1);//persona1
        exception.expect(Exception.class);
        ascensor.direccion(1);//persona2
    }

    @Test
    public void colocarPersonaEnPiso() throws Exception{
        //preparacion de la prueba
        //logica de la prueba
        //verificacion o assert

    }

}

