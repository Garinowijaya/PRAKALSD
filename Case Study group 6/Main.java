public class Main {
    public static void main(String[] args) {
        // Create instances of Dosen
        Dosen dosen1 = new Dosen("D001", "Budi Hartono");
        Dosen dosen2 = new Dosen("D002", "Rina Marina");

        // Create instances of MataKuliah
        MataKuliah mk1 = new MataKuliah("MK001", "Struktur Data", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Pemrograman Java", 3);

        // Create instances of Jadwal
        Jadwal jadwal1 = new Jadwal(dosen1, mk1, "Senin", "08:00");
        Jadwal jadwal2 = new Jadwal(dosen2, mk2, "Selasa", "14:00");

        // Displaying data
        jadwal1.tampilData();
        jadwal2.tampilData();
    }
}
