import java.util.ArrayList; 

public class Car {
    // Attributes 
    private int capacity;
    private ArrayList<Passenger> manifest;

    /**
     * Constructor for Car 
     * @param capacity total number of passengers car can hold 
     */
    public Car(int capacity) {
        this.capacity = capacity;
        this.manifest = new ArrayList<Passenger>(capacity);
    }

    /**
     * Accessor to retrieve capacity
     * @return the maximum capacity of the car
     */
    public int getCapacity() {
        return this.capacity;
    }


    /**
     * Accessor to retrieve manifest
     * @return the list of passengers on the car
     */
    public ArrayList<Passenger> getManifest() {
        return this.manifest;
    }

    /**
     * Method to calculate unoccupied seats
     * @return the number of empty seats left in the car
     */
    public int seatsRemaining () {
        int seatsOccupied = manifest.size();
        int seatsRemaining = this.capacity - seatsOccupied;
        return seatsRemaining;
    }

    /**
     * Method to add a passenger to the car
     * @param p name of the passenger
     * @return true or false based on whether the addition was successful
     */
    public Boolean addPassenger(Passenger p) {
        int seatsRemaining = seatsRemaining();
        if (seatsRemaining >= 1) {
            manifest.add(p);
            return true;
        } else {
            return false;
        }
    }
    
    /**
     * Method to remove a passenger from the car
     * @param p name of the passenger
     * @return true or false based on whether the removal was successful
     */
    public Boolean removePassenger(Passenger p) {
        if (manifest.contains(p)) {
            manifest.remove(p);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method to print a list of all car passengers to the console
     */
    public void printManifest() {
        if (manifest == null) {
            System.out.println("This car is empty!");
        }

        for (int i = 0; i < manifest.size(); i ++) {
            Passenger currentPassenger = manifest.get(i);
            System.out.println(currentPassenger.getName());
        }
    }
}