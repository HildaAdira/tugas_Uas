//Hilaria Iwung
//227064516036
package gajiKaryawan;
public class Main {
    public static void main(String[] args) {
        System.out.println("Gaji Karyawan\t:");
        System.out.println("================");
    
        Karyawan karyawan = new Karyawan();
        karyawan.Nip ="LPW8979857";
        karyawan.nama ="Hilda";
        karyawan.jenisKelamin = "perempuan";
        karyawan.absenKerja();
        karyawan.hitungGaji();
        karyawan.displayInfo();

        Dosen dosen = new Dosen();
        dosen.Nip ="SNR7576874";
        dosen.nama ="Raka";
        dosen.jenisKelamin = "laki-laki";        
        dosen.setGolongan("B");
        dosen.setJumlahSks(4);
        dosen.absenKerja();
        dosen.hitungGaji();
        dosen.displayInfo();

        Staf staf = new Staf();
        staf.Nip ="SIP7845743";
        staf.jenisKelamin = "perempuan";
        staf.absenKerja();
        staf.hitungGaji();
        staf.displayInfo();        
       
    }
}