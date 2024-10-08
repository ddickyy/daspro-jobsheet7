import java.util.Scanner;

public class Tugas108_jobsheet7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tiket = 50000, total_tiket = 0, jml_tiket;
        long total_penjualan = 0;
        double diskon;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jml_tiket = sc.nextInt();

            if (jml_tiket == 0) {
                break;
            } else if (jml_tiket < 0) {
                System.out.println("Input jumlah tiket tidak valid.");
                continue;
            }  
        
        if (jml_tiket > 4) {
            diskon = 0.15;
        if (jml_tiket > 10) 
            diskon = 0.1;

            long sub_total = (long) (jml_tiket * tiket - (tiket * diskon));
            total_tiket += jml_tiket;
            total_penjualan += sub_total;

            System.out.println("Subtotal: Rp" + sub_total);
        }
    }
        System.out.println("Total Tiket Terjual: " + total_tiket);
        System.out.println("Total Pendapatan: Rp" + total_penjualan);
    }
}