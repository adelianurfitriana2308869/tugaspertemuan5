/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodjava;
import java.util.Scanner;

public class soalDua {
    public static void main(String[] args){
    Scanner inputObjk = new Scanner(System.in);
    System.out.print("Masukkan nilai batas awal: ");
    int batasAwal = inputObjk.nextInt();
    System.out.print("Masukkan nilai batas akhir: ");
    int batasAkhir = inputObjk.nextInt();
    
    bilanganGanjil(batasAwal, batasAkhir);
    
    }
    
    public static void bilanganGanjil(int awal, int akhir) {
        int count = 0;

        System.out.print("Bilangan ganjil: ");
        for (int i = awal; i <= akhir; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nJumlah bilangan ganjil: " + count);
    }
}
