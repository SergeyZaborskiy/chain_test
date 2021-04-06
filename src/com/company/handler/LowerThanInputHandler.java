package com.company.handler;

import java.util.List;
import java.util.stream.Collectors;

public class LowerThanInputHandler extends ChainFilterHandler {

    @Override
    public void handle() {
        System.out.println("1st filter");

        int userInput = this.getBaseClassBuilder().getUserInput();
        List<Integer> result = this.getOptionList().stream().filter((x) -> x > userInput).collect(Collectors.toList());

        this.getBaseClassBuilder().addToResultString("Значения больше " + userInput + " : " + result);
        this.setNext();
    }
}
