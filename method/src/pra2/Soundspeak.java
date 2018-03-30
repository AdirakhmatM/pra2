package pra2;

public class Soundspeak {
   String Merk;
   double Harga;
   double Jumlah;
   
   void listensound(){
       System.out.println("+------------------");
       System.out.println("| Merk = "+Merk);
       System.out.println("| Harga = "+Harga);
       System.out.println("| Jumlah = "+Jumlah);
       System.out.println("+------------------");
   }
   double Hitunghasil(){
       double Hasil;
       Hasil= Harga*Jumlah;
       return Hasil;
   }
   
   
   
}
