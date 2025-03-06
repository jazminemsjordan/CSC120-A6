import static org.junit.Assert.*;
import org.junit.Test;


public class TrainTest {

    Engine testEngine = new Engine(FuelType.ELECTRIC, 100, 100);

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
        assertEquals(testEngine.getMaxFuel() - 10,  testEngine.getCurrentFuel(), 0);
    }

    // Car Tests
    @Test
    public void testCarAddPassenger() {
        fail();
    }

    @Test
    public void testCarRemovePassenger() {
        fail();
    }

    // Passenger Tests
    @Test
    public void testPassengerBoardCarWithSpace() {
        fail();
    }

    @Test
    public void testPassengerBoardCarFull() {
        fail();
    }

    // Train Tests
    @Test
    public void testTrainConstructor() {
        fail();
    }

    @Test
    public void testTrainPassengerCount() {
        fail();
    }

    @Test
    public void testTrainGetCar() {
        fail();
    }

    @Test
    public void testTrainPrintManifest() {
        fail();
    }
    
}
