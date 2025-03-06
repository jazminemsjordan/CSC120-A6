public class Engine {

    //Attributes
    private FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;
    
    /**
     * Constructor for Engine 
     * @param f Engine's fuel type 
     * @param currentFuelLevel Engine's current fuel level 
     * @param maxFuelLevel Engine's max fuel level 
     */
    public Engine(FuelType f, double currentFuelLevel, double maxFuelLevel) {
        this.f = f; 
        this.currentFuelLevel = currentFuelLevel;
        this.maxFuelLevel = maxFuelLevel; 
    }

    /**
     * Method to retrieve FuelType
     * @return the fuel type of the engine
     */
    public FuelType getFuelType() {
        return this.f; 
    }

    /**
     * Method to retrieve maxFuelLevel
     * @return the engine's max fuel capacity.
     */
    public double getMaxFuel() {
        return this.maxFuelLevel; 
    }

    /**
     * Method to retrieve currentFuelLevel
     * @return the current amount of fuel in the engine tank
     */
    public double getCurrentFuel() {
        return this.currentFuelLevel; 
    }

    /**
     * Method to refuel the engine back to max capacity
     */
    public void refuel() {
        this.currentFuelLevel = this.maxFuelLevel;
    }

    /**
     * Method to run the engine and use a set amount of fuel
     * @return true or false depending on if the operation was successful
     */
    public Boolean go() {
        this.currentFuelLevel -= 10;
        if (this.currentFuelLevel < 0) {
            this.currentFuelLevel = 0;
        }
        if (this.currentFuelLevel == 0) {
            System.out.println("Out of fuel!");
            return false;
        } else {
            System.out.println("Current fuel level: " + this.currentFuelLevel + "%");
            return true;
        }
    }
}
