import java.util.ArrayList;
import java.util.List;

public class WithdrawAccount extends Account{
    @Override
    public boolean login(LoginDTO loginDTO) {
        int cnt= (int) loginDTO.getMap().entrySet().stream().filter(i->i.getKey()==loginDTO.getAccNo()&&i.getValue()== loginDTO.getPin()).count();

        return cnt==1;
    }

    @Override
    public List<Customer> signUp(SignUpDTO signUpDTO) {
        Customer newCustomer = new Customer(signUpDTO.getCustomerName(), signUpDTO.getCustomerAccNo(), signUpDTO.getCustomerAccPin(),0,"Withdraw");
        List<Customer> lst = new ArrayList<>(signUpDTO.getCustomers());
        lst.add(newCustomer);
        return lst;
    }

    public boolean withdraw(double amt,Customer customer){
        if(customer.getCustomerBalance()-amt<0){
            return false;
        }
        return true;
    }
}
