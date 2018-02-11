package model;

/**
 * A coffee maker used to train baristas.
 *
 * Class invariant: cups remaining >= 0, time since last brew >= 0
 */

public class CoffeeMaker {

    private int cupsAmount = 0;
    private int timeSinceLastbrew = 0;

    public CoffeeMaker(){
        // TODO: complete the implementation of this method

    }

    // getters
    public int getTimeSinceLastBrew() {
        // TODO: complete the implementation of this method
        return timeSinceLastbrew;
    }
    public int getCupsRemaining() {
        // TODO: complete the implementation of this method
        return cupsAmount;
    }

    // EFFECTS: return true if there are coffee cups remaining
    public boolean areCupsRemaining() {
        // TODO: complete the implementation of this method
        if (cupsAmount > 0) return true;
        else return false;
    }

    //REQUIRES: a non-negative integer
    //EFFECTS: sets time since last brew
    public void setTimeSinceLastBrew(int time) {
        // TODO: complete the implementation of this method
        timeSinceLastbrew = time;
    }

    //REQUIRES: beans between 2.40 and 2.60 cups, water > 14.75 cups
    //EFFECTS: sets cups remaining to full (20 cups) and time since last brew to 0
    public void brew(double beans, double water) throws BeansAmountException {
        // TODO: complete the implementation of this method
        if((beans < 2.4) || (beans > 2.6)) {
            throw new BeansAmountException(beans);
        }
        cupsAmount = 20;
        setTimeSinceLastBrew(0);
        System.out.print("Brewed successfully!");
    }

    ///REQUIRES: cups remaining > 0, time since last brew < 60
    //MODIFIES: this
    //EFFECTS: subtracts one cup from cups remaining
    public void pourCoffee() {
        // TODO: complete the implementation of this method
        cupsAmount--;
    }


}
