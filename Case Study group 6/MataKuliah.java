class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    // Constructor
    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    // Method to display data
    public void tampilData() {
        System.out.println("Kode MK: " + kodeMK + ", Nama MK: " + namaMK + ", SKS: " + sks);
    }
}
