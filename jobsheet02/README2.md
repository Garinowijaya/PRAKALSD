|  | Algorithm and Data Structure |
|--|--|
| NIM |  244107020230|
| Nama |  Garino Wijaya |
| Kelas | TI - 1I |
| Repository | https://github.com/Garinowijaya/PRAKALSD |  

2.1.1 Declaration, Attribute and Method :
public class Students1 { String name; String nim; double ipk; String kelas;
public class Student14 {
    String studentID;
    String name;
    String className;
    double gpa;

    public Student14(){

    }
    public Student14(String id, String name, String cls, double gpa){
        studentID = id;
        this.name = name;
        className = cls;
        this.gpa = gpa;
    }
    
    void print(){
        System.out.println("Student ID : " + studentID);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("GPA : " + gpa);
    }

    void changeClass(String newClass){
        className = newClass;
    }

    void updateGPA(double newGPA){
        gpa = newGPA;
    }

    String evaluate(){
        if (gpa >= 3.5){
            return "Excelent";
        } else if(gpa >= 3.0){
            return "Good";
        } else if(gpa >= 2.0){
            return "Fair";
        } else{
            return "Poor";
        }
    }
}

2.1.2 Experiments Verifications :
It won't work because it's work Like class and only add attribute.

2.1.3 Questions :
1. Mention two characteristics of a class or object!
2. How many attributes does the Student class have? List them!
3. How many methods does the Student class have? List them!
4. Modify the updateGPA() method to validate that the input IPK is within the range of 0.0 to 4.0. If it is out of range, display a message: "Invalid IPK. Must be between 0.0 and 4.0."
5. Explain how the evaluate() method evaluates student performance. What criteria does it use, and what does it return?
6. Commit and push the code to GitHub.

Answer :
1. A class encapsulates related data and behaviors, meaning it combines attributes and methods into one coherent structure, It provides abstraction by hiding the internal details and exposing only what is necessary through its methods.
2. name: Represents the student' name.
nim: Serves as the student identification number.
ipk: Stores the student' GPA.
kelas: Indicates the class or section the student belongs to.
3. The tampilkanInformasi() method is responsible for displaying the student' details.
The ubahKelas(String kelasBaru) method allows the student class to be updated.

  The updateIPK(double ipkBaru) method is used to modify the student GPA, which should also validate that the GPA is within an acceptable range.

  The nilaiKinerja() method evaluates the student performance based on their GPA, returning a descriptive performance rating.

  In addition to these, the class has two constructors (one default and one parameterized) to create student objects.

4. The method now checks if the new GPA (ipkBaru) falls between 0.0 and 4.0.
If the value is out of this range, it prints a message: "Invalid IPK. Must be between 0.0 and 4.0."

Otherwise, it updates the ipk attribute with the new value.
5. This method assesses the student's performance by analyzing the ipk value.
It first checks if the GPA is 3.5 or higher, and if so, it returns "Good performance."

If the GPA is between 3.0 and 3.49, it returns "Fair performance."

If the GPA is between 2.0 and 2.99, it returns "Poor performance."

For any GPA below 2.0, the method returns "Very poor performance."

2.2 Object Installation, then Accessing Atrribut and Method :
The solution is implemented in StudentMain.java, and below is screenshot of the result.
![Screenshot (590)](https://github.com/user-attachments/assets/ff314c60-da0c-4eb8-b3fa-8b3a1754b900)
Questions:
1. Show the line of code in StudentMain used for instantiation. What is the name of the created
object?
2. How do you access attributes and methods of an object?
3. Why does the output of the first and second calls to print() differ?

Answer:
1. Student16 student1 = new Student16(); The name is student1
2. do an instantiation like number 1 if the variables are not declared as a static
3. Because after the first print method, the code proceeds to make changes to the student's data and then prints the changed data

2.3. Creating a Constructor
The solution is implemented in StudentMain.java, and below is screenshot of the result.
![Screenshot (592)](https://github.com/user-attachments/assets/f0082f6d-3844-43f5-974c-c83c2f464a35)

Questions:
1. Show the line of code in Student used to declare the parameterized constructor.
2. In StudentMain, explain what the following line of code does:
3. Remove the default constructor from Student, then compile and run the program. What
happens? Explain why.
4. After instantiating an object, do methods in Student need to be accessed in order? Explain.
5. Create a new object named student<StudentName> using the parameterized constructor
from Student class.

Answer:
1. Student16 student2 = new Student16("244107020040", "Rizky", "TI-1I", 3.5);
2. Create new object with the parameterized constructor
3. ![Screenshot (594)](https://github.com/user-attachments/assets/caf04162-cdd5-4d99-967e-852bfe7fb72c)
   The default constructor is missing. Therefore, the 1st constructor cannot be run because Java did not generate the default constructor since we put another constructor (parameterized) manually. 4. No. You can call one of them directly without doing them by order. Because basically it's like functions. We can access each of either attribute or method anytime, as long as the object is created.
5. Here are the created objects using the parameter constructor.
   ![Screenshot (596)](https://github.com/user-attachments/assets/0d8c3ff1-59f0-4d5c-a22a-3e59adfc2170)

   2.4. Assignment 1
   The solution is implemented in Course14.java and CourseMain14, and below is screenshot of the result.
   Class Code
   ![Screenshot (598)](https://github.com/user-attachments/assets/795d7fed-d886-41f0-91c6-884a63f81342)

   Main Code
   ![Screenshot (602)](https://github.com/user-attachments/assets/f013c7bc-26e3-4938-8be6-2ce5337022f5)

   Output:
   ![Screenshot (601)](https://github.com/user-attachments/assets/288882af-524a-4f50-a886-cdce3acea045)

   2.4. Assignment 2
   The solution is implemented in Lecturer14.java and LecturerMain14, and below is screenshot of the result.
   Class Code
   ![Screenshot (604)](https://github.com/user-attachments/assets/c43fedb5-6a50-443f-a222-109e284a4972)

   Main Code
   ![Screenshot (606)](https://github.com/user-attachments/assets/9f94207b-3d22-4732-9b94-3c8c68b79adf)

   Output
   ![Screenshot (611)](https://github.com/user-attachments/assets/9987d627-f815-4bf1-a5e2-d60bb84dcd46)
   ![Screenshot (612)](https://github.com/user-attachments/assets/34111705-939a-490d-bd94-e90754f8d567)








