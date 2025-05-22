import java.util.ArrayList;
import java.util.Scanner;

public class SkincareShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Daftar skincare dan harga yang tersedia
        String[] skincareOptions = {
            "Serum Vitamin C",
            "Moisturizer",
            "Sunscreen",
            "Facial Cleanser",
            "Toner",
            "Face Mask"
        };
        double[] skincarePrices = {
            150000.00,
            120000.00,
            90000.00,
            80000.00,
            70000.00,
            50000.00
        };

        ArrayList<String> skincareList = new ArrayList<>();
        ArrayList<Double> priceList = new ArrayList<>();

        System.out.println("=== Program Pembelian Skincare ===");

        while (true) {
            // Tampilkan daftar skincare yang tersedia
            System.out.println("\nDaftar Skincare yang Tersedia:");
            for (int i = 0; i < skincareOptions.length; i++) {
                System.out.printf("%d. %s - Rp %.2f%n", i + 1, skincareOptions[i], skincarePrices[i]);
            }

            System.out.print("Masukkan nomor skincare yang ingin dibeli (1-" + skincareOptions.length + "): ");
            int pilihan = 0;
            while (true) {
                try {
                    pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan < 1 || pilihan > skincareOptions.length) {
                        System.out.print("Nomor pilihan tidak valid. Masukkan kembali: ");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Input tidak valid. Masukkan nomor skincare yang benar: ");
                }
            }

            String jenis = skincareOptions[pilihan - 1];
            double harga = skincarePrices[pilihan - 1];

            // Tambah ke list belanja
            skincareList.add(jenis);
            priceList.add(harga);

            System.out.print("Apakah Anda ingin membeli skincare lain? (y/n): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (!answer.equals("y")) {
                break;
            }
        }

        System.out.println("\n=== Daftar Belanja Skincare Anda ===");
        double totalHarga = 0;
        for (int i = 0; i < skincareList.size(); i++) {
            System.out.printf("%d. %s - Rp %.2f%n", i + 1, skincareList.get(i), priceList.get(i));
            totalHarga += priceList.get(i);
        }
        System.out.printf("Total harga semua skincare: Rp %.2f%n", totalHarga);

        scanner.close();
        System.out.println("Terima kasih telah berbelanja!");
    }
}


