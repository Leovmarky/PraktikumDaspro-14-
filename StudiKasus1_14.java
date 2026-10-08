import java.util.Scanner;

public class StudiKasus1_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan jumlah uang yang dibayarkan");
        uangBayar = sc.nextInt();

        