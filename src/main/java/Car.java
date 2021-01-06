public class Car extends Vehicles {

    public Car(String ownerName, String licensePlate) {
        setLicensePlate(licensePlate);
        setOwner(ownerName);
        this.numberOfWheels = 4;
        this.maxSpeed = 60; // Miles per hour
    }

    public void autoPilot() {
        System.out.println("Sit back and relax, you're now on autopilot!");
    }

    public int distanceDrivenAtMaxSpeed(int hoursDriven) {
        int result = hoursDriven * maxSpeed;
        System.out.println("Driving for " + hoursDriven + " hours at " + maxSpeed + "MPH is " + result + " miles.");
        return result;
    }
}
