public class CthClassNotFoundException{
    public static void main(String[] args) {
        try{
            Class.forName("omegalul");
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}