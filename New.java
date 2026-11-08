import java.util.Scanner; 
public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
     if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0 )){
System.out.println("THIS IS LEAP YEAR");
     }
     else {System.out.println("THIS IS NOT LEAP YEAR");
     }
    }
}
