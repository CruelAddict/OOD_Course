package main;

import model.BeansAmountException;
import model.CoffeeMaker;

public class Main {

    public static void main(String[] args){
        // TODO: complete the implementation of Main
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        try {
            coffeeMaker.brew(3.5, 15);
        } catch (BeansAmountException beansAmountException){
            System.out.print("Why "+ beansAmountException.getBeans()+ " beans?");
        }

    }


}