import java.util.Scanner;
public class Array3 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 int[] arr = new int[5];
 // मान लिया कि पहला नंबर ही सबसे बड़ा है
 int max = arr[0];

 for (int i = 0; i < arr.length; i++) {
 arr[i] = sc.nextInt();
    if (arr[i] > max) {
 max = arr[i]; // अगर कोई इससे बड़ा मिले तो max को अपडेट करो
 }
 }
 System.out.println("Largest number: " + max);
    }
}