public class Main {
    public static void main(String[]  args){
        // Exception handling example
        int [] numsOne = {11, 12, 13, 14, 15};
        int [] numsTwo = {1, 2, 0, 4, 5};
        for (int i = 0; i < numsOne.length; i++) {
            try {
                System.out.println(numsOne[i] / numsTwo[i]);
            }
            catch (ArithmeticException ae) {
                System.out.println("Cannot divide by zero");
            }}
        // Instantiate car and motorbike objects
        Car car  = new Car("Ilia", "123ABC");
        Motorbike bike = new Motorbike("Amanda", "321CBA");
        //Car showcase
        System.out.println(car.getOwner());
        System.out.println(car.getLicensePlate());
        System.out.println(car.numberOfWheels);
        car.autoPilot();
        car.distanceDrivenAtMaxSpeed(6);
        // Motorbike showcase
        System.out.println(bike.getOwner());
        System.out.println(bike.getLicensePlate());
        System.out.println(bike.numberOfWheels);
        bike.doWheelie();
        bike.distanceDrivenAtMaxSpeed(10);
    }
}
