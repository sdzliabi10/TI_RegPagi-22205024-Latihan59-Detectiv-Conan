/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspart11_Latihan59_DetectivConan;

/**
 *
 * @author Administrator
 *  Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi tentang nama nama karakter dan peran di serial anime detectiv conan
 */
public class KarakterUtama extends Karakter{
     private String tujuan;
    private String tim;

    public KarakterUtama(String nama, String peran, String tujuan, String tim) {
        super(nama, peran);
        this.tujuan = tujuan;
        this.tim = tim;
    }

    public String getTujuan() {
        return tujuan;
    }

    public String getTim() {
        return tim;
    }

    public void tampilKarakterUtama() {
        System.out.println("Nama Karakter : " + getNama());
        System.out.println("Peran : " + getPeran());
        System.out.println("Tim : " + getTim());
        System.out.println("Tujuan : " + getTujuan());
        System.out.println("");
    }

}
