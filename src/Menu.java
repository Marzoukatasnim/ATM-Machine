
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
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
public class Menu extends Account{
    Scanner menuInput=new Scanner(System.in);
    DecimalFormat moneyFormat= new DecimalFormat("'$'###,##0.0");
    HashMap<Integer,Integer>data = new HashMap<Integer,Integer>();
    public void login() throws IOException{
        int x=1;
        do{
            try{
                
                data.put(4564,7678);
                //data.put(44556,5555);
                System.out.println("Welcome to ATM !!");
                System.out.println("Enter customer number:");
                setCustNumber(menuInput.nextInt());
                System.out.println("Enter pin number:");
                setPin(menuInput.nextInt());
            }catch(Exception e){
                System.out.println(" Invalid characters! Only numbers are accepted.  ");
                x=2;
            }
            for(Entry<Integer,Integer> entry:data.entrySet()){
                if(entry.getKey()== getCustNumber(CustNumber) && entry.getValue()== getPin(pin)){//CustNumber & pin public needs to be public here
                    getAccountType();
                }
                else {System.out.println("Incorrect customer number or pin !!");}
            }
    } while(x==1);
        
    
    
}
    public void getAccountType(){
        System.out.println("Select account you want to access: ");
        System.out.println("Type-1 -Checking account");
        System.out.println("Type-2 -Saving account");
        System.out.println("Type-3-Exit");
         System.out.println("Choice:");
         selection=menuInput.nextInt();
         switch(selection){
             case 1: getChecking();
             break;
             
             case 2: getsaving();
             break;
             
             case 3: System.out.println("Thanks for using the system !!");
             break;
             default: System.out.println("Invalid input");
             getAccountType();
             break;
         }
    }
         
         public void getChecking(){
             System.out.println("Checking Account: ");
             System.out.println("Type 1- View balance");
             System.out.println("Type 2- Withdrw balance");
             System.out.println("Type 3- Deposit balance");
             System.out.println("Type 4- Exit");
             System.out.println("Choice:");
             selection =menuInput.nextInt();
             switch(selection){
                 case 1: System.out.println("Checking account balance"+ moneyFormat.format(getCheckingBalance()));
                 getAccountType();
              break;
             
             case 2: getCheckingWithdrawinput();
             getAccountType();
             break;
             
             case 3: getCheckingDepositInput();
             getAccountType();
             break;
             case 4: System.out.println("Thanks for using the system.");
             break;
             
             default: System.out.println("Invalid input");
             getChecking();
             }
                 
         }
         public void getsaving(){
             System.out.println("Checking Account: ");
             System.out.println("Type 1- View balance");
             System.out.println("Type 2- Withdrw balance");
             System.out.println("Type 3- Deposit balance");
             System.out.println("Type 4- Exit");
             System.out.println("Choice:");
             selection =menuInput.nextInt();
             switch(selection){
                 case 1: System.out.println("Saving account balance"+ moneyFormat.format(getSavingBalance()));
                 getAccountType();
              break;
             
             case 2: getSavingWithdrawinput();
             getAccountType();
             break;
             
             case 3: getSavingDepositInput();
             getAccountType();
             break;
             case 4: System.out.println("Thanks for using the system.");
             
             default: System.out.println("Invalid input");
             getsaving();
             }
         }
         
         int selection;
    }



