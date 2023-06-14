import java.util.ArrayList;
import java.util.List;

public class SavingsAccount extends Account{
    @Override
    public boolean login(LoginDTO loginDTO) {

        int cnt= (int) loginDTO.getMap().entrySet().stream().filter(i->i.getKey()==loginDTO.getAccNo()&&i.getValue()== loginDTO.getPin()).count();

        return cnt==1;
    }

    @Override
    public List<Customer> signUp(SignUpDTO signUpDTO) {

        Customer newCustomer = new Customer(signUpDTO.getCustomerName(), signUpDTO.getCustomerAccNo(), signUpDTO.getCustomerAccPin(),0,"Savings");
        List<Customer> lst = new ArrayList<>(signUpDTO.getCustomers());
        lst.add(newCustomer);
        return lst;
    }
    public void deposit(double amt,Customer customer){
        if(amt>0){
            customer.setCustomerBalance(customer.getCustomerBalance()+amt);
        }
        else
            System.out.println("Deposit amount cannot be less than or equal to zero.");
    }
}
