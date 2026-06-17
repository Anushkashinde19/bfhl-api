package com.dypatil.bfhl_api.dto;

import java.util.List;

public class ResponseDTO {

    private boolean is_success;

    private List<String> alphabets;
    private List<String> numbers;
    private List<String> specialCharacters;

    private int alphabetCount;
    private int numberCount;
    private int specialCharacterCount;

    public boolean isIs_success() {
        return is_success;
    }

    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<String> numbers) {
        this.numbers = numbers;
    }

    public List<String> getSpecialCharacters() {
        return specialCharacters;
    }

    public void setSpecialCharacters(List<String> specialCharacters) {
        this.specialCharacters = specialCharacters;
    }

    public int getAlphabetCount() {
        return alphabetCount;
    }

    public void setAlphabetCount(int alphabetCount) {
        this.alphabetCount = alphabetCount;
    }

    public int getNumberCount() {
        return numberCount;
    }

    public void setNumberCount(int numberCount) {
        this.numberCount = numberCount;
    }

    public int getSpecialCharacterCount() {
        return specialCharacterCount;
    }

    public void setSpecialCharacterCount(int specialCharacterCount) {
        this.specialCharacterCount = specialCharacterCount;
    }
}