package calendar;

import java.util.Calendar;

public class Ex003 {
    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();


        System.out.println("agora = \n" + agora.getTime());
        
        System.out.println("Imprimindo datas e horas");
        System.out.println("%tc \n" + agora);
        System.out.println("%tF \n" + agora);
        System.out.println("%tD \n" + agora);
        System.out.println("%tr \n" + agora);
        System.out.println("%tT \n" + agora);
    }
}
