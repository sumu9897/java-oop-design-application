class MobileAccount {
    private String phoneNumber;
    private double balance;

    public MobileAccount(String phoneNumber, double balance) {
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public void recharge(double amount) {
        balance += amount;
    }

    public void makeCall(double cost) {
        if (balance - cost < 0) {
            System.out.println("Error: Insufficient balance");
        } else {
            balance -= cost;
        }
    }

    public void displayAccountInfo() {
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        MobileAccount m = new MobileAccount("017XXXXX540", 60);
        m.recharge(30);
        m.makeCall(60);
        m.displayAccountInfo();
    }
}
