import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarTest {
    Car car = new Car("Test", "Test");
    @Test
    public void doesHaveFourWheels() {
        assertEquals(4, car.numberOfWheels);
    }
    @Test
    public void isDistanceDrivenCorrect() {
        int hoursDriven = 5;
        int expectedResult = 60 * hoursDriven;
        assertEquals(expectedResult, car.distanceDrivenAtMaxSpeed(hoursDriven));
    }

}
