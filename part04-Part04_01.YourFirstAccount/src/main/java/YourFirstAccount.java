
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        // Write a program that creates an account 
        // with a balance of 100.0, deposits 20.0 in it, 
        // and finally prints the balance. 
        
        // call constructor that receives 2 parameters, name and balance
        Account firstAccount = new Account("Jorge", 100);
        
        // calls the deposit method that receibes new balance
        firstAccount.deposit(20);
        
        //System.out.println(firstAccount.saldo());
        System.out.println(firstAccount.toString());
    }
}
