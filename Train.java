import java.util.ArrayList;

public class Train {

    //Attributes
    private Engine myEngine;
    private ArrayList<Car> myCars;
    private int nCars;
    private int passengerCapacity;


    /**
     * Constructor for Train 
     * @param f Engine's fuel type 
     * @param currentFuelLevel Engine's current fuel level 
     * @param maxFuelLevel Engine's max fuel level 
     */
    public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
        this.myEngine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
        this.passengerCapacity = passengerCapacity;
        this.myCars = new ArrayList<Car>(nCars);
        this.nCars = nCars;
        for (int i = 0; i < nCars; i++) {
            int avgCapacity = passengerCapacity / nCars;
            int remainingCapacity = passengerCapacity % nCars;
            if (i == nCars - 1) {
                Car myLastCar = new Car(avgCapacity + remainingCapacity);
                myCars.add(myLastCar);
            } else {
                Car myCar = new Car(avgCapacity);
                myCars.add(myCar);
            }
        }
    }

    /**
     * Method to retrieve engine
     * @return the engine object belonging to the train
     */
    public Engine getEngine() {
        return this.myEngine;
    }

    /**
     * Method to retrieve cars
     * @param carIndex integer index of the car you wish to get
     * @return the car object with the corresponding index in the list array
     */
    public Car getCar(int carIndex) {
        Car myCar = myCars.get(carIndex);
        return myCar;
    }

    /**
     * Method to retrieve passengerCapacity
     * @return the total capacity of all attached cars 
     */
    public int getMaxCapacity() {
        return this.passengerCapacity;
    }

    /**
     * Method to retrieve seatsRemaining
     * @return the total number of empty seats throughout all attached cars
     */
    public int seatsRemaining() {
        int sum = 0;
        for (int i = 0; i < this.nCars; i++) {
            Car myCar = myCars.get(i);
            int seatsRemaining = myCar.seatsRemaining();
            sum += seatsRemaining; 
        }
        return sum;
    }

    /**
     * Method to print the list of all passengers in all cars
     */
    public void printManifest() {
        for (int i = 0; i < this.nCars; i++) {
            Car myCar = myCars.get(i);
            myCar.printManifest();
        }
    }



}
