package org.lasencinas.validator;

import org.lasencinas.dni.DNI;
import org.lasencinas.nie.NIE;
import org.lasencinas.regEx.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    /* ---- Behaviours ---- */
    public static boolean validateDNI(DNI dni, RegularExpressions regularExpressions, String identifier) {

        String regEx = regularExpressions.takeOutRegExpression(identifier);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(dni.getDni());

        if (matcher.matches()) {
            System.out.println("This DNI is valid.");
            return true;
        } else {
            System.out.println("This is not a valid DNI, please enter a correct one or we will call the police.");
            return false;
        }
    }

    public static boolean validateNIE(NIE nie, RegularExpressions regularExpressions, String identifier) {

        String regEx = regularExpressions.takeOutRegExpression(identifier);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(nie.getNie());

        if (matcher.matches()) {
            System.out.println("This NIE is valid.");
            return true;
        } else {
            System.out.println("This is not a valid NIE, please enter a correct one or we will call the police.");
            return false;
        }
    }
}
