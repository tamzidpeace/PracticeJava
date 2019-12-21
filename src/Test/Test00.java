package Test;

import java.util.Arrays;

public class Test00 {
    public static String main(int[] T) {

        int len = T.length;
        int avgLen = len / 4;

        int[] win = new int[avgLen];
        int[] sp = new int[avgLen];
        int[] summ = new int[avgLen];
        int[] aut = new int[avgLen];

        for (int i = 0; i < avgLen; i++) {
            win[i] = T[i];
            sp[i] = T[i + avgLen];
            summ[i] = T[2 * avgLen + i];
            aut[i] = T[3 * avgLen + i];
        }

        Arrays.sort(win);
        int winDif = win[avgLen - 1] - win[0];
        Arrays.sort(sp);
        int spDif = sp[avgLen - 1] - sp[0];
        Arrays.sort(summ);
        int summDif = summ[avgLen - 1] - summ[0];
        Arrays.sort(aut);
        int autDif = aut[avgLen - 1] - aut[0];

        System.out.println(autDif);

        int[] senArray = {winDif, spDif, summDif, autDif};
        Arrays.sort(senArray);
        int res = senArray[3];

        if (res == winDif)
            return "WINTER";
        else if (res == spDif)
            return "SPRING";
        else if (res == summDif)
            return "SUMMER";
        else
            return "AUTUMN";


    }


}
