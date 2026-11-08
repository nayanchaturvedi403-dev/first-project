import java.util.Scanner;
public class Array2 {

 public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println( "Enter Your Marks: ");
 int[] marks = new int[5]; // एरे में मार्क्स डालें
 int total = 0;
 for (int i = 0; i < marks.length; i++) {

 marks[i] = sc.nextInt(); // उपयोगकर्ता से मार्क्स इनपुट लें
 total = total + marks[i];

 }

 System.out.println("Total Marks: " + total);
 }
}
