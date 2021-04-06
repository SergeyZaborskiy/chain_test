package com.company.handler;

import java.util.List;
import java.util.stream.Collectors;

public class MultipliedByInputHandler extends ChainFilterHandler {

    @Override
    public void handle() {
        System.out.println("3rd filter");

        int userInput = this.getBaseClassBuilder().getUserInput();
        List<Integer> result = this.getOptionList().stream().map((x) -> x * userInput).collect(Collectors.toList());

        this.getBaseClassBuilder().addToResultString("Значения умноженные на " + userInput + " : " + result);
        this.setNext();
    }
}
