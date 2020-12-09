public class CthRuntimeException {
    public static void main(String[] args) {
        //NullPointerException

        String data = "bruh";
        try {
            if (data == null) {
                throw new NullPointerException();
            } else {
                System.out.println(data);
            }
        } catch (NullPointerException npe) {
            System.out.println("An error ocurred, data cannot be null");
        }
    }
}
