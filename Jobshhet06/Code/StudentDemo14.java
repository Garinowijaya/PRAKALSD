public class StudentDemo14 {
    public static void main(String[] args) {
        TopStudent14 topstudent = new TopStudent14(5);

        topstudent.add(new Student14("2201", "Alice", "A", 3.9));
        topstudent.add(new Student14("2202", "Bob", "B", 3.7));
        topstudent.add(new Student14("2203", "Charlie", "C", 3.8));
        topstudent.add(new Student14("2204", "David", "D", 3.6));
        topstudent.add(new Student14("2205", "Eve", "E", 4.0));

        System.out.println("Original student list:");
        topstudent.print();

        topstudent.bubbleSort();
        System.out.println("\nSorted student list (by GPA, ascending) using Bubble Sort : \n");
        topstudent.print();

        topstudent.selectionSort();
        System.out.println("\nSorted student list (by GPA, ascending) using Selection Sort : \n");
        topstudent.print();

        topstudent.insertionSort();
        System.out.println("\nSorted student list (by GPA, descending):\n");
        topstudent.print();
    }
}

/* MODIFIED CODE WITH SCANNER
 * import java.util.Scanner;
public class StudentDemo15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();

        TopStudent15 topstudent = new TopStudent15(numStudents);

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("NIM: ");
            String nim = sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Class: ");
            String studentClass = sc.nextLine();

            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            topstudent.add(new Student15(nim, name, studentClass, gpa));
        }
        topstudent.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection Sort : ");
        topstudent.print();
        sc.close();
    }
}
 */
