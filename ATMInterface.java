import javax.swing.*;
public class ATMInterface  
{    
    public static void main(String args[] )  
    {  
        int balance = 100000, withdraw, deposit; 
        String pin;
        String choice;
        int choices,number;
        pin=JOptionPane.showInputDialog("Enter the 4 Digit pin");
        number = Integer.parseInt(pin);
        while(true)  
        {  
            JOptionPane.showMessageDialog(null,"Automated Teller Machine \n"+"Option 1 for Check Balance\n"+"Option 2 for Withdraw  Money \n"+"Option 3 for Deposit Money \n"+"Option 4 for exit");  
            choice=JOptionPane.showInputDialog("Choose the operation you want to perform:");  
            choices =Integer.parseInt(choice);
            switch(choices)  
            {  
                case 1:   
                    JOptionPane.showMessageDialog(null,"Balance : "+balance);  
                    break;  
                case 2:  
                    String with=JOptionPane.showInputDialog("Enter Money to be withdraw:");  
                    withdraw = Integer.parseInt(with);
                    if(balance >= withdraw)  
                    {  
                        balance = balance - withdraw; 
                        JOptionPane.showMessageDialog(null,"Money is successfully withdraw \n"+"Please collect your money"); 
                    }  
                    else  
                    {    
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");  
                    }     
                    break;   
                case 3:        
                    String Depo=   JOptionPane.showInputDialog("Enter money to be deposited:");   
                    deposit = Integer.parseInt(Depo);  
                    balance = balance + deposit;  
                    JOptionPane.showMessageDialog(null,"Your Money has been successfully dep0sited \n"+"please check the balance");
                    break; 
                case 4:    
                    System.exit(0);
                    break;    
                default:JOptionPane.showMessageDialog(null,"You have chosen a wrong choice");
            }
        }
    }
}  
