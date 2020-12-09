public class CthStringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String wrd = "Nyahello";
        System.out.println(wrd);
        System.out.println("Number of index : " + wrd.length());
        try {
            System.out.println(wrd.charAt(10));
        } catch(StringIndexOutOfBoundsException e){
            System.out.println("index string error " + e);
        }
    }
}