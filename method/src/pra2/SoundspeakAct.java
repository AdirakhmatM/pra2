package pra2;

public class SoundspeakAct {
    public static void main(String[] args) {
        Soundspeak s1 = new Soundspeak();
        s1.Merk="Max Bass";
        s1.Harga= 700;
        s1.Jumlah= 2;
        
        s1.listensound();
        System.out.println("| Bayar = "+s1.Hitunghasil());
        System.out.println("+------------------");
        s1.Hitungharga();
        
        Soundspeak s2 = new Soundspeak();
        s2.listensound();
        
        Soundspeak s3 = new Soundspeak("Blaster X",1200,1);
        s3.listensound();
    }
}
