package com.company.builder;

import com.company.BaseClass;

public class BaseClassBuilder {
    //Variables
    private int userInput;
    private String result;

    //Constructor
    public BaseClassBuilder(int userInput) {
        this.userInput = userInput;
    }

    //Getters
    public int getUserInput() {
        return userInput;
    }
    public String getResult() {
        return result;
    }

    //Result concat
    public BaseClassBuilder addToResultString(String string) {
        if (this.result != null) {
            this.result = this.result + " " + string + "\n";
        } else {
            this.result = string + "\n";
        }
        return this;
    }

    //Build
    public BaseClass build() {
        BaseClass baseClass = new BaseClass(this.userInput);
        baseClass.setResult(this.result);

        return baseClass;

    }

}
