package pra2;

public class Soundspeak {
   String Merk;
   double Harga;
   double Jumlah;

    public Soundspeak() {
        Merk="Logitech";
        Harga=500;
        Jumlah=3;
    }

    public Soundspeak(String Merk, double Harga, double Jumlah) {
        this.Merk = Merk;
        this.Harga = Harga;
        this.Jumlah = Jumlah;
    }
    
   
   
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
   void Hitungharga(){
       System.out.println("Harganya adalah :"+Hitunghasil());
       
   }
     
   
}
