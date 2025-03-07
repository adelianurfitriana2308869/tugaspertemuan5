/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodjava;
import java.util.Scanner;

public class soalTiga {
    public static void main(String[] args){
    Scanner inputObjk = new Scanner(System.in);
    System.out.print("Masukkan nilai n: ");
    int n = inputObjk.nextInt();
    hitungFaktorial(n);

    }
     public static void hitungFaktorial(int n) {
        if (n < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
            return;
        }
        int faktorial = 1;
        System.out.print(n + "!="); // Cetak format awal

        for (int i = n; i > 0; i--) {
            faktorial *= i; // Perkalian faktorial
            if (i == 1) {
                System.out.print(i); // Cetak angka terakhir tanpa "*"
            } else {
                System.out.print(i + "*");
            }
        }

        System.out.println("=" + faktorial); // Cetak hasil akhir
}


}

