import java.util.Scanner;

public class ATM {
public static void runATM(Scanner sc) {
    System.out.println("ENTER YOUR PIN");
    double balance = 10000.0;
    int correctPin = 1887;
    int enteredPin = sc.nextInt();

if (enteredPin == correctPin) {
    while (true) {
        System.out.println("1. Withdraw " );
        System.out.println("2. Deposit " );
        System.out.println("3. Check Balance " );
        System.out.println("4. Exit " );
    int Sellect = sc.nextInt();
    if ( Sellect == 1){
    System.out.println("Enter Your Amount");
    double amount = sc.nextDouble();
    if (amount <= balance){
    balance = balance - amount;    
    System.out.println("Your Transaction Has Successful ");
    System.out.println("Your Available Balance is : " + balance);
    }
    else{ 
    System.out.println("You Have Insufficient Balance");
    System.out.println("Your Available Balance is : " + balance); 
    }
    }
    else if ( Sellect == 2) {
    System.out.println("Enter Your Amount");
    double amount = sc.nextDouble();
    balance = balance + amount; 
    System.out.println("Your Available Balance is : " + balance); 
    }
    else if ( Sellect == 3) {
    System.out.println("Your Balance is : " + balance);
    }
    else if ( Sellect == 4) {
    System.out.println("Thank You for Banking ");
    break;
    }
    else {
    System.out.println("You Enter Wrong Entry");
    }
}
}
else{
    System.out.println(" Your Pin is Invalid");
}
}
}

