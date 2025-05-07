public class ExcuseLetter14 {
    String id;
    String name;
    String className;
    char typeOfExcuse;
    int duration;
    public ExcuseLetter14(String id, String name, String className, char typeOfExcuse, int duration) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
        System.out.println("Type of Excuse: " + (typeOfExcuse == 'S' ? "Sick" : "Personal"));
        System.out.println("Duration: " + duration + " day(s)");
    }
}
