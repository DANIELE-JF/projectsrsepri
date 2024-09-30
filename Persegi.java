import java.util.*;

public class Persegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int luas = random.nextInt(10000) + 1;
        int sisiBenar = (int) Math.sqrt(luas);

        System.out.println("Game Tebak Sisi Persegi");
        System.out.println("Tebak panjang sisi persegi jika luasnya adalah: " + luas);
        
        int tebakan = -1;
        int percobaan = 0;

        while (tebakan != sisiBenar) {
            System.out.print("Masukkan tebakanmu: ");
            tebakan = input.nextInt();
            percobaan++;

            if (tebakan > sisiBenar) {
                System.out.println("Tebakanmu terlalu besar!");
            } else if (tebakan < sisiBenar) {
                System.out.println("Tebakanmu terlalu kecil!");
            } else {
                System.out.println("Selamat! Tebakanmu benar. Panjang sisi adalah: " + sisiBenar);
                System.out.println("Kamu berhasil dalam " + percobaan + " percobaan.");
            }
        }

        input.close();
    }
}
