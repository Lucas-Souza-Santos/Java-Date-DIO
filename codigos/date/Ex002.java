package date;

import java.util.Date;

public class Ex002 {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();
        
        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        System.out.print(novaData);
    
    }
}
