import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class CthFileNotFoundException {
    public static void main(String[] args) {
        String namaFile = "src/file.txt";

        try {
            File fl = new File(namaFile);
            Scanner sc = new Scanner(fl);

            while(sc.hasNextLine()){
                String data = sc.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e){
            System.out.println("An Error Ocurred : " + e.getMessage());
            e.printStackTrace();
        }
    }
}
