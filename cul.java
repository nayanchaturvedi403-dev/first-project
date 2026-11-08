import java.util.Scanner;

public class cul {
    public static int Nayan(int a, int b, int c) {
        return (a*b*c);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER YOUR VALUE");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int result = Nayan(a,b,c) /100;
    System.out.println("RESULT Is: " + result);

}   
    

}