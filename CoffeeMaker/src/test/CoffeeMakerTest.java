package test;

import exceptions.BeansAmountException;
import exceptions.NoCupsRemainingException;
import exceptions.StaleCoffeeException;
import exceptions.WaterException;
import model.CoffeeMaker;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;


public class CoffeeMakerTest {

    private CoffeeMaker coffeeMaker;

    @Before
    public void setUp(){
        // TODO: instantiate your test objects here
        coffeeMaker = new CoffeeMaker();
    }

    @Test
    public void allOK(){
        // TODO: write some more tests
        // This is a template for unit tests
        try {
            coffeeMaker.brew(2.5, 15);
            coffeeMaker.pourCoffee();
        } catch (BeansAmountException beansAmountException){
            fail(beansAmountException.getMessage());
        } catch (WaterException e) {
            fail(e.getMessage());
        } catch (StaleCoffeeException e) {
            fail(e.getMessage());
        } catch (NoCupsRemainingException e){
            fail(e.getMessage());
        }
    }

    @Test (expected = BeansAmountException.class)
    public void beansNotOk() throws BeansAmountException{
        try {
            coffeeMaker.brew(1.5, 15);
            coffeeMaker.pourCoffee();
        }  catch (WaterException e) {
            fail(e.getMessage());
        } catch (StaleCoffeeException e) {
            fail(e.getMessage());
        } catch (NoCupsRemainingException e){
            fail(e.getMessage());
        }
    }


}