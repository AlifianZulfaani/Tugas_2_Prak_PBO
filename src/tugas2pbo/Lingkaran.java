/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2pbo;

/**
 *
 * @author MSI1
 */
public class Lingkaran implements MenghitungBidang{
    float jariJari;

    public Lingkaran(float jariJari) {
        this.jariJari = jariJari;
    }
    
    public float getJariJari() {
        return jariJari;
    }

    public void setJariJari(float jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return 3.14*jariJari*jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2*3.14*jariJari;
    }
    
    
    
}
