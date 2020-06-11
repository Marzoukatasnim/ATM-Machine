
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MARZOUKA
 */

public class Account {
    Scanner Input=new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.0");
    
    public int setCustNumber(int CustNumber){
        this.CustNumber = CustNumber;
        return CustNumber;
    }
    public int getCustNumber(int CustNumber){
        return CustNumber;
    }
    public int setPin(int pin){
        this.pin = pin;
        return pin;
    }
    public int getPin(int pin){
    
        return pin;
    }
    public double getCheckingBalance(){
        return CheckingBal;
    }
    public double getSavingBalance(){
        return SavingBal;
    }
    public double calcCheckingWithdraw(double amount){
        CheckingBal= CheckingBal - amount; 
        return CheckingBal;
    }
    public double calcSavingWithdraw(double amount){
        SavingBal=SavingBal - amount; 
        return SavingBal;
    }
    public double calcCheckingDeposit(double amount){
        CheckingBal= CheckingBal + amount; 
        return CheckingBal;
    }
    public double calcSavingDeposit(double amount){
        SavingBal=SavingBal + amount; 
        return SavingBal;
    }
    
    public void getCheckingWithdrawinput(){
        System.out.println("Checking account balance:" + moneyFormat.format(CheckingBal));
        System.out.println("Insert amount you want to withdraw:");
        double amount= Input.nextDouble();
        
        if((CheckingBal-amount )>=0)
        {  calcCheckingWithdraw(amount);
        System.out.println("New Checking account balance:"+ moneyFormat.format(calcCheckingWithdraw(amount)));
    }else System.out.println("Warning! Balance can not be negative. ");
    }
    
    public void getSavingWithdrawinput(){
        System.out.println("Saving account balance:" + moneyFormat.format(SavingBal));
        System.out.println("Amount u want to withdraw from saving:");
        double amount= Input.nextDouble();
        
        if((SavingBal-amount )>=0)
        {  calcSavingWithdraw(amount);
        System.out.println("New saving account balance:"+ SavingBal+"\n");
    }else System.out.println("Warning! Balance can not be negative.");
    }
    
     public void getCheckingDepositInput(){
        System.out.println("Checking account balance:" + moneyFormat.format(CheckingBal));
        System.out.println("Amount u want to deposit from checking account:");
        double amount= Input.nextDouble();
        
        if((CheckingBal+amount )>=0)
        {  calcCheckingDeposit(amount);
        System.out.println("New Checking account balance:"+ moneyFormat.format(CheckingBal));
    }else System.out.println("Warning! Balance can not be negative.");
    }
      public void getSavingDepositInput(){
        System.out.println("Saving account balance:" + moneyFormat.format(SavingBal));
        System.out.println("Amount u want to deposit from Saving account:");
        double amount= Input.nextDouble();
        
        if((SavingBal+amount)>=0)
        {  calcSavingDeposit(amount);
        System.out.println("New Saving account balance:"+ moneyFormat.format(SavingBal));
    }
        else System.out.println("Warning! Balance can not be negative");
    }
    
    
    
  
   public int CustNumber;
   public int pin;
   private double CheckingBal=0;
   private double SavingBal=0;

 
}

