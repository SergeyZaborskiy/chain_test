package com.company.handler;

import com.company.BaseClass;
import com.company.dao.BaseClassDAO;

public class LastChainFilterHandler extends ChainFilterHandler {

    BaseClassDAO baseClassDAO = new BaseClassDAO();

    @Override
    public void handle() {
        BaseClass baseClass = super.getBaseClassBuilder().build();

        baseClassDAO.saveBaseClassToBaseClassList(baseClass);

        System.out.println("Base class создан");
    }
}
