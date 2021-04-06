package com.company.dao;

import com.company.BaseClass;

import java.util.ArrayList;
import java.util.List;

public class BaseClassDAO {
    //BaseClass database
    private static List<BaseClass> baseClassList = new ArrayList<>();

    //Options to choice database
    private static List<Integer> optionList = new ArrayList<>();

    //Adding demo source to options
    public void addDemoOptions() {
        optionList.add(1);
        optionList.add(5);
        optionList.add(10);

    }

    //Save BaseClass to database
    public void saveBaseClassToBaseClassList(BaseClass baseClass) {
        baseClassList.add(baseClass);
    }

    //Get all options from database as List
    public List<Integer> getAllOptionList() {
        return optionList;
    }

    //Get last saved BaseClass from database
    public BaseClass getLastSavedBaseClass() {
        return baseClassList.get(baseClassList.size() - 1);
    }
}

