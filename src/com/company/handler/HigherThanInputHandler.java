package com.company.handler;

import java.util.List;
import java.util.stream.Collectors;

public class HigherThanInputHandler extends ChainFilterHandler {

    @Override
    public void handle() {
        System.out.println("2nd filter");

        int userInput = this.getBaseClassBuilder().getUserInput();
        List<Integer> result = this.getOptionList().stream().filter((x) -> x < userInput).collect(Collectors.toList());

        this.getBaseClassBuilder().addToResultString("Значения меньше " + userInput + " : " + result);
        this.setNext();
    }
}

