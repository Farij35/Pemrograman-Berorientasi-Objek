import java.util.*;

public class FungsiHitungGambar {

    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("Panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("Lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);

        System.out.println("luas = " + luas(inputPanjang,inputLebar));
        System.out.println("Keliling = " + keliling(inputPanjang,inputLebar));

        tampilkanKelilingDanLuas(inputPanjang, inputLebar);
    }

    private static void tampilkanKelilingDanLuas(int panjang, int lebar){
        System.out.println("luas = " + luas(panjang,lebar));
        System.out.println("Keliling = " + keliling(panjang,lebar));
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }
    public static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
