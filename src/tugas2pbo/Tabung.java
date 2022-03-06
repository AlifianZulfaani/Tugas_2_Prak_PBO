/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2pbo;

/**
 *
 * @author MSI1
 */
public class Tabung extends Lingkaran implements MenghitungRuang{
    int tinggi;

    public Tabung(float jariJari, int tinggi) {
        super(jariJari);
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
        return 2*3.14*jariJari*(jariJari+tinggi);    
    }

    @Override
    public double hitungVolume() {
        return hitungLuas()*tinggi;
    }
    
    
    
    
    
    
}
