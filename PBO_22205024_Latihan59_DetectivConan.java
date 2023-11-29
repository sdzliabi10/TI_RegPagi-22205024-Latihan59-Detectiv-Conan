/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspart11_Latihan59_DetectivConan;

/**
 *
 * @author Administrator
 * Nama : Sofiullah Abi Sadzili
 * Nim  : 22205024
 * Prodi: Teknik Informatika
 * Deskripsi : program ini berisi tentang nama nama karakter dan peran di serial anime detectiv conan
 */
public class PBO_22205024_Latihan59_DetectivConan {
    public static void main(String[] args) {
        KarakterUtama conan = new KarakterUtama("Conan Edogawa/Shinichi Kudo", 
                "Detektif", "Memecahkan/Menyelesaikan Kasus ", "Detektif Cilik");
        conan.tampilKarakterUtama();
        
        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ahli Beladiri Karate", 
                "Ingin Menjadi Ahli Karate di Seluruh Jepang", "Siswi SMA dan Suka pada Shinichi Kudo");
        ran.tampilKarakterUtama();
        
        KarakterUtama kogoro = new KarakterUtama("Kogoro Mouri", "Detektif Swasta", 
                "Memecahkan/Menyelesaikan Kasus", "Detektif Swasta");
        kogoro.tampilKarakterUtama();
        
        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki", "Pengacara", 
                "Istri dari Kogoro Mouri dan Ibunya Ran");
        eri.tampilKarakterPendukung();
        
        KarakterPendukung sonoko = new KarakterPendukung("Sonoko Suzuki", 
                "Siswi SMA", "Sahabatnya Ran Mouri");
        sonoko.tampilKarakterPendukung();
        
        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori", 
                "Detektif SMA", "Temannya Conan Edogawa");
        heiji.tampilKarakterPendukung();
        
        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Tayoma", 
                "Ahli Aikido", "Temannya Ran Mouri dan Suka pada Heiji Hattori");
        kazuha.tampilKarakterPendukung();
        
        KarakterPendukung agasa = new KarakterPendukung("Hiroshi Agasa", "Profesor",
                "Memberikan bantuan kepada Conan berupa alat dalam memecahkan/menyelesaikan kasus dan kepada Detektif Cilik");
        agasa.tampilKarakterPendukung();
        
         KarakterPendukung ai = new KarakterPendukung("Ai Haibara/Shiho Miyano", "Peneliti/Detektif Cilik",
                "Memberikan bantuan kepada Conan dan salah satu Detektif Cilik");
        ai.tampilKarakterPendukung();
        
    }
}
