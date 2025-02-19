|  | Algorithm and Data Structure |
|--|--|
| NIM |  1234567|
| Nama |  You know who |
| Kelas | TI - 1I |
| Repository | [link] |  | Algorithm and Data Structure |
|--|--|
| NIM |  1234567|
| Nama |  You know who |
| Kelas | TI - 1I |
| Repository | [link] (https://github.com/jti-polinema/-01-contoh-laporan-react) |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot](img/img1.png)

**Brief explanaton:** There are 4 main step: 
1. Input all grades
2. Validate the input
3. Calculate and convert the final grade
4. Decide the final status

## 2.1.1. Selection Solution
![Screenshot (567)](https://github.com/user-attachments/assets/8c75a7c4-fbee-4894-b451-457880d06640)
![Screenshot (568)](https://github.com/user-attachments/assets/bff944f3-eae8-42a9-8916-8886c591540c)

Brief explanaton: These are the steps:
1. Input all grades
2. Validate the input
3. Calculate and convert the final grade
4. Decide the final status

## 2.1.2. Looping Solution
![Screenshot (571)](https://github.com/user-attachments/assets/3f9a134a-0dc5-4e89-913d-65d4d316a0ad)
![Screenshot (572)](https://github.com/user-attachments/assets/9fc3c2f7-7e21-4747-bbdc-7c607640c2f9)

Brief explanation: These are the steps:
1. Input NIM
2. Extract last 2 digits (n= NIM % 100)
3. Make sure (n) at least 10, if n < 10, add 10
4. Print n value
5. Do the loop from 1 to n (skip 6 and 10)

## 2.1.3. Array Solution
import java.util.Scanner;

public class IPSemesterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Maksimal jumlah mata kuliah (bisa diubah sesuai kebutuhan)
        int maxCourses = 10;
        String[] courseNames = new String[maxCourses];
        double[] courseScores = new double[maxCourses];
        double[] courseCredits = new double[maxCourses];
        String[] letterGrades = new String[maxCourses];
        double[] gradePoints = new double[maxCourses];

        int courseCount = 0;
        double totalWeightedScore = 0;
        double totalCredits = 0;

        System.out.println("Program Menghitung IP Semester");
        
        // Input data
        while (true) {
            System.out.print("Masukkan nama mata kuliah (atau ketik 'selesai' untuk berhenti): ");
            String courseName = scanner.nextLine();
            if (courseName.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai angka untuk MK " + courseName + ": ");
            double score = scanner.nextDouble();

            System.out.print("Masukkan bobot SKS untuk MK " + courseName + ": ");
            double sks = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer newline
            
            // Konversi nilai angka ke huruf dan bobot nilai
            String gradeLetter;
            double gradePoint;
            if (score > 80) {
                gradeLetter = "A";
                gradePoint = 4.0;
            } else if (score > 73) {
                gradeLetter = "B+";
                gradePoint = 3.5;
            } else if (score > 65) {
                gradeLetter = "B";
                gradePoint = 3.0;
            } else if (score > 60) {
                gradeLetter = "C+";
                gradePoint = 2.5;
            } else if (score > 50) {
                gradeLetter = "C";
                gradePoint = 2.0;
            } else if (score > 39) {
                gradeLetter = "D";
                gradePoint = 1.0;
            } else {
                gradeLetter = "E";
                gradePoint = 0.0;
            }

            // Simpan data ke dalam array
            courseNames[courseCount] = courseName;
            courseScores[courseCount] = score;
            courseCredits[courseCount] = sks;
            letterGrades[courseCount] = gradeLetter;
            gradePoints[courseCount] = gradePoint;
            courseCount++;

            // Perhitungan IP
            totalWeightedScore += gradePoint * sks;
            totalCredits += sks;
        }

        // Hitung IP Semester
        double ipSemester = (totalCredits > 0) ? totalWeightedScore / totalCredits : 0;

        // Output hasil dalam format tabel
        System.out.println("\nHasil Konversi Nilai");
        System.out.printf("%-30s %-10s %-10s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < courseCount; i++) {
            System.out.printf("%-30s %-10.2f %-10s %-10.2f%n", 
                courseNames[i], courseScores[i], letterGrades[i], gradePoints[i]);
        }
        
        // Cetak IP Semester
        System.out.printf("\nIP : %.2f%n", ipSemester);

        scanner.close();
    }
}

## 2.1.4. Function Solution
public class FlowerShop {
    public static void main(String[] args) {
        // Display income for each branch
        System.out.println("Income for each branch:");
        displayIncome();

        // Display stock for RoyalGarden branch 4 after reduction
        System.out.println("\nStock for RoyalGarden branch 4 after reduction:");
        displayStockWithReduction();
    }

   
    // Prices of each flower
    static int AGLONEMA_PRICE = 75000;
    static int KELADI_PRICE = 50000;
    static int ALOCASIA_PRICE = 60000;
    static int MAWAR_PRICE = 10000;

    // Flower stock data for each branch
    // Data format: rows are branches, columns are flowers (Aglonema, Keladi, Alocasia, Mawar)
    static int[][] stock = {
        {1, 10, 5, 15, 7}, // RoyalGarden 1
        {6, 11, 9, 12, 12}, // RoyalGarden 2
        {2, 10, 10, 5, 10}, // RoyalGarden 3
        {5, 7, 12, 9, 8}   // RoyalGarden 4
    };

    // Function to display income for each branch if all flowers are sold out
    public static void displayIncome() {
        for (int i = 0; i < stock.length; i++) {
            int income = calculateIncome(stock[i]);
            System.out.println("Income for RoyalGarden " + (i + 1) + ": Rp " + income);
        }
    }

    // Function to calculate income for each branch
    public static int calculateIncome(int[] stockPerBranch) {
        int income = 0;
        // Calculate income for each flower type
        income += stockPerBranch[1] * AGLONEMA_PRICE;
        income += stockPerBranch[2] * KELADI_PRICE;
        income += stockPerBranch[3] * ALOCASIA_PRICE;
        income += stockPerBranch[4] * MAWAR_PRICE;
        return income;
    }

    // Function to display stock for RoyalGarden branch 4 after reduction
    public static void displayStockWithReduction() {
        // Stock reductions
        int aglonemaReduction = 1;
        int keladiReduction = 2;
        int alocasiaReduction = 0;
        int mawarReduction = 5;

        // Stock data for RoyalGarden branch 4 (index 3)
        int[] branch4Stock = stock[3];

        // Apply reductions
        branch4Stock[1] -= aglonemaReduction;
        branch4Stock[2] -= keladiReduction;
        branch4Stock[3] -= alocasiaReduction;
        branch4Stock[4] -= mawarReduction;

        // Display updated stock for RoyalGarden branch 4
        System.out.println("Aglonema: " + branch4Stock[1]);
        System.out.println("Keladi: " + branch4Stock[2]);
        System.out.println("Alocasia: " + branch4Stock[3]);
        System.out.println("Mawar: " + branch4Stock[4]);
    }
}

## 2.2.1. Assignment 1  Solution
![Screenshot (573)](https://github.com/user-attachments/assets/2ab9abd8-e2dc-487a-97fb-a71573d6bbae)
![Screenshot (574)](https://github.com/user-attachments/assets/8acc2d02-8b5b-4743-80e7-0541880ffe0d)

The program executes the following steps:

1. Accepts a single character as input representing the first letter of a vehicle's license plate.
2. Checks if the input character exists in a predefined list of city codes.
3. If the character matches, it prints the corresponding city name.
4. If no match is found, it prints an error message saying the code is not found.

2.2.2. Assignment 2 Solution
![Screenshot (575)](https://github.com/user-attachments/assets/9de0bdae-52f2-4dc1-9a5c-6dfb0cb06c10)
Description: This file contains a program for calculating the volume, surface area, and perimeter of a cube. It provides a menu for the user to choose which calculation to perform.

Key Concepts:

Mathematical calculations for volume, surface area, and perimeter
User input handling for cube side length
Conditional logic to implement multiple options in the menu
Explanation:
The program executes the following steps:

Displays a menu for the user to choose a calculation: volume, surface area, or perimeter.
Takes input for the cube's side length.
Based on the user’s choice, it performs the relevant calculation:
Volume = side³
Surface area = 6 × side²
Perimeter = 12 × side
Displays the result for the chosen calculation.

2.2.3 Assignment 3 Solution
![Screenshot (576)](https://github.com/user-attachments/assets/84cab3dd-db19-4a33-bf9e-d2da2180650b)
Description: This file is designed to help a user manage a course schedule. It allows users to input course details, display courses by days, semesters, and search for courses by name.

Key Concepts:

Data input handling for courses and related details (e.g., credit hours, semester, lecture days)
Menu-driven program for user interaction
Searching and filtering data based on user input
Explanation:
The program works in the following way:

The user inputs the number of courses.
The user enters the details for each course, such as name, credit hours, semester, and lecture days.
A menu is displayed offering the following options:
View all courses
View courses on a specific day
View courses in a specific semester
Search for a course by name
Exit the program
Based on the user's selection, the program displays the corresponding information.
 |

# Labs #1 Programming Fundamentals Review

## 2.1.1. Selection Solution

The solution is implemented in Pemilihan1.java, and below is screenshot of the result.

![Screenshot](img/img1.png)

**Brief explanaton:** There are 4 main step: 
1. Input all grades
2. Validate the input
3. Calculate and convert the final grade
4. Decide the final status

## 2.1.1. Selection Solution
![Screenshot (567)](https://github.com/user-attachments/assets/8c75a7c4-fbee-4894-b451-457880d06640)
![Screenshot (568)](https://github.com/user-attachments/assets/bff944f3-eae8-42a9-8916-8886c591540c)

Brief explanaton: These are the steps:
1. Input all grades
2. Validate the input
3. Calculate and convert the final grade
4. Decide the final status

## 2.1.2. Looping Solution
![Screenshot (571)](https://github.com/user-attachments/assets/3f9a134a-0dc5-4e89-913d-65d4d316a0ad)
![Screenshot (572)](https://github.com/user-attachments/assets/9fc3c2f7-7e21-4747-bbdc-7c607640c2f9)

Brief explanation: These are the steps:
1. Input NIM
2. Extract last 2 digits (n= NIM % 100)
3. Make sure (n) at least 10, if n < 10, add 10
4. Print n value
5. Do the loop from 1 to n (skip 6 and 10)

## 2.1.3. Array Solution
import java.util.Scanner;

public class IPSemesterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Maksimal jumlah mata kuliah (bisa diubah sesuai kebutuhan)
        int maxCourses = 10;
        String[] courseNames = new String[maxCourses];
        double[] courseScores = new double[maxCourses];
        double[] courseCredits = new double[maxCourses];
        String[] letterGrades = new String[maxCourses];
        double[] gradePoints = new double[maxCourses];

        int courseCount = 0;
        double totalWeightedScore = 0;
        double totalCredits = 0;

        System.out.println("Program Menghitung IP Semester");
        
        // Input data
        while (true) {
            System.out.print("Masukkan nama mata kuliah (atau ketik 'selesai' untuk berhenti): ");
            String courseName = scanner.nextLine();
            if (courseName.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan nilai angka untuk MK " + courseName + ": ");
            double score = scanner.nextDouble();

            System.out.print("Masukkan bobot SKS untuk MK " + courseName + ": ");
            double sks = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan buffer newline
            
            // Konversi nilai angka ke huruf dan bobot nilai
            String gradeLetter;
            double gradePoint;
            if (score > 80) {
                gradeLetter = "A";
                gradePoint = 4.0;
            } else if (score > 73) {
                gradeLetter = "B+";
                gradePoint = 3.5;
            } else if (score > 65) {
                gradeLetter = "B";
                gradePoint = 3.0;
            } else if (score > 60) {
                gradeLetter = "C+";
                gradePoint = 2.5;
            } else if (score > 50) {
                gradeLetter = "C";
                gradePoint = 2.0;
            } else if (score > 39) {
                gradeLetter = "D";
                gradePoint = 1.0;
            } else {
                gradeLetter = "E";
                gradePoint = 0.0;
            }

            // Simpan data ke dalam array
            courseNames[courseCount] = courseName;
            courseScores[courseCount] = score;
            courseCredits[courseCount] = sks;
            letterGrades[courseCount] = gradeLetter;
            gradePoints[courseCount] = gradePoint;
            courseCount++;

            // Perhitungan IP
            totalWeightedScore += gradePoint * sks;
            totalCredits += sks;
        }

        // Hitung IP Semester
        double ipSemester = (totalCredits > 0) ? totalWeightedScore / totalCredits : 0;

        // Output hasil dalam format tabel
        System.out.println("\nHasil Konversi Nilai");
        System.out.printf("%-30s %-10s %-10s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < courseCount; i++) {
            System.out.printf("%-30s %-10.2f %-10s %-10.2f%n", 
                courseNames[i], courseScores[i], letterGrades[i], gradePoints[i]);
        }
        
        // Cetak IP Semester
        System.out.printf("\nIP : %.2f%n", ipSemester);

        scanner.close();
    }
}

## 2.1.4. Function Solution
public class FlowerShop {
    public static void main(String[] args) {
        // Display income for each branch
        System.out.println("Income for each branch:");
        displayIncome();

        // Display stock for RoyalGarden branch 4 after reduction
        System.out.println("\nStock for RoyalGarden branch 4 after reduction:");
        displayStockWithReduction();
    }

   
    // Prices of each flower
    static int AGLONEMA_PRICE = 75000;
    static int KELADI_PRICE = 50000;
    static int ALOCASIA_PRICE = 60000;
    static int MAWAR_PRICE = 10000;

    // Flower stock data for each branch
    // Data format: rows are branches, columns are flowers (Aglonema, Keladi, Alocasia, Mawar)
    static int[][] stock = {
        {1, 10, 5, 15, 7}, // RoyalGarden 1
        {6, 11, 9, 12, 12}, // RoyalGarden 2
        {2, 10, 10, 5, 10}, // RoyalGarden 3
        {5, 7, 12, 9, 8}   // RoyalGarden 4
    };

    // Function to display income for each branch if all flowers are sold out
    public static void displayIncome() {
        for (int i = 0; i < stock.length; i++) {
            int income = calculateIncome(stock[i]);
            System.out.println("Income for RoyalGarden " + (i + 1) + ": Rp " + income);
        }
    }

    // Function to calculate income for each branch
    public static int calculateIncome(int[] stockPerBranch) {
        int income = 0;
        // Calculate income for each flower type
        income += stockPerBranch[1] * AGLONEMA_PRICE;
        income += stockPerBranch[2] * KELADI_PRICE;
        income += stockPerBranch[3] * ALOCASIA_PRICE;
        income += stockPerBranch[4] * MAWAR_PRICE;
        return income;
    }

    // Function to display stock for RoyalGarden branch 4 after reduction
    public static void displayStockWithReduction() {
        // Stock reductions
        int aglonemaReduction = 1;
        int keladiReduction = 2;
        int alocasiaReduction = 0;
        int mawarReduction = 5;

        // Stock data for RoyalGarden branch 4 (index 3)
        int[] branch4Stock = stock[3];

        // Apply reductions
        branch4Stock[1] -= aglonemaReduction;
        branch4Stock[2] -= keladiReduction;
        branch4Stock[3] -= alocasiaReduction;
        branch4Stock[4] -= mawarReduction;

        // Display updated stock for RoyalGarden branch 4
        System.out.println("Aglonema: " + branch4Stock[1]);
        System.out.println("Keladi: " + branch4Stock[2]);
        System.out.println("Alocasia: " + branch4Stock[3]);
        System.out.println("Mawar: " + branch4Stock[4]);
    }
}

## 2.2.1. Assignment 1  Solution
![Screenshot (573)](https://github.com/user-attachments/assets/2ab9abd8-e2dc-487a-97fb-a71573d6bbae)
![Screenshot (574)](https://github.com/user-attachments/assets/8acc2d02-8b5b-4743-80e7-0541880ffe0d)

The program executes the following steps:

1. Accepts a single character as input representing the first letter of a vehicle's license plate.
2. Checks if the input character exists in a predefined list of city codes.
3. If the character matches, it prints the corresponding city name.
4. If no match is found, it prints an error message saying the code is not found.

2.2.2. Assignment 2 Solution
![Screenshot (575)](https://github.com/user-attachments/assets/9de0bdae-52f2-4dc1-9a5c-6dfb0cb06c10)
Description: This file contains a program for calculating the volume, surface area, and perimeter of a cube. It provides a menu for the user to choose which calculation to perform.

Key Concepts:

Mathematical calculations for volume, surface area, and perimeter
User input handling for cube side length
Conditional logic to implement multiple options in the menu
Explanation:
The program executes the following steps:

Displays a menu for the user to choose a calculation: volume, surface area, or perimeter.
Takes input for the cube's side length.
Based on the user’s choice, it performs the relevant calculation:
Volume = side³
Surface area = 6 × side²
Perimeter = 12 × side
Displays the result for the chosen calculation.

2.2.3 Assignment 3 Solution
![Screenshot (576)](https://github.com/user-attachments/assets/84cab3dd-db19-4a33-bf9e-d2da2180650b)
Description: This file is designed to help a user manage a course schedule. It allows users to input course details, display courses by days, semesters, and search for courses by name.

Key Concepts:

Data input handling for courses and related details (e.g., credit hours, semester, lecture days)
Menu-driven program for user interaction
Searching and filtering data based on user input
Explanation:
The program works in the following way:

The user inputs the number of courses.
The user enters the details for each course, such as name, credit hours, semester, and lecture days.
A menu is displayed offering the following options:
View all courses
View courses on a specific day
View courses in a specific semester
Search for a course by name
Exit the program
Based on the user's selection, the program displays the corresponding information.

