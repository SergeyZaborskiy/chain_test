package com.company.handler;

import com.company.builder.BaseClassBuilder;
import com.company.interfaces.iChainFilterHandler;

import java.util.List;

public abstract class ChainFilterHandler implements iChainFilterHandler {
    //Variables
    private iChainFilterHandler nextHandler;
    private BaseClassBuilder baseClassBuilder;
    private List<Integer> optionList;
    private boolean isEnable = true;

    //Getters and Setters
    public iChainFilterHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(iChainFilterHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public BaseClassBuilder getBaseClassBuilder() {
        return baseClassBuilder;
    }

    @Override
    public void setBaseClassBuilder(BaseClassBuilder baseClassBuilder) {
        this.baseClassBuilder = baseClassBuilder;
    }

    public List<Integer> getOptionList() {
        return optionList;
    }

    @Override
    public void setOptionList(List<Integer> optionList) {
        this.optionList = optionList;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }


    //Send handle to next part of chain
    @Override
    public void setNext() {
        if (this.getNextHandler() != null) {
            this.getNextHandler().setBaseClassBuilder(this.getBaseClassBuilder());
            this.getNextHandler().setOptionList(this.getOptionList());
            this.getNextHandler().handle();
        }
    }

}