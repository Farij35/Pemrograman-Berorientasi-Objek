import java.io.*;

public class CthIOException {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        String status;

        System.out.print("Apakah anda sudah menjadi member? (Y/N) : ");
        status = scan.readLine();

        if(status.equals("Y")) {
            System.out.println("Akses diberikan");
        } else if (status.equals("N")){
            System.out.println("Maaf, akses hanya diberikan kepada member");
        } else {
            System.out.println("Input yang anda masukkan salah");
        }
    }
}
