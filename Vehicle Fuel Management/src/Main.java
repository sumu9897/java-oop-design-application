class Vehicle {
    private String vehicleNumber;
    private double fuelLevel;

    public Vehicle(String vehicleNumber, double fuelLevel) {
        this.vehicleNumber = vehicleNumber;
        this.fuelLevel = fuelLevel;
    }

    public void addFuel(double fuel) {
        fuelLevel += fuel;
    }

    public void drive(double fuelUsed) {
        if (fuelLevel < fuelUsed) {
            System.out.println("Error: Not enough fuel");
        } else {
            fuelLevel -= fuelUsed;
        }
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Fuel Level: " + fuelLevel);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("DHA-1234", 10);
        v.drive(5);
        v.displayVehicleInfo();
    }
}
