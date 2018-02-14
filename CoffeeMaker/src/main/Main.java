package main;

import exceptions.BeansAmountException;
import exceptions.NoCupsRemainingException;
import exceptions.StaleCoffeeException;
import exceptions.WaterException;
import model.CoffeeMaker;

public class Main {

    public static void main(String[] args){
        // TODO: complete the implementation of Main
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        try {
            try {
                coffeeMaker.brew(2.5, 5);
                coffeeMaker.pourCoffee();
            } catch (BeansAmountException beansAmountException) {
                System.out.print(beansAmountException.getMessage());
            } catch (WaterException e) {
                System.out.print(e.getMessage());
                throw new NoCupsRemainingException();
            } catch (StaleCoffeeException e) {
                System.out.print(e.getMessage());
            } catch (NoCupsRemainingException e) {
                System.out.print(e.getMessage());
            } finally {
                System.out.print("finally works!");
            }
        } catch (NoCupsRemainingException e){
            System.out.print("we're here!\n");
        }

    }


}