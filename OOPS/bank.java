public class bank {
    int account_no;
    int balance;
    String Customer_name; 
    String email;
    int phone_no;

    int deposit(int a){
        balance=balance+a;
        System.out.println("Final amount: "+balance);
        return balance;
    }

    int withdraw(int b){
        balance=balance-b;
        System.out.println("Final amount: "+balance);
        return balance;
    }
    
}

