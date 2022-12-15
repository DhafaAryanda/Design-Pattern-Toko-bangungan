import java.util.Scanner;

public class StrategyDesignPattern {



  private static Scanner scan;

  public static void main(String[] args) {
  
    System.out.println("Halo Selamat Datang di Toko Bangunan \n Silahkan Pilih Barang Belanjaan \n 1. Semen \n 2. Paku \n 3. Cat kaleng \n");
    System.out.print("Masukan Pilihan : ");

    scan = new Scanner(System.in);
    int kategory = scan.nextInt();

    BillTokoBangunan bill = null;
    bill = new BillTokoBangunan();

    
    if (kategory == 1){
      bill.setTokoBangunan(new Semen());
    } else if (kategory == 2){
      bill.setTokoBangunan(new Paku());
    } else if (kategory == 3){
      bill.setTokoBangunan(new CatKaleng());
    } else {
      System.out.println("Pilihan Tidak Ada!!!! Silahkan Pilih Ulang");
    }

  System.out.print("Masukan Berat Barang (kg) : ");
  int weight = scan.nextInt();

  System.out.println("Belanjaan Anda Yaitu " + bill.gettTokoBangunan() + "Dengan Total Harga" + bill.getWeight(weight));

  }
  

}
