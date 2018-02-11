package model;

public class BeansAmountException extends Exception {
    private double beans;

    public BeansAmountException(double _beans){ beans = _beans;}

    public double getBeans(){
        return beans;
    }
}
