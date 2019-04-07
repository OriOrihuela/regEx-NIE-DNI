package org.lasencinas.main;

import org.lasencinas.dni.DNI;
import org.lasencinas.regEx.RegularExpressions;

public class Main {
    public static void main(String[] args) {

        /**
         * In this Main, we will check that different DNIs and NIEs are valid or not,
         * since the teacher's proposal is to pass about 40 test cases.
         *
         *
         * First of all, we need to list our regular expressions in order to be able
         * to check all the DNIs and NIEs that we are entering in the system.
         */

        RegularExpressions regularExpressions = new RegularExpressions();
        regularExpressions.addRegExpression("DNI", "^\\d{8}[A-Z&&[^IÑOU]]{1}$");
        regularExpressions.addRegExpression("NIE", "^[XYZ]{1}\\d{7}[A-Z&&[^IÑOU]]{1}$");
    }
}
