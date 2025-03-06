public class Passenger {
    
    //Attributes
    private String name;


    /**
     * Constructor for Passenger
     * @param name Passenger name
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Method to board a certain car
     */
    public void boardCar(Car c) {
        if (c.addPassenger(this)) {
            System.out.println("Boarding successful!");
        } else {
            System.out.println("Boarding failed.");
        }
    }

    /**
     * Method to get off a certain car
     */
    public void getOffCar(Car c) {
        if (c.removePassenger(this)) {
            System.out.println("Deboarding successful!");
        } else {
            System.out.println("Deboarding failed.");
        }
    }

}
