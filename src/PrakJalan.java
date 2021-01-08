import java.util.Scanner;

public class PrakJalan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Buat Objek Barunya Dulu Yakk..
        Prak3 Kamu = new Prak3();
        // Atribut Orangnya Diisi Dulu Yukk..
        System.out.println("");
        System.out.print("Masukin Nama Kamu : ");
        Kamu.nama = input.nextLine();
        System.out.print("NIS Kamu Berapa? : ");
        Kamu.NIS = input.nextInt();
        System.out.print("Kamu Lahir Dimana? : ");
        Scanner darurat = new Scanner(System.in);
        Kamu.Tlahir = darurat.nextLine();
        System.out.print("Kalo Tanggal lahir Kamu? : ");
        Kamu.Tglahir = darurat.nextLine();
        System.out.print("Kamu Laki Atau Cewe? : ");
        Kamu.Jenkel = darurat.nextLine();
        System.out.print("Alamat kamu? : ");
        Kamu.Alamat = darurat.nextLine();
        System.out.print("Btw Motto Hidupmu Apa? : ");
        Kamu.Motto = darurat.nextLine();
        //Sekarang Jalanin Methodnya Yakk..
        Kamu.run();
    }
}
