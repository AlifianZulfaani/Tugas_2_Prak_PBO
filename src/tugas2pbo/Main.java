/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2pbo;

import java.util.Scanner;

/**
 *
 * @author MSI1
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean kondisi = false;
        Scanner input = new Scanner(System.in);
        
        Balok balok = new Balok(0,0,0);
        Tabung tabung = new Tabung(0,0);
        
        while(kondisi!=true){
            System.out.println("==========");
            System.out.println("Menu Utama");
            System.out.println("==========");
            System.out.println("1. Hitung Balok");
            System.out.println("2. Hitung Tabung");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            int pilih = input.nextInt();

            switch(pilih){
                case 1:
                    System.out.print("\nInput Panjang : ");
                    balok.panjang = input.nextInt();
                    System.out.print("Input Lebar : ");
                    balok.lebar = input.nextInt();
                    System.out.print("Input Tinggi : ");
                    balok.tinggi = input.nextInt();
                    
                    Balok hitungBalok = new Balok(balok.panjang, balok.lebar, balok.tinggi);
                    
                    System.out.println("\nLuas Persegi Panjang = " + hitungBalok.hitungLuas());
                    System.out.println("Keliling Persegi Panjang = " + hitungBalok.hitungKeliling());
                    System.out.println("Volume Balok = " + hitungBalok.hitungVolume());
                    System.out.println("Luas Permukaan Balok = " + hitungBalok.hitungLuasPermukaan());
                    
                    System.out.print("\nUlangi? (Ya:1 || tidak:0)");
                    int ulangi = input.nextInt();
                    System.out.print("\n");
                    if(ulangi==1){
                        break;
                    }else if(ulangi==0){
                        kondisi=true;
                    }
                    break;
                case 2:
                    System.out.print("\nInput Jari-Jari : ");
                    tabung.jariJari = input.nextFloat();
                    System.out.print("Input Tinggi : ");
                    tabung.tinggi = input.nextInt();
                    
                    Tabung hitungTabung = new Tabung(tabung.jariJari, tabung.tinggi);
                    
                    System.out.println("\nLuas Lingkaran = " + hitungTabung.hitungLuas());
                    System.out.println("Keliling Lingkaran = " + hitungTabung.hitungKeliling());
                    System.out.println("Volume Tabung = " + hitungTabung.hitungVolume());
                    System.out.println("Luas Permukaan Tabung = " + hitungTabung.hitungLuasPermukaan());
                    
                    System.out.print("\nUlangi? (Ya:1 || tidak:0)");
                    ulangi = input.nextInt();
                    System.out.print("\n");
                    if(ulangi==1){
                        break;
                    }else if(ulangi==0){
                        kondisi=true;
                    }
                    break;
                case 3:
                    kondisi=true;
                    break;
                default:
                    System.out.println("\nOpsi tidak ada, mohon masukkan opsi dengan benar!");
                    System.out.print("\n");
            }
        }
        
        
        
    }
    
}
