package exceptions;

public class StaleCoffeeException extends Exception {
    public StaleCoffeeException(int time){
        super(time+" minutes since last brew! The coffee is stale!\n");
    }
}
