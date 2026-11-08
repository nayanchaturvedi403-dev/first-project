import java.util.Scanner;

public class CCC {
    public static int Nayan(int a, int b) {
        return a+b;
    }
    public static int Hii(int a, int b) {
        return a-b;
    }
    public static int Hi(int a, int b) {
        return a*b;
    }
    public static int H(int a, int b) {
        return a/b;
    }
public static void runCCC(Scanner sc) {
    System.out.println("ENTER YOUR VALUE");
    while (true) {
    int a = sc.nextInt();
    char OP = sc.next().charAt(0);
    int b = sc.nextInt();
    if (OP == '+') {
        System.out.println("THIS Is ANSWER : " + Nayan(a, b));
        
    }   
    else if (OP == '-') {
        System.out.println("THIS Is ANSWER : "+ Hii(a, b));
        }
    else if (OP == '*') {
        System.out.println("THIS Is ANSWER : " + Hi(a, b));
    }
    else if (OP == '/') {
        System.out.println("THIS Is ANSWER : " + H(a, b));
        
    }
    else {
        System.out.println("THIS Is ANSWER : INVALID ");
        break;
      } 
    }
}

}
