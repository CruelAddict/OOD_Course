package exceptions;

public class BeansAmountException extends Exception {
    private double beans;

    protected BeansAmountException(double _beans, String message){
        super(message);
        beans = _beans;
    }

    public double getBeans(){
        return beans;
    }
}
