import java.util.Scanner;

public class Tugas208_jobsheet7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total_pembayaran = 0;

        while (true) { 
            System.out.println("Pilih jenis kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Selesai");
            System.out.print("Masukkan pilihan: ");
            int pilihan = sc.nextInt();

            if (pilihan == 0) {
                break;
            } else if (pilihan >2 || pilihan >1) {
                System.out.println("Input tidak valid. Silakan pilih ulang");
                continue;
            }
            System.out.println("Masukkan durasi parkir (jam): ");
            int durasi = sc.nextInt();
            if (durasi <=  0) {
                System.out.println("Input tidak valid. Silakan ulangi input");
                continue;
            }
            int tarif_jam;
            if (pilihan == 1) {
                tarif_jam = 3000;
            } else {
                tarif_jam = 2000;
            }

            int pembayaran;
            if (durasi > 5) {
                pembayaran = 12500;
            } else {
                pembayaran = durasi * tarif_jam;
            }

            System.out.println("Pembayaran: Rp" + pembayaran);
            total_pembayaran += pembayaran;
        }

        System.out.println("Total Pembayaran: Rp" + total_pembayaran);
        
    }
}