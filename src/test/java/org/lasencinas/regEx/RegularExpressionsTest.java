package org.lasencinas.regEx;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class RegularExpressionsTest {

    /* ---- Properties ---- */
    private RegularExpressions regularExpressions = null;


    /* ---- Behaviours ---- */
    @Before
    public void __init__() {
        regularExpressions = new RegularExpressions();
    }

    @Test
    public void constructorTest() {
        assertNotNull(regularExpressions);
    }

    @Test
    public void addRegExpressionTest() {
        String regEx = "^\\d{8}[A-Z&&[^IÑOU]]{1}$";
        String regEx2 = "^[XYZ]{1]\\d{7}[A-Z&&[^IÑOU]]{1]$";

        regularExpressions.addRegExpression("DNI", regEx);
        regularExpressions.addRegExpression("NIE", regEx2);

        assertNotNull(regularExpressions.getRegularExpressions());
        assertEquals(2, regularExpressions.getSize());
        assertEquals(regEx, regularExpressions.takeOutRegExpression("DNI"));
        assertEquals(regEx2, regularExpressions.takeOutRegExpression("NIE"));
    }


}
