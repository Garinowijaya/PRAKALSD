import java.util.Scanner;

public class ExcuseMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExcuseLetterStack14 stack = new ExcuseLetterStack14(50);
        int choice;

        while (true) {
            System.out.println("\n=== Excuse Letter Management ===");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Class: ");
                    String className = sc.nextLine();
                    System.out.print("Enter Type of Excuse (S = Sick, I = Personal): ");
                    char type = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Enter Duration (days): ");
                    int duration = sc.nextInt();
                    sc.nextLine();

                    ExcuseLetter14 letter = new ExcuseLetter14(id, name, className, type, duration);
                    stack.push(letter);
                    System.out.println("Excuse letter submitted successfully.");
                    break;
                case 2:
                    ExcuseLetter14 processed = stack.pop();
                    if (processed != null) {
                        System.out.println("Processing the following letter:");
                        processed.display();
                    }
                    break;
                case 3:
                    ExcuseLetter14 topLetter = stack.peek();
                    if (topLetter != null) {
                        System.out.println("Latest excuse letter:");
                        topLetter.display();
                    }
                    break;
                case 4:
                    System.out.print("Enter the student name to search: ");
                    String searchName = sc.nextLine();
                    stack.searchByName(searchName);
                    break;
                case 5:
                    System.out.println("Exiting Program");
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
