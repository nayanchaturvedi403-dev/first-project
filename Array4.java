public class Array4 {
 public static void main(String[] args) {
 int[] data = {1, 2, 3, 4, 5};

System.out.println("REVERSE ORDER:");

 // आखिरी इंडेक्स (length - 1) से शुरू करके इंडेक्स 0 तक जाएंगे
 for (int i = data.length - 1; i >= 0; i--) {

System.out.println(data[i]);

 }
}
}