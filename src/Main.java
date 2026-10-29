public class Main {
    public static void main(String[] args) {
        // Create a Car object using the constructor
        Car car = new Car("Corolla", "Toyota", 2022, 25000.00, "Blue", 5);

        // Print the car using toString()
        System.out.println(car);

        // Sell one car
        car.sell();

        // Print all fields using getters
        System.out.println("\nAfter selling one car:");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        // Change some fields using setters
        car.setColor("Red");
        car.setPrice(24000.00);
        car.setQuantity(10);

        // Print the updated object
        System.out.println("\nAfter changing some fields:");
        System.out.println(car);
    }
}