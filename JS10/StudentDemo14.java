import java.util.Scanner;
public class StudentDemo14 {
    public static void main(String[] args) {
        StudentAssignmentStack14 stack = new StudentAssignmentStack14(5);
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Assignment Submision");
            System.out.println("2. Assignment Grading");
            System.out.println("3. Display Top Assignment");
            System.out.println("4. Display Assigment List");
            System.out.println("5. Display first submited assignment");
            System.out.print("Choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    scan.nextLine();
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Class: ");
                    String kelas = scan.nextLine();
                    Student14 std = new Student14(nim, name,kelas);
                    stack.push(std);
                    System.out.printf("Assignment %s submited succesfully\n", std.name);
                    break;
                case 2:
                    Student14 graded = stack.pop();
                    if (graded != null) {
                        System.out.println("Grading assignment from " + graded.name);
                        System.out.print("Insert grade (0-100): ");
                        int grade = scan.nextInt();
                        graded.grading(grade);
                        System.out.printf("Assignment grade of %s is %d\n", graded.name, grade);
                        String binary = stack.convertToBinary(grade);
                        System.out.printf("Assignment grade in binary is %s\n", binary);
                    }
                    break;
                case 3:
                Student14 see = stack.peek();
                if (see !=null){
                    System.out.println("The last Assignment submited by " + see.name);
                }
                    break;
                case 4:
                System.out.println("List of all assignment");
                System.out.println("Name\tNIM\tClass");
                stack.print();
                    break;
                case 5:
                Student14 first = stack.bottom();
                if (first != null) {
                    System.out.println("The first Assignment submitted by " + first.name);
                }
                break;
                default:
                System.out.println("Invalid choice");
                    break;
            }
        } while (choice >=1 && choice <=5);
    }
}
