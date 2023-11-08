public class Mahasiswa {
    private int nim;
    private String nama;
    float IPK;

    public Mahasiswa(int nim, String nama, float IPK){
        this.nim = nim;
        this.nama = nama;
        this.IPK = IPK;
    }
    public int getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
}

