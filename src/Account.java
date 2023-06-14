import java.util.List;

abstract class Account {
    public abstract boolean login(LoginDTO loginDTO);

    public abstract List<Customer> signUp(SignUpDTO signUpDTO);

    public void deposit(double amount,Customer customer){
        System.out.println("Deposit option is not available in this account type");
    }

    public boolean withdraw(double amount,Customer customer){
        System.out.println("Withdraw option is not available in this account type");
        return false;
    }

}
