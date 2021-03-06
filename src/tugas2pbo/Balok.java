/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2pbo;

/**
 *
 * @author MSI1
 */
public class Balok extends PersegiPanjang implements MenghitungRuang {
    int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        return 2*(panjang*lebar + lebar*tinggi + panjang*tinggi);
    }

    @Override
    public double hitungVolume() {
        return hitungLuas()*tinggi;
    }
    
    
    
    
    
    
}
