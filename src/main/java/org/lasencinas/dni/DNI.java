package org.lasencinas.dni;

public class DNI {

    /* ---- Properties ---- */
    private int numbers = 0;
    private Character letter = null;
    private String dni = null;


    /* ---- Constructor ---- */
    public DNI() {

    }

    public DNI(int numbers, Character letter) {
        this.numbers = numbers;
        this.letter = letter;
    }


    /* ---- Getters  ---- */
    public int getNumbers() {
        return numbers;
    }

    public Character getLetter() {
        return letter;
    }

    public String getDni() {
        return dni;
    }


    /* ---- Setters ---- */
    public void setNumbers(int numbers) {
        this.numbers = numbers;
    }

    public void setLetter(Character letter) {
        this.letter = letter;
    }


    /* ---- Behaviours ---- */
    public void formDNI() {
        String dni = "";
        dni += getNumbers() + getLetter().toString();
        this.dni = dni;

    }
}
