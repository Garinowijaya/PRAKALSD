class Jadwal {
    Dosen dosen;
    MataKuliah mataKuliah;
    String hari;
    String jam;

    // Constructor
    public Jadwal(Dosen dosen, MataKuliah mataKuliah, String hari, String jam) {
        this.dosen = dosen;
        this.mataKuliah = mataKuliah;
        this.hari = hari;
        this.jam = jam;
    }

    // Method to calculate duration or any related functionality
    public int hitungMenit() {
        // Example implementation - adjust as needed
        // This could be improved to calculate real duration based on 'jam'
        return 60; // Placeholder
    }

    // Method to display data
    public void tampilData() {
        System.out.print("Dosen: ");
        dosen.tampilData();
        System.out.println("Mata Kuliah: " + mataKuliah.namaMK + ", Hari: " + hari + ", Jam: " + jam);
    }
}
