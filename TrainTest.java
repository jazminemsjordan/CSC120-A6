import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;


public class TrainTest {

    Engine testEngine = new Engine(FuelType.ELECTRIC, 100, 100);
    Car testCar = new Car(30);
    Passenger testPassenger = new Passenger("John Doe");
    ArrayList<Passenger> manifest = testCar.getManifest();
    Train testTrain = new Train(FuelType.INTERNAL_COMBUSTION, 100, 100, 6, 40);
    ArrayList<Car> carList = testTrain.getCarList();

    // Engine Tests
    @Test
    public void testEngineConstructor() {
        assertEquals(FuelType.ELECTRIC, testEngine.getFuelType());
        assertEquals(100, testEngine.getCurrentFuel(), 0);
        assertEquals(100, testEngine.getMaxFuel(), 0);
    }

    @Test
    public void testEngineGo() {
        testEngine.go();
        assertEquals(90,  testEngine.getCurrentFuel(), 0);
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        testCar.addPassenger(testPassenger);
        assertEquals(29, testCar.seatsRemaining());

    }

    @Test
    public void testCarRemovePassenger() {
        testCar.addPassenger(testPassenger);
        testCar.removePassenger(testPassenger);
        assertFalse(testCar.removePassenger(testPassenger));
        assertEquals(30, testCar.seatsRemaining());
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        testPassenger.boardCar(testCar);
        assertTrue(manifest.contains(testPassenger));
    }

    @Test
    public void testPassengerBoardCarFull() {
        for (int i = 0; i < 30; i++) {
            Passenger p = new Passenger("Jane Doe");
            p.boardCar(testCar);
        }
        testPassenger.boardCar(testCar);
        assertFalse(manifest.contains(testPassenger));
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        assertEquals(6, carList.size());
        Car c = testTrain.getCar(1);
        assertEquals(40, c.getCapacity());
    }

    @Test
    public void testTrainPassengerCount() {
        for (int i = 0; i < 6; i++) {
            Car c = testTrain.getCar(i);
            Passenger p = new Passenger("Joe Schmoe");
            c.addPassenger(p);
        }
        Car c = testTrain.getCar(0);
        c.addPassenger(testPassenger);
        assertEquals(233, testTrain.seatsRemaining());
        c.removePassenger(testPassenger);
        assertEquals(234, testTrain.seatsRemaining());
    }

    @Test
    public void testTrainGetCar() {
        Car c = testTrain.getCar(3);
        Car d = carList.get(3);
        assertEquals(c, d);
    }

    @Test
    public void testTrainPrintManifest() {
        fail();
    }
}
