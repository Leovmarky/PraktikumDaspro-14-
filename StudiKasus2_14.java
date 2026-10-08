import java.util.Scanner;

public class StudiKasus2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa : ");
        String StudiKasus2_14 = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim();

        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {
            // Cabang a: Perlombaan
            System.out.print("Jumlah dokumen : ");
            int dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            int peringkat = input.nextInt();

            if (dokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                        + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (peringkat >= 1 && peringkat <= 3) {
                    System.out.println("Status : Dokumen lengkap dan juara " + peringkat
                            + ". Dana penghargaan DIBERIKAN.");
                } else {
                    System.out.println("Status : Dokumen lengkap, tetapi bukan juara 1, 2, atau 3. "
                            + "Dana penghargaan tidak diberikan.");
                }
            }

        