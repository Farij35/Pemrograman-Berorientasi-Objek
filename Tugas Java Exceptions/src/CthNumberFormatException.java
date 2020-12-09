public class CthNumberFormatException {
    public static void main(String[] args) {
        try {
            String angka = "35";
            int num = Integer.parseInt(angka);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("An Error Acurred, The string cannot be parsed because it is not a number");
        }
    }
}
