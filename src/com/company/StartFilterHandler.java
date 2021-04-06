package com.company;

import com.company.builder.BaseClassBuilder;
import com.company.handler.*;

import java.util.List;

public class StartFilterHandler {

    //Creating chain of filters
    ChainFilterHandler firstHandler = new LowerThanInputHandler();
    ChainFilterHandler optionalHandler = new OptionalHandler();
    ChainFilterHandler secondHandler = new HigherThanInputHandler();
    ChainFilterHandler thirdHandler = new MultipliedByInputHandler();
    ChainFilterHandler lastHandler = new LastChainFilterHandler();

    public void startHandle(int userInput, List<Integer> optionList) {
        //Set first handler in chain and included parameters
        firstHandler.setNextHandler(optionalHandler);
        firstHandler.setBaseClassBuilder(new BaseClassBuilder(userInput));
        firstHandler.setOptionList(optionList);
        //Set chain sequence
        optionalHandler.setNextHandler(secondHandler);
        secondHandler.setNextHandler(thirdHandler);
        thirdHandler.setNextHandler(lastHandler);
        //Do handle
        firstHandler.handle();
    }
}
