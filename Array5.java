public class Array5 {
     public static void main(String[] args) { 
         int[] rollNumbers = {101, 102, 103, 104, 105}; 
         int target = 105; // यह नंबर खोजना है 
        boolean found = false; 
         for (int i = 0; i < rollNumbers.length; i++) { 
             if (rollNumbers[i] == target) { 
         System.out.println(target + " Found at index: " + i); 
         found = true; 
          break; 
        // मिलने के बाद लूप रोक दो 
        }  
        }  
        if (!found) 
        System.out.println(target + " Non in List");
         } 
         } 