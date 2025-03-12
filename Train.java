import java.util.ArrayList;

public class Train {

    //Attributes
    private Engine myEngine;
    private ArrayList<Car> myCars;


    /**
     * Constructor for Train 
     * @param f Engine's fuel type 
     * @param currentFuelLevel Engine's current fuel level 
     * @param maxFuelLevel Engine's max fuel level 
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.myEngine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.myCars = new ArrayList<Car>(nCars);
            for (int i = 0; i < nCars; i++) {
                Car myCar = new Car(passengerCapacity);
                this.myCars.add(myCar);
            }
        }

    /**
     * Accessor to retrieve engine
     * @return the engine object belonging to the train
     */
    public Engine getEngine() {
        return this.myEngine;
    }

    /**
     * Accessor to retrieve cars
     * @param carIndex integer index of the car you wish to get
     * @return the car object with the corresponding index in the list array
     */
    public Car getCar(int carIndex) {
        Car myCar = this.myCars.get(carIndex);
        return myCar;
    }

    /**
     * Accessor to retrieve car list
     * @return the list of cars on the train
     */
    public ArrayList<Car> getCarList() {
        return this.myCars;
    }

    /**
     * Method to retrieve the capacity of each car and multiply out to the maximum capacity
     * @return the total capacity of all attached cars 
     */
    public int getMaxCapacity() {
        Car myCar = getCar(0);
        int capacity = myCar.getCapacity();
        int nCars = this.myCars.size();
        int maxCapacity = capacity * nCars;
        return maxCapacity;
    }

    /**
     * Method to retrieve unoccupied seats per car and get a total number of seats remaining
     * @return the total number of empty seats throughout all attached cars
     */
    public int seatsRemaining() {
        int sum = 0;
        for (int i = 0; i < this.myCars.size(); i++) {
            Car myCar = this.myCars.get(i);
            int seatsRemaining = myCar.seatsRemaining();
            sum += seatsRemaining; 
        }
        return sum;
    }

    /**
     * Method to print the list of all passengers in all cars
     */
    public void printManifest() {
        for (int i = 0; i < this.myCars.size(); i++) {
            Car myCar = myCars.get(i);
            myCar.printManifest();
        }
    }
    



}
