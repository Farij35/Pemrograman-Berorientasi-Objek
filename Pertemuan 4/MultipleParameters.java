public class MultipleParameters {
    
    static void myMethod(String fname, int height){
        System.out.println(fname + " is " + height);
    }
    
    public static void main(String[] args) {
        myMethod("Michael", 170);
        myMethod("Trevor", 178);
        myMethod("Franklin", 171);
    }

}
