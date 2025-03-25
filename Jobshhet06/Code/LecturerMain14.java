import java.util.Scanner;

public class LecturerMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData14 data = new LecturerData14();

        while (true) {
            System.out.println("\nLecturer15 Menu:");
            System.out.println("1. Add Lecturer Data");
            System.out.println("2. Display Lecturer Data");
            System.out.println("3. Sort Ascending (Youngest to Oldest)");
            System.out.println("4. Sort Descending (Oldest to Youngest)");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Gender (M/F): ");
                    char genderChar = sc.next().charAt(0);
                    boolean gender = (genderChar == 'M' || genderChar == 'm');
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    
                    Lecturer14 newLecturer = new Lecturer14(id, name, gender, age);
                    data.add(newLecturer);
                    break;
                    
                case 2:
                    System.out.println("\nLecturer Data:");
                    data.print();
                    break;
                    
                case 3:
                    data.sortingAscending();
                    System.out.println("\nSorted Data (Youngest to Oldest):");
                    data.print();
                    break;
                    
                case 4:
                    data.sortingDescending();
                    System.out.println("\nSorted Data (Oldest to Youngest):");
                    data.print();
                    break;
                    
                case 5:
                    System.out.println("Goodbye");
                    sc.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
