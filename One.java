import java.util.Scanner;

public class One {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR VALUE");
    int num = sc.nextInt();
    if (num % 2 == 0) {
    System.out.println("THIS NUMBER IS EVEN");
}
 else {
        System.out.println("THIS NUMBER IS ODD");
    }
    sc.close();
}
}