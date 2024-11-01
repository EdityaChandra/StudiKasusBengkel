import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = scanner.nextLine();

        System.out.print("Masukkan alamat pelanggan: ");
        String alamatPelanggan = scanner.nextLine();

        System.out.print("Masukkan no telepon pelanggan: ");
        String noTeleponPelanggan = scanner.nextLine();

        Pelanggan pelanggan = new Pelanggan(namaPelanggan, alamatPelanggan, noTeleponPelanggan);

        RiwayatServis riwayatServis = new RiwayatServis(10, pelanggan);

        while (true) {
            System.out.print("Masukkan nama servis (atau ketik 'selesai' untuk keluar): ");
            String namaServis = scanner.nextLine();
            if (namaServis.equalsIgnoreCase("selesai")) {
                break;
            }

            System.out.print("Masukkan biaya servis: ");
            int biaya = scanner.nextInt();
            scanner.nextLine();

            Servis servis = new Servis(namaServis, biaya);
            riwayatServis.tambahServis(servis);
        }

        System.out.println(riwayatServis.tampilkanRiwayat());
        System.out.println("Total Biaya: " + riwayatServis.getTotalBiaya());
        System.out.println("Jumlah Servis: " + riwayatServis.getJumlahServis());

        scanner.close();
    }
}