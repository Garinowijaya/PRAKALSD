class Dosen {
    String nidn;
    String namaDosen;

    // Constructor
    public Dosen(String nidn, String namaDosen) {
        this.nidn = nidn;
        this.namaDosen = namaDosen;
    }

    // Method to display data
    public void tampilData() {
        System.out.println("NIDN: " + nidn + ", Nama Dosen: " + namaDosen);
    }
}
