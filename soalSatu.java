/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package methodjava;

import java.util.Scanner;
public class soalSatu {
    public static void main(String[] args){
    Scanner inputObjk = new Scanner(System.in);
    System.out.print("Masukkan nilai N: ");
        int N = inputObjk.nextInt();
    
        cetakPenjumlahan(N);
        
        inputObjk.close();
    }
    
    public static void cetakPenjumlahan(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i; 
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print("+" + i);
            }
        }
     
        System.out.println("=" + sum);
    }
}
