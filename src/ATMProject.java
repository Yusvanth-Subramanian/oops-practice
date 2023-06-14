import java.util.*;

public class ATMProject {

    static List<Customer> customers = new ArrayList<>();

    static HashMap<Long,Integer> map = new HashMap<>();
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        Customer loggedInCustomer = null;
        boolean exit=false;
        while(!exit) {
            System.out.println("Enter your choice : \n1.Savings account\n2.Withdraw account\n3.Exit");
            int choice = s.nextInt();
            boolean innerExit=false;

            switch (choice) {
                case 1:
                    SavingsAccount savingsAccount = new SavingsAccount();
                    while(!innerExit) {
                        System.out.println("Enter your choice : \n1.Login\n2.Signup\n3.View account details\n4.Deposit\n5.Exit");
                        switch (s.nextInt()) {
                            case 1:
                                System.out.print("Enter Account number : ");
                                long accNo = s.nextLong();
                                System.out.print("Enter the pin number : ");
                                int pin = s.nextInt();
                                LoginDTO loginDTO = new LoginDTO(accNo, pin, map);
                                if (savingsAccount.login(loginDTO)) {
                                    for (Customer c : customers) {
                                        if (c.getCustomerAccNo() == accNo) {
                                            loggedInCustomer = c;
                                            break;
                                        }
                                    }
                                    System.out.println("Successfully Logged in!!!");
                                } else {
                                    System.out.println("Incorrect Account number or password.");
                                }
                                break;
                            case 2:
                                System.out.print("Enter Your name : ");
                                String name = s.next();
                                System.out.print("Enter account number : ");
                                long acc = s.nextLong();
                                System.out.print("Enter your account pin : ");
                                int accPin = s.nextInt();
                                map.put(acc, accPin);
                                SignUpDTO signUpDTO = new SignUpDTO(name, acc, accPin, customers);
                                customers = savingsAccount.signUp(signUpDTO);
                                break;
                            case 3:
                                System.out.println(loggedInCustomer);
                                break;
                            case 4:
                                System.out.print("Enter amount to deposit : ");
                                double amt = s.nextDouble();
                                savingsAccount.deposit(amt, loggedInCustomer);
                                break;
                            case 5:
                                innerExit = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    WithdrawAccount withdrawAccount = new WithdrawAccount();
                    System.out.println("Enter your choice : \n1.Login\n2.Signup\n3.View account details\n4.Withdraw\n5.Exit");
                    innerExit=false;
                    while(!innerExit) {
                        switch (s.nextInt()) {
                            case 1:
                                System.out.print("Enter Account number : ");
                                long accNo = s.nextLong();
                                System.out.print("Enter the pin number : ");
                                int pin = s.nextInt();
                                LoginDTO loginDTO = new LoginDTO(accNo, pin, map);
                                if (withdrawAccount.login(loginDTO)) {
                                    for (Customer c : customers) {
                                        if (c.getCustomerAccNo() == accNo) {
                                            loggedInCustomer = c;
                                            break;
                                        }
                                    }
                                    System.out.println("Successfully Logged in!!!");
                                } else {
                                    System.out.println("Incorrect Account number or password.");
                                }
                                break;
                            case 2:
                                System.out.print("Enter Your name : ");
                                String name = s.next();
                                System.out.print("Enter account number : ");
                                long acc = s.nextLong();
                                System.out.print("Enter your account pin : ");
                                int accPin = s.nextInt();
                                map.put(acc, accPin);
                                SignUpDTO signUpDTO = new SignUpDTO(name, acc, accPin, customers);
                                customers = withdrawAccount.signUp(signUpDTO);
                                break;
                            case 3:
                                System.out.println(loggedInCustomer);
                                break;
                            case 4:
                                System.out.print("Enter amount to withdraw : ");
                                double amt = s.nextDouble();
                                withdrawAccount.withdraw(amt, loggedInCustomer);
                                break;
                            case 5:
                                exit = true;
                                break;
                        }
                    }
                    break;
                case 3:
                    exit=true;
                    break;
            }
        }
    }

}
