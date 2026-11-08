import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        // दोनों क्लास के ऑब्जेक्ट्स बना लिए
        // (शर्त यह है कि ccc और ATM के अंदर कोड को मेथड्स में बांटा गया हो)
        
        while (running) {
            System.out.println("=== MASTER MENU ===");
            System.out.println("1. Run ATM");
            System.out.println("2. Run Calculator");
            System.out.println("3. Fee Calculator");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Launching ATM...");
                ATM.runATM(sc);
                // ATM क्लास का मेन मेथड या रन मेथड कॉल करो
                // उदाहरण: ATM.main(args); (अगर ATM में main मेथड है)
            } 
            else if (choice == 2) {
                System.out.println("Launching Calculator...");
                CCC.runCCC(sc);
                // ccc क्लास का मेथड कॉल करो
            } 
            else if (choice == 3) {
                System.out.println("Fee Calculator...");
                Library.runLibrary(sc);
            }
            else if (choice == 4) {
                System.out.println("Exiting...");
                running = false;
            } 
            else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}