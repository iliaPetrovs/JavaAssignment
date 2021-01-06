import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MotorbikeTest {
    Motorbike bike = new Motorbike("Test", "Test");
    @Test
    public void doesHaveFourWheels() {
        assertEquals(2, bike.numberOfWheels);
    }
    @Test
    public void isDistanceDrivenCorrect() {
        int hoursDriven = 5;
        int expectedResult = 100 * hoursDriven;
        assertEquals(expectedResult, bike.distanceDrivenAtMaxSpeed(hoursDriven));
    }
}
