package chapter11;

import java.util.Date;

public class ex11_3 {
    public static void main(String[] args){
        Account ac = new Account(12345, 100000);
        CheckingAccount ca = new CheckingAccount();
        ca.setBalance(1000);
        ca.deposit(2000);
        ca.withdraw(900);
        System.out.println(ca.getBalance());
        ca.withdraw(2200);
        System.out.println(ca.getBalance());
        SavingAccount sa = new SavingAccount(786, 10000);
        System.out.println(sa.getBalance());
        System.out.println(sa.getAccNumber());
        sa.deposit(5000);
        sa.withdraw(2000);
        System.out.println(sa.getBalance());
        sa.withdraw(5000);
        System.out.println(sa.getBalance());
        sa.withdraw(8000);

    }
}
class Account{
    private double accNumber;
    private double balance;
    private double intrestRate;
    private Date dateCreated;


    public Account(){

    }

    public double getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(double accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Account(double accNumber, double balance){
        this.balance = balance;
        this.accNumber = accNumber;
        this.intrestRate = 3;
        dateCreated = new Date();
    }

    public void deposit(double depositAmt){
        this.balance += depositAmt;
    }
    public void withdraw(double withdrawAmt){
        this.balance -= withdrawAmt;
    }

    public String toString() {
        return "\nAccount ID: " + accNumber + "\nDate created: " + getDateCreated()
                + "\nBalance: $" + String.format("%.2f", balance);
    }
    
}
class CheckingAccount extends Account{
    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    CheckingAccount(){ super();overdraftLimit = -100;}

    CheckingAccount(double accNumber, double balance, double overdraftLimit){
        super(accNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw(double amt){
        if(getBalance() - amt > overdraftLimit){
            setBalance(getBalance() - amt);
        }
        else {
            System.out.println("Exceeded the overdraftlimit" + getBalance());
        }
    }

    public String toString(){
        System.out.println("Checkings Accout Overdraft limit : " + overdraftLimit);
        return null;
    }
}

class SavingAccount extends Account{

    SavingAccount(){
        super();
    }
    SavingAccount(double accNumber, double balance){
       super(accNumber, balance);
    }
    public void withdraw(double amt){
        if(getBalance() > amt){
            setBalance(getBalance() - amt);
        }
        else {
            System.out.println("Overdrwn is not allowed in savings account");
        }
    }


    public String toString(){
        System.out.println("In Savings account Overdrawn is not allowed, your balance is " + getBalance());

        return null;
    }


}
