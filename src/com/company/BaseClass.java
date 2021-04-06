package com.company;

public class BaseClass {
    //Variables
    private int userInput;
    private String result;

    //Constructor
    public BaseClass(int userChoice) {
        this.userInput = userChoice;
    }

    //Get and set

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "userInput = " + userInput + "\n Results: \n" + result;
    }

}
