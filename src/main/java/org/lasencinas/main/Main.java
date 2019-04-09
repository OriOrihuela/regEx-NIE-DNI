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
         * Now, we create the Validator system.
         */

        Set<DNI> dniSet = new HashSet<>();
        Set<NIE> nieSet = new HashSet<>();
        Validator validator = new Validator(dniSet, nieSet);

        /**
         * Now, we create the DNIs and NIEs that will be validated by ours system.
         */

        int[] DNInumbers = {78484464, 72376173, 11817200, 95882054, 63587725, 26861694, 21616083, 26868974, 40135330,
                89044648, 7458, 12, 236, 100, 78945621, 4578, 546, 78945612, 78945612, 96345896};
        Character[] DNIletters = {'T', 'A', 'Q', 'E', 'Q', 'V', 'Q', 'Y', 'P', 'X', 'P', 'A', 'Q', 'E', 'p',
                'C', 't', 'I', 'O', 'U'};

        Character[] NIEFirstLetters = {'X', 'Y', 'Z', 'X', 'Y', 'Z', 'X', 'Y', 'Z', 'X', 'X', 'I', 'P', 'Y',
                'Z', 'G', 'X', 'Y', 'X', 'Z'};
        int[] NIEnumbers = {4578963, 4563017, 8796430, 2543312, 3300213, 4531269, 5566443, 3300147,
                8764559, 9999745, 45763, 4578963, 45763, 45, 4578963, 4963, 8963, 9978963, 4572263, 7894510};
        Character[] NIEFinalLetters = {'A', 'B', 'G', 'A', 'R', 'V', 'X', 'Z', 'Y', 'P', 'I', 'A', 'A',
                'A', 'c', 'F', 'Ñ', 'I', 'e', 'a'};

        /**
         * After creating the Validator System, we need to introduce all the DNIs and NIEs into the Validator database.
         */

        for (int index = 0; index < DNInumbers.length; index++) {
            DNI dni = new DNI(DNInumbers[index], DNIletters[index]);
            validator.addDni(dni);
        }

        for (int index = 0; index < NIEnumbers.length; index++) {
            NIE nie = new NIE(NIEFirstLetters[index], NIEnumbers[index], NIEFinalLetters[index]);
            validator.addNie(nie);
        }

        /**
         * Now, we finally can validate all the DNIs and NIEs :D
         */
        validator.formDocuments();
        validator.countValidDocuments(regularExpressions);

        /**
         * We will display the result just to make them visible:
         *
         *
         * The DNI 4578C is not a valid one, please enter a correct one or we will call the police.
         * The DNI 78945612O is not a valid one, please enter a correct one or we will call the police.
         * The DNI 11817200Q is valid.
         * The DNI 78945621p is not a valid one, please enter a correct one or we will call the police.
         * The DNI 63587725Q is valid.
         * The DNI 100E is not a valid one, please enter a correct one or we will call the police.
         * The DNI 26868974Y is valid.
         * The DNI 72376173A is valid.
         * The DNI 89044648X is valid.
         * The DNI 236Q is not a valid one, please enter a correct one or we will call the police.
         * The DNI 78484464T is valid.
         * The DNI 21616083Q is valid.
         * The DNI 546t is not a valid one, please enter a correct one or we will call the police.
         * The DNI 26861694V is valid.
         * The DNI 12A is not a valid one, please enter a correct one or we will call the police.
         * The DNI 96345896U is not a valid one, please enter a correct one or we will call the police.
         * The DNI 78945612I is not a valid one, please enter a correct one or we will call the police.
         * The DNI 40135330P is valid.
         * The DNI 95882054E is valid.
         * The DNI 7458P is not a valid one, please enter a correct one or we will call the police.
         *
         *
         * The NIE X5566443X is valid.
         * The NIE Y9978963Ñ is not a valid one, please enter a correct one or we will call the police.
         * The NIE Z8796430G is valid.
         * The NIE Y3300147Z is valid.
         * The NIE Z7894510u is not a valid one, please enter a correct one or we will call the police.
         * The NIE X4572263O is not a valid one, please enter a correct one or we will call the police.
         * The NIE Y3300213R is valid.
         * The NIE Y45A is not a valid one, please enter a correct one or we will call the police.
         * The NIE X45763i is not a valid one, please enter a correct one or we will call the police.
         * The NIE Z4531269V is valid.
         * The NIE I4578963A is not a valid one, please enter a correct one or we will call the police.
         * The NIE P45763A is not a valid one, please enter a correct one or we will call the police.
         * The NIE X9999745P is valid.
         * The NIE Y4563017B is valid.
         * The NIE X8963A is not a valid one, please enter a correct one or we will call the police.
         * The NIE Z4578963U is not a valid one, please enter a correct one or we will call the police.
         * The NIE G4963A is not a valid one, please enter a correct one or we will call the police.
         * The NIE X4578963A is valid.
         * The NIE X2543312A is valid.
         * The NIE Z8764559Y is valid.
         *
         * The number of correct DNIs is 10.
         * The number of incorrect DNIs is 10.
         * The number of correct NIEs is 10.
         * The number of incorrect NIEs is 10.
         */
    }
}
