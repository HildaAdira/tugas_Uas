//Hilaria Iwung
//227064516036
package gajiKaryawan;

public class Karyawan {
   
   // Class Karyawan

    private String Nip;
    private String nama;
    private String jenisKelamin;
    int jumlahHari;
    int totalGaji;

    public void karyawan(String NIP, String nama, String jenisKelamin) {
        this.Nip = NIP;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jumlahHari = 0;
        this.totalGaji = 0;
    }

    public void absenKerja() {
        this.jumlahHari++;
    }

    public void hitungGaji() {
        this.totalGaji = this.jumlahHari * 50000;
    }

    public void displayInfo() {
        System.out.println("NIP\t\t: " + this.Nip);
        System.out.println("Nama\t\t: " + this.nama);
        System.out.println("Jenis Kelamin\t: " + this.jenisKelamin);
        System.out.println("Total Gaji\t: " + this.totalGaji);
        System.out.println("---------------------------");
    }
}

// Class Dosen
class Dosen extends Karyawan {
    private String golongan;
    private int jumlahSks;
    private int upahPerSks;

    public void hitungGaji() {
        this.totalGaji = this.jumlahHari * this.upahPerSks * this.jumlahSks;
    }

    public void setGolongan(String golongan) {
        this.golongan = golongan;
        if (golongan.equals("A")) {
            this.upahPerSks = 50000;
        } else if (golongan.equals("B")) {
            this.upahPerSks = 75000;
        } else if (golongan.equals("C")) {
            this.upahPerSks = 100000;
        } else {
            System.out.println("Golongan tidak valid!");
        }
    }

    public void setJumlahSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }
}

// Class Staf
class Staf extends Karyawan {

}





