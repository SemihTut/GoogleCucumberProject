package oop;

import lombok.*;

@Getter @Setter
public class BankAccount {

   private final int accountNumber=12345678;
   private double balance;
   private String customerName;
   private String email;
   private long phoneNumber;

   public BankAccount(double balance, String customerName, String email, long phoneNumber) {
      this.balance = balance;
      this.customerName = customerName;
      this.email = email;
      this.phoneNumber = phoneNumber;
   }

   public void deposit(double deposit){
      balance+=deposit;
   }

   public void withdraw(double withdraw){
      if (balance >= withdraw) {
         balance = balance - withdraw;
         System.out.println("Withdrawal of "+withdraw+" is executed. You have "+balance+" dollar in your balance");
      }else{
         System.out.println("You have only "+balance+". Please withdraw sufficient money");
      }
   }
}
