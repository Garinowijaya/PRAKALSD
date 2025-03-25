public class LecturerData14 {
    Lecturer14[] LecturerData14;
    int idx;

    public LecturerData14() {
        LecturerData14 = new Lecturer14[5];
        idx = 0;
    }

    public void add(Lecturer14 dsn) {
        if (idx < LecturerData14.length) {
            LecturerData14[idx] = dsn;
            idx++;
        } else {
            System.out.println("Too many data");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            LecturerData14[i].print();
        }
    }

    public void sortingAscending() { //bubble sort (young to old)
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (LecturerData14[j].age > LecturerData14[j + 1].age) {
                    Lecturer14 temp = LecturerData14[j];
                    LecturerData14[j] = LecturerData14[j + 1];
                    LecturerData14[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDescending() { //selection sort (old to young)
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (LecturerData14[j].age > LecturerData14[maxIdx].age) {
                    maxIdx = j;
                }
            }
            Lecturer14 temp = LecturerData14[maxIdx];
            LecturerData14[maxIdx] = LecturerData14[i];
            LecturerData14[i] = temp;
        }
    }
}
