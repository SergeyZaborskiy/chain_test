package com.company.interfaces;

import com.company.builder.BaseClassBuilder;

import java.util.List;

public interface iChainFilterHandler {

    void setBaseClassBuilder(BaseClassBuilder baseClassBuilder);

    void setOptionList(List<Integer> optionList);

    void setNext();

    void handle();

}
