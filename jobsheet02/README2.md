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
