package chapter11;

import java.util.Date;

public class ex11_3 {
    public static void main(String[] args){
        CheckingAccount ca = new CheckingAccount();
        SavingAccount sa = new SavingAccount();
        ca.toString();
        sa.toString();
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

    public double deposit(double depositAmt){
        this.balance += depositAmt;
        return balance;
    }
    public double withdraw(double withdrawAmt){
        this.balance -= withdrawAmt;
        return balance;
    }

    public String toString() {
        return "\nAccount ID: " + accNumber + "\nDate created: " + getDateCreated()
                + "\nBalance: $" + String.format("%.2f", balance) +
                "\nMonthly interest: $";
    }
    
}
class CheckingAccount extends Account{
    private double overdraftLimit = 3000;

    public String toString(){
        System.out.println("In checkings account Overdraft limit is $3000");

        return null;
    }



}

class SavingAccount extends Account{
    public String toString(){
        System.out.println("In Savings account Overdrawn is not allowed");

        return null;
    }


}
