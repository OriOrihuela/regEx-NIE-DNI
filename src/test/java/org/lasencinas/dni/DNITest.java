package org.lasencinas.dni;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DNITest {

    /* ---- Properties ---- */
    private DNI dni = null;


    /* ---- Behaviours ---- */
    @Before
    public void __init__() {
        dni = new DNI(43204761, 'C');
    }

    @Test
    public void constructorTest() {
        assertNotNull(dni);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals(43204761, dni.getNumbers());
        Character answer = 'C';
        assertEquals(answer, dni.getLetter());

        dni.setLetter('G');
        Character answer1 = 'G';
        assertEquals(answer1, dni.getLetter());

        dni.setNumbers(56987423);
        assertEquals(56987423, dni.getNumbers());
    }

    @Test
    public void formDNITest() {
        dni.formDNI();
        assertNotNull(dni.getDni());
        assertEquals("43204761C", dni.getDni());
    }
}
