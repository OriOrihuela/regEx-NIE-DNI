package org.lasencinas.nie;

public class NIE {

    /* ---- Properties ---- */
    private Character firstLetter = null;
    private int numbers = 0;
    private Character finalLetter = null;
    private String nie = null;


    /* ---- Constructor ---- */
    public NIE() {

    }

    public NIE(Character firstLetter, int numbers, Character finalLetter) {
        this.firstLetter = firstLetter;
        this.numbers = numbers;
        this.finalLetter = finalLetter;
    }


    /* ---- Getters ---- */
    public Character getFirstLetter() {
        return firstLetter;
    }

    public int getNumbers() {
        return numbers;
    }

    public Character getFinalLetter() {
        return finalLetter;
    }

    public String getNie() {
        return nie;
    }


    /* ---- Setters ---- */
    public void setFirstLetter(Character firstLetter) {
        this.firstLetter = firstLetter;
    }

    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void setFinalLetter(Character finalLetter) {
        this.finalLetter = finalLetter;
    }


    /* ---- Behaviours ---- */
    public void formNIE() {
        String nie = "";
        nie = getFirstLetter().toString() + getNumbers() + getFinalLetter().toString();
        this.nie = nie;
    }
}
