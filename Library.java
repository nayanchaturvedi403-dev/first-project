import java.util.Scanner;

public class Library {
   public static void runLibrary(Scanner sc) {
    System.out.println("ENTER YOUR NUMBER");
    while (true) {
    int days = sc.nextInt();

    if (days >= 1 && days <= 5) {
        System.out.println( "YOUR LIBRARY FEE IS : " + days*2+" Rupee");
    }
    else if (days >= 6 && days <= 10) {
        System.out.println( "YOUR LIBRARY FEE IS : " + days*5+" Rupee");
    }
    else if (days >= 11 && days <= 30) {
        System.out.println( "YOUR LIBRARY FEE IS : " + days*10+" Rupee");
    }
    else {
        System.out.println("YOUR SUBSCRIPTION HAS BEEN CANCELLED");
break;
    }
    }
    
}   
    

}