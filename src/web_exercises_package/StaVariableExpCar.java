package web_exercises_package;

public class StaVariableExpCar {
    private String name;
    private String engine;

    public static int numberOfCars;

    public StaVariableExpCar(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public static void setNumberOfCars(int numberOfCars) {

        StaVariableExpCar.numberOfCars = numberOfCars;
    }
}
        //We generally use static methods to perform an operation that is not dependent upon instance creation.
        //In order to share a code across all instances of that class, we write that code in a static method:
        // getters and setters
