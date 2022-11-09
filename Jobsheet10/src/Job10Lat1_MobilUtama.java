//created by 21343034_Rani Nabilla Putri

public class Job10Lat1_MobilUtama {
    public static void main(String[] args){
        Job10Lat1_Mobil Honda = new Job10Lat1_Mobil();
        Honda.merk = "Civic";
        Honda.warna = "Hitam";
        Honda.tahunproduksi = 2020;
        System.out.println("Merek\t: " + Honda.merk);
        System.out.println("Warna\t: " + Honda.warna);
        System.out.println("Tahun\t: " + Honda.tahunproduksi);
        Honda.Maju();
        Honda.Maju();
        Honda.Mundur();
    }
}
