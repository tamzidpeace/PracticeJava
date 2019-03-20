import java.util.regex.Pattern;

public class Java_Rex {


    //pattern matching api

    public static void main(String[] args) {

        boolean result = Pattern.matches(".s", "asssss");
        mPrint(result);


    }

    private static void mPrint(boolean str) {
        System.out.println(str);
    }
}
