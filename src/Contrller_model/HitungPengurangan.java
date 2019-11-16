/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contrller_model;

/**
 *
 * @author Christoporus Chiesa Yuarsa
 */

//inheritance
public class HitungPengurangan extends HitungPenjumlahan{
    //overriding
    @Override
     public int hitung(int a, int b){
        return a-b;
    }
}
