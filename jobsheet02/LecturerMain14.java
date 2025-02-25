public class LecturerMain14 {
    public static void main(String[] args) {
        Lecturer14 leturer1 = new Lecturer14();
        leturer1.lecturerID = "GW";
        leturer1.name = "Garino Wijaya";
        leturer1.status = true;
        leturer1.startYear = 2005;
        leturer1.expertiseField = "backend";
        leturer1.print();

        System.out.println("---------------------");
        leturer1.changeExpertiseField("game");
        leturer1.print();
        System.out.printf("Tenure : %d year %n", leturer1.calculateTenure(2025));

        Lecturer14 lecturer2 = new Lecturer14("AN", "Anissa Nabila", true, 2005, "ALSD");
        System.out.println("---------------------");
        lecturer2.print();
        
        System.out.println("---------------------");
        lecturer2.setStatus(false);
        lecturer2.print();
    }
}
