public class StudentMain14 {
    public static void main(String[] args) {
        Student14 student1 = new Student14();
        student1.studentID = "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-1I";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();

        Student14 student2 = new Student14("244107020040", "Rizky", "TI-1I", 3.5);
        student2.updateGPA(3.3);
        student2.print();

        Student14 student3 = new Student14("244107020083", "Garino", "TI-1I", 3.8);
        student3.updateGPA(3.3);
        student3.print();
    }
}
