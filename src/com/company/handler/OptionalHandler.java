package com.company.handler;

import com.company.observer.OptionalHandlerObserver;

public class OptionalHandler extends ChainFilterHandler {

    @Override
    public void handle() {
        if (OptionalHandlerObserver.getInstance().responseToOptionalHandler()) {
            System.out.println("Optional filter");

            this.getBaseClassBuilder().addToResultString("Это опциональный фильтр");
        }
        this.setNext();
    }
}
