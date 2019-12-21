package BJET;

public class vowel {

    public static void main(String[] args) {

        String str = "eaadkjfuujdkfiodke";
        int count = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(str.charAt(i) == 'A' || str.charAt(i) == 'a')
             count++;
            if(str.charAt(i) == 'E' || str.charAt(i) == 'e')
                count++;
            if(str.charAt(i) == 'I' || str.charAt(i) == 'i')
                count++;
            if(str.charAt(i) == 'O' || str.charAt(i) == 'o')
                count++;
            if(str.charAt(i) == 'U' || str.charAt(i) == 'u')
                count++;
        }

        System.out.println(count);
    }
}
