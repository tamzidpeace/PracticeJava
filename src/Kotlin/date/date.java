package Kotlin.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

    public static void main(String[] args) {

        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentdate = dateFormat.format(date);

        System.out.println(currentdate);
    }
}
