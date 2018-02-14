package exceptions;

public class WaterException extends Exception {
    private double water;

    public WaterException(double _water){
        super(_water+" cups of water is not enough!\n");
        water = _water;
    }
}
