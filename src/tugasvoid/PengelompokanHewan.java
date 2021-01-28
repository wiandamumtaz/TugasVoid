
package tugasvoid;

import java.util.Scanner;

public class PengelompokanHewan {
    int pilihan;
    boolean Jumlahkaki,bergerak;

    void bergerak() {
        Scanner input = new Scanner (System.in);
        System.out.println("Pilihan");
        System.out.println("1.Menggunakan kaki");
        System.out.println("2.Menggunakan Sayap");
        System.out.print("Masukkan Nomor Pilihan : ");
        pilihan = input.nextInt();
        if (pilihan==1)
            System.out.println("Contohnya : Sapi,Kucing, dan Anjing");
        else if (pilihan==2)
            System.out.println("Contohnya : Burung dan Kupu-Kupu");
        else 
            System.out.println("Tidak dalam pilihan");
        
    }

    void jumlahkaki() {
        Scanner input = new Scanner (System.in);
        System.out.println("Pilihan :");
        System.out.println("1.Kaki dua");
        System.out.println("2.Kaki empat");
        System.out.print("Masukkan Pilihan :");
        pilihan = input.nextInt();
        if (pilihan==1)
            System.out.println("Contohnya : Burung,Ayam, dan Bebek");
        else if (pilihan==2)
            System.out.println("Contohnya :Sapi,Harimau, dan Kuda");
        
    
}
}
