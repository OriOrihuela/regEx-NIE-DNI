package org.lasencinas.validator;

import org.lasencinas.dni.DNI;
import org.lasencinas.nie.NIE;
import org.lasencinas.regEx.RegularExpressions;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    /* ---- Properties of the class ---- */
    private Set<DNI> dniSet = null;
    private Set<NIE> nieSet = null;


    /* ---- Constructor ---- */
    public Validator() {
        this.dniSet = new HashSet<>();
        this.nieSet = new HashSet<>();

    }

    public Validator(Set<DNI> dniSet, Set<NIE> nieSet) {
        this.dniSet = dniSet;
        this.nieSet = nieSet;
    }


    /* ---- Getters ---- */
    public Set<DNI> getDniSet() {
        return dniSet;
    }

    public Set<NIE> getNieSet() {
        return nieSet;
    }

    public int getDniSetSize() {
        return getDniSet().size();
    }

    public int getNieSetSize() {
        return getNieSet().size();
    }


    /* ---- Behaviours ---- */
    public void addDni(DNI dni) {
        getDniSet().add(dni);
    }

    public void addNie(NIE nie) {
        getNieSet().add(nie);
    }

    public static boolean validateDNI(DNI dni, RegularExpressions regularExpressions, String identifier) {

        String regEx = regularExpressions.takeOutRegExpression(identifier);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(dni.getDni());

        if (matcher.matches()) {
            System.out.println("The DNI " + dni.getDni() + " is valid.");
            return true;
        } else {
            System.out.println("The DNI " + dni.getDni() + " is not a valid one, please enter a correct one or we " +
                    "will call the police.");
            return false;
        }
    }

    public static boolean validateNIE(NIE nie, RegularExpressions regularExpressions, String identifier) {

        String regEx = regularExpressions.takeOutRegExpression(identifier);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(nie.getNie());

        if (matcher.matches()) {
            System.out.println("The NIE " + nie.getNie() + " is valid.");
            return true;
        } else {
            System.out.println("The NIE " + nie.getNie() + " is not a valid one, please enter a correct one or we " +
                    "will call the police.");
            return false;
        }
    }

    public void formDocuments() {
        for (DNI dni : dniSet) {
            dni.formDNI();
        }
        for (NIE nie : nieSet) {
            nie.formNIE();
        }
    }

    public void countValidDocuments(RegularExpressions regularExpression) {
        int correctDNIs = 0;
        int correctNIEs = 0;
        int incorrectDNIs = 0;
        int incorrectNIEs = 0;

        for (DNI dni : getDniSet()) {
            if (Validator.validateDNI(dni, regularExpression, "DNI")) {
                correctDNIs += 1;
            } else {
                incorrectDNIs += 1;
            }
        }
        for (NIE nie : getNieSet()) {
            if (Validator.validateNIE(nie, regularExpression, "NIE")) {
                correctNIEs += 1;
            } else {
                incorrectNIEs += 1;
            }
        }

        System.out.println('\n' + "The number of correct DNIs is " + correctDNIs + '.' + '\n' +
                "The number of incorrect DNIs is " + incorrectDNIs + '.' + '\n' +
                "The number of correct NIEs is " + correctNIEs + '.' + '\n' +
                "The number of incorrect NIEs is " + incorrectNIEs + '.' + '\n');
    }
}
