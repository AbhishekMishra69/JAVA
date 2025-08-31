public class Car {
    String model;
    int year;

    // Constructor
    public Car(String modelName, int modelYear) {
        model = modelName;
        year = modelYear;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        // Creating an object and calling the constructor
        Car myCar = new Car("Mustang", 1969);
        myCar.displayInfo();  // Output: Model: Mustang, Year: 1969
    }
}