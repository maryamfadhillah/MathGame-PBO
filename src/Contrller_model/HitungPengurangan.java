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
