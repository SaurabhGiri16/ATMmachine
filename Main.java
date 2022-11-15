import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // stk store the previous Transacyions 
    Stack < String> stk = new Stack<>();
    stk.push("OldTransaction");
    int card_no = 112233 , pin_no = 9616;   // set a card number and pin into the ATM Machine;
    long Balance =0;
    // Ask for the Costomer Name
    System.out.print("Welcome to ATM Machine !! \nHello  , What is your Name :");
    String Name = sc.nextLine();

    // ask the card number from user..
    System.out.print("Hi "+Name+" : Please Enter the 6 Digit Card Number 112233:");
    int Card_Number = sc.nextInt();
    // check validity of card number
    if(card_no != Card_Number ){
        System.out.println("Please Enter Valid Card Number !!");
        System.exit(0);
    }
    // ask the PIN number from user...
    System.out.print("Please Enter thr 4 Digit PIN 9616:");
    int PIN = sc.nextInt();
    // check validity of PIN number..
    if(pin_no != PIN ){
        System.out.println("Please Enter Valid PIN !!");
        System.exit(0);
    }
    while(true){
    System.out.println("Please select one ");
    System.out.print(" 1 . View Available Balance \n 2 . Withdraw Amount \n 3 . Deposite Amount \n 4 . Mini Statement \n 5 . Exit \n \nEnter Choice : ");
    
    int ch = sc.nextInt();

    if(ch == 1){
        System.out.println("Current Balance : " + Balance+" rs\n");

    }else if(ch == 2){
        
        System.out.print("Amount to Withdraw : ");
        int amt = sc.nextInt();
        if(Balance >= amt){
            if(amt%100==0){
                Balance-=amt;
                System.out.println("Withdraw : "+ amt+" rs");
               stk.push(amt+" rs Withdraw");
               }else{
                System.out.println("please Withdraw Only Multiple Of 100 !\n");
                }
        }else{
            System.out.println("Insufficient Balance !!\n");
            }

    }else if(ch == 3){
        System.out.print("Amount to Deposite : ");
        int amt = sc.nextInt();
        Balance+=amt;
        System.out.println("Deposite : "+ amt+" rs");
        stk.push(amt+" rs deposite");
        
    }else if(ch == 4){
        System.out.println("Current Balance :"+ Balance+" rs");
       while(!stk.isEmpty()){
        System.out.println(stk.pop());
       }
       
        
    }else if(ch == 5){
        System.out.println("Thanks for using ATM !\nHave a Nice Day!!");
        System.exit(0);
    }else if(ch ==0){

    }
    else{
        System.out.println("Wrong Key !!");
        System.exit(0);
    }
    // End..
    }
    }
}

