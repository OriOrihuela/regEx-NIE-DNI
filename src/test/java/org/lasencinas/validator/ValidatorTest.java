package org.lasencinas.validator;

import static org.junit.Assert.*;

import org.junit.Test;
import org.lasencinas.dni.DNI;
import org.lasencinas.nie.NIE;
import org.lasencinas.regEx.RegularExpressions;

public class ValidatorTest {

    /* ---- Properties ---- */
    private DNI dni = new DNI(43204761, 'C');
    private DNI incorrectDni = new DNI(856742195, 'O');

    private NIE nie = new NIE('X', 5478963, 'Z');
    private NIE incorrectNIE = new NIE('F', 55, 'S');


    private RegularExpressions regularExpressions = new RegularExpressions();


    /* ---- Behaviours ---- */
    @Test
    public void constructorsTest() {
        assertNotNull(dni);
        assertNotNull(nie);
        assertNotNull(incorrectDni);
        assertNotNull(incorrectNIE);
        assertNotNull(regularExpressions);
    }

    @Test
    public void validateDnis() {
        regularExpressions.addRegExpression("DNI", "^\\d{8}[A-Z&&[^IÑOU]]{1}$");
        dni.formDNI();
        assertTrue(Validator.validateDNI(dni, regularExpressions, "DNI"));

        incorrectDni.formDNI();
        assertFalse(Validator.validateDNI(incorrectDni, regularExpressions, "DNI"));

        /*regularExpressions.addRegExpression("NIE", "^[XYZ]{1}]\\d{7}[A-Z&&[^IÑOU]]{1}]$");
        nie.formNIE();
        assertTrue(Validator.validateNIE(nie, regularExpressions, "NIE"));*/
    }

}
