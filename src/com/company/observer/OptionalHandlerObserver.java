package com.company.observer;

import com.company.interfaces.iObserver;

public class OptionalHandlerObserver implements iObserver {
    //Variable
    private static OptionalHandlerObserver INSTANCE;
    boolean optionHandlerIsEnable;

    //Singleton
    public static OptionalHandlerObserver getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OptionalHandlerObserver();
        }
        return INSTANCE;
    }

    //Get information from interface
    @Override
    public void getOptionalHandlerUpdate(boolean isEnable) {
        this.optionHandlerIsEnable = isEnable;
    }

    //Send information to optional handler
    @Override
    public boolean responseToOptionalHandler() {

        return optionHandlerIsEnable;
    }
}
