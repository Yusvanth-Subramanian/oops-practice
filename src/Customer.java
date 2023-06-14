public class Customer {
    private String customerName;

    private long customerAccNo;

    private int customerAccPin;

    private double customerBalance;

    private String accountType;

    public Customer(){}

    public Customer(String customerName, long customerAccNo, int customerAccPin, double customerBalance, String accountType) {
        this.customerName = customerName;
        this.customerAccNo = customerAccNo;
        this.customerAccPin = customerAccPin;
        this.customerBalance = customerBalance;
        this.accountType = accountType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getCustomerAccNo() {
        return customerAccNo;
    }

    public void setCustomerAccNo(long customerAccNo) {
        this.customerAccNo = customerAccNo;
    }

    public int getCustomerAccPin() {
        return customerAccPin;
    }

    public void setCustomerAccPin(int customerAccPin) {
        this.customerAccPin = customerAccPin;
    }

    public double getCustomerBalance() {
        return customerBalance;
    }

    public void setCustomerBalance(double customerBalance) {
        this.customerBalance = customerBalance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerAccNo=" + customerAccNo +
                ", customerAccPin=" + customerAccPin +
                ", customerBalance=" + customerBalance +
                ", accountType='" + accountType + '\'' +
                '}';
    }
}
