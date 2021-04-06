package com.company;

import com.company.dao.BaseClassDAO;
import com.company.observer.OptionalHandlerObserver;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BaseClassDAO baseClassDAO = new BaseClassDAO();
        baseClassDAO.addDemoOptions();
        StartFilterHandler filterHandler = new StartFilterHandler();
        OptionalHandlerObserver optionalHandlerObserver = OptionalHandlerObserver.getInstance();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 1 чтобы собрать класс без доп фильтра");
        System.out.println("Введите 2 чтобы собрать класс с доп фильтром");
        System.out.println("*******");

        int userChoice = scanner.nextInt();

        switch (userChoice) {
            case (1):
                System.out.println("*******");
                optionalHandlerObserver.getOptionalHandlerUpdate(false);
                System.out.println("Введите цифру для анализа");
                int userInput1 = scanner.nextInt();
                System.out.println("*******");
                filterHandler.startHandle(userInput1, baseClassDAO.getAllOptionList());
                System.out.println("*******");
                System.out.println(baseClassDAO.getLastSavedBaseClass());
                break;
            case (2):
                System.out.println("*******");
                optionalHandlerObserver.getOptionalHandlerUpdate(true);
                System.out.println("Введите цифру для анализа");
                int userInput2 = scanner.nextInt();
                System.out.println("*******");
                filterHandler.startHandle(userInput2, baseClassDAO.getAllOptionList());
                System.out.println("*******");
                System.out.println(baseClassDAO.getLastSavedBaseClass());
                break;
            default:
                System.out.println("Значение не верно!");
                System.out.println("*******");
                break;
        }

    }

}



