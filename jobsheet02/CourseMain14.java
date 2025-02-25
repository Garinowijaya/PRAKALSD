public class CourseMain14 {
    public static void main(String[] args) {
        Course14 course1 = new Course14();
        course1.courseID = "ALSD";
        course1.name = "Algoritma dan Struktur Data";
        course1.credit = 2;
        course1.hour = 4;
        course1.print();

        System.out.println("---------------------");
        course1.addHour(2);
        course1.changeCredit(3);
        course1.print();

        System.out.println("---------------------");
        course1.reduceHour(2);
        course1.changeCredit(2);
        course1.print();

        Course14 course2 = new Course14("BD", "Basis Data", 3,6);
        course2.print();
        System.out.println("---------------------");
        course2.reduceHour(2);
        course2.changeCredit(2);
        course2.print();
    }
}
