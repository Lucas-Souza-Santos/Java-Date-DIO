package format;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex005 {
    public static void main(String[] args) {
        Date agora = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat();

        String dataFormatada = formatter.format(agora);

        System.out.println(dataFormatada);
    }
}
