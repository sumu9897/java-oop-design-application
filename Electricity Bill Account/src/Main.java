class ElectricityAccount {
    private String meterNumber;
    private double unitsConsumed;

    public ElectricityAccount(String meterNumber) {
        this.meterNumber = meterNumber;
        this.unitsConsumed = 0;
    }

    public void addUnits(double units) {
        unitsConsumed += units;
    }

    public double calculateBill() {
        return unitsConsumed * 5;
    }

    public void resetUnits() {
        unitsConsumed = 0;
    }

    public void displayBillInfo() {
        System.out.println("Meter Number: " + meterNumber);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill: " + calculateBill());
    }

    public static void main(String[] args) {
        ElectricityAccount e = new ElectricityAccount("M901");
        e.addUnits(100);
        e.displayBillInfo();
    }
}
