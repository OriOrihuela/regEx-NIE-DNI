package org.lasencinas.main;

import org.lasencinas.dni.DNI;
import org.lasencinas.nie.NIE;
import org.lasencinas.regEx.RegularExpressions;
import org.lasencinas.validator.Validator;

import java.util.HashSet;
import java.util.Set;

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

        /**
         * Now, we create the DNIs and NIEs that will be validated by ours system.
         */

        DNI dni = new DNI(78484464, 'T');
        DNI dni2 = new DNI(72376173, 'A');
        DNI dni3 = new DNI(11817200, 'Q');
        DNI dni4 = new DNI(95882054, 'E');
        DNI dni5 = new DNI(63587725, 'Q');
        DNI dni6 = new DNI(26861694, 'V');
        DNI dni7 = new DNI(21616083, 'Q');
        DNI dni8 = new DNI(26868974, 'Y');
        DNI dni9 = new DNI(40135330, 'P');
        DNI dni10 = new DNI(89044648, 'X');

        DNI dni11 = new DNI(7458,'P');
        DNI dni12 = new DNI(12,'A');
        DNI dni13 = new DNI(236,'Q');
        DNI dni14 = new DNI(100,'E');
        DNI dni15 = new DNI(78945621,'p');
        DNI dni16 = new DNI(4578,'C');
        DNI dni17 = new DNI(546,'t');
        DNI dni18 = new DNI(78945612,'I');
        DNI dni19 = new DNI(78945612,'O');
        DNI dni20 = new DNI(96345896,'U');

        NIE nie = new NIE('X', 4578963, 'A');
        NIE nie2 = new NIE('Y', 4563017, 'B');
        NIE nie3 = new NIE('Z', 8796430, 'G');
        NIE nie4 = new NIE('X', 2543312, 'A');
        NIE nie5 = new NIE('Y', 3300213, 'R');
        NIE nie6 = new NIE('Z', 4531269, 'V');
        NIE nie7 = new NIE('X', 5566443, 'X');
        NIE nie8 = new NIE('Y', 3300147, 'Z');
        NIE nie9 = new NIE('Z', 8764559, 'Y');
        NIE nie10 = new NIE('X', 9999745, 'P');

        NIE nie11 = new NIE('X', 45763, 'i');
        NIE nie12 = new NIE('I', 4578963, 'A');
        NIE nie13 = new NIE('P', 45763, 'A');
        NIE nie14 = new NIE('Y', 45, 'A');
        NIE nie15 = new NIE('Z', 4578963, 'U');
        NIE nie16 = new NIE('G', 4963, 'A');
        NIE nie17 = new NIE('X', 8963, 'A');
        NIE nie18 = new NIE('Y', 9978963, 'Ñ');
        NIE nie19 = new NIE('X', 4572263, 'O');
        NIE nie20 = new NIE('Z', 7894510, 'u');

        /**
         * Now, we create the Validator system.
         */

        Set<DNI> dniSet = new HashSet<>();
        Set<NIE> nieSet = new HashSet<>();
        Validator validator = new Validator(dniSet, nieSet);

        /**
         * After creating the Validator System, we need to introduce all the DNIs and NIEs into the Validator database.
         */

        validator.addDni(dni);
        validator.addDni(dni2);
        validator.addDni(dni3);
        validator.addDni(dni4);
        validator.addDni(dni5);
        validator.addDni(dni6);
        validator.addDni(dni7);
        validator.addDni(dni8);
        validator.addDni(dni9);
        validator.addDni(dni10);

        validator.addDni(dni11);
        validator.addDni(dni12);
        validator.addDni(dni13);
        validator.addDni(dni14);
        validator.addDni(dni15);
        validator.addDni(dni16);
        validator.addDni(dni17);
        validator.addDni(dni18);
        validator.addDni(dni19);
        validator.addDni(dni20);

        validator.addNie(nie);
        validator.addNie(nie2);
        validator.addNie(nie3);
        validator.addNie(nie4);
        validator.addNie(nie5);
        validator.addNie(nie6);
        validator.addNie(nie7);
        validator.addNie(nie8);
        validator.addNie(nie9);
        validator.addNie(nie10);

        validator.addNie(nie11);
        validator.addNie(nie12);
        validator.addNie(nie13);
        validator.addNie(nie14);
        validator.addNie(nie15);
        validator.addNie(nie16);
        validator.addNie(nie17);
        validator.addNie(nie18);
        validator.addNie(nie19);
        validator.addNie(nie20);

        /**
         * Now, we finally can validate all the DNIs and NIEs :D
         */
        validator.formDocuments();
        validator.countValidDocuments(regularExpressions);
    }
}
