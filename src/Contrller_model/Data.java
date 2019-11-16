/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contrller_model;

/**
 *
 * @author Stefanus Alvian Setiono
 */
public class Data {
    private int nyawa;
    private int skor;
    private int level;
    protected String nama;
    
    // encapsul
    
     public Data() {
        this.level = 1;
        this.nyawa = 3;
        this.skor = 0;
    }

    public Data(String nama) {
        this.nama = nama;
        this.level = 1;
        this.nyawa = 3;
        this.skor = 0;
    }

    public int getNyawa() {
        return nyawa;
    }

    public void setNyawa(int nyawa) {
        this.nyawa = nyawa;
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
    
}
