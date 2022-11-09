//created by 21343034_Rani Nabilla Putri
import java.util.Scanner;

public class Manusia {
    String nama, tempat_lahir, tgl_lahir;
    int berat_badan, tinggi_badan;

    public void inputdata(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama lengkap  : ");
        nama = input.nextLine();
        System.out.print("Masukkan tempat lahir  : ");
        tempat_lahir = input.nextLine();
        System.out.print("Masukkan tanggal lahir : ");
        tgl_lahir = input.nextLine();
        System.out.print("Masukkan berat badan   : ");
        berat_badan = input.nextInt();
        System.out.print("Masukkan tinggi badan  : ");
        tinggi_badan = input.nextInt();
    }

    public void identitas(){
        System.out.println("Nama saya     : " + nama);
        System.out.println("Tempat lahir  : " + tempat_lahir);
        System.out.println("Tanggal lahir : " + tgl_lahir);
        System.out.println("Berat badan   : " + berat_badan);
        System.out.println("Tinggi badan  : " + tinggi_badan);
    }

    public static void main(String[] args){
        Manusia A = new Manusia();
        A.inputdata();
        A.identitas();
    }
}