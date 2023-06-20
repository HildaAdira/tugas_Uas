//Hilaria Iwung
//227064516036
package gajiKaryawan;
public class Main {
    public static void main(String[] args) {
        System.out.println("Gaji Karyawan\t:");
        System.out.println("================");
    
        Karyawan karyawan = new Karyawan();
        karyawan.karyawan("8598979857", "Hilda", "perempuan");
        karyawan.absenKerja();
        karyawan.hitungGaji();
        karyawan.displayInfo();

        Dosen dosen = new Dosen();
        dosen.karyawan("89797576874", "Raka", "Laki-Laki");
        dosen.setGolongan("B");
        dosen.setJumlahSks(4);
        dosen.absenKerja();
        dosen.hitungGaji();
        dosen.displayInfo();

        Staf staf = new Staf();
        staf.karyawan("9897845743", "Arumi", "Perempuan");
        staf.absenKerja();
        staf.hitungGaji();
        staf.displayInfo();        
       
    }
}