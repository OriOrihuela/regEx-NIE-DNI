package org.lasencinas.nie;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NIETest {

    /* ---- Properties ---- */
    private NIE nie = null;


    /* ---- Behaviours ---- */
    @Before
    public void __init__() {
        nie = new NIE('X', 3204761, 'C');
    }

    @Test
    public void constructorTest() {
        assertNotNull(nie);
    }

    @Test
    public void gettersAndSettersTest() {
        assertEquals(3204761, nie.getNumbers());
        Character answer = 'C';
        assertEquals(answer, nie.getFinalLetter());

        nie.setFirstLetter('G');
        Character answer1 = 'G';
        assertEquals(answer1, nie.getFirstLetter());

        nie.setNumbers(6987423);
        assertEquals(6987423, nie.getNumbers());
    }

    @Test
    public void formDNITest() {
        nie.formNIE();
        assertNotNull(nie.getNie());
        assertEquals("X3204761C", nie.getNie());
    }
}
