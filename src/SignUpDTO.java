import java.util.List;

public class SignUpDTO {

    private String customerName;

    private long customerAccNo;

    private int CustomerAccPin;

    private List<Customer> customers;

    public SignUpDTO(String customerName, long customerAccNo, int customerAccPin, List<Customer> customers) {
        this.customerName = customerName;
        this.customerAccNo = customerAccNo;
        CustomerAccPin = customerAccPin;
        this.customers = customers;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
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
        return CustomerAccPin;
    }

    public void setCustomerAccPin(int customerAccPin) {
        CustomerAccPin = customerAccPin;
    }
}
