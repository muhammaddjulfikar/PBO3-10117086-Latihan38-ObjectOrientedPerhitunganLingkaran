/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author Lenovo NAMA : RD Muhammad Djulfikar BU
 * KELAS               : IF3 
 * NIM                 : 10117086
 * DESKRIPSI PROGRAM   : program menghitung lingkaran
 */
public class PBO310117086Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);

    }

}
