public class Vehicles {
    private String licensePlate;
    private String owner;
    public int numberOfWheels;
    public int maxSpeed; // Miles per hour

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
