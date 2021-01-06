public class Motorbike extends Vehicles {

    public Motorbike(String ownerName, String licensePlate) {
        setLicensePlate(licensePlate);
        setOwner(ownerName);
        this.numberOfWheels = 2;
        this.maxSpeed = 100; // Miles per hour
    }
    public void doWheelie() {
        System.out.println("Wow, that's a cool wheelie!");
    }
    public int distanceDrivenAtMaxSpeed(int hoursDriven) {
        int result = hoursDriven * maxSpeed;
        System.out.println("Driving for " + hoursDriven + " hours at " + maxSpeed + "MPH is " + result + " miles.");
        return result;
    }
}
