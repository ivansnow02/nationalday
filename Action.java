import java.util.Date;


public class Action {
    public static void main(String[] args) throws InterruptedException {
        NationalDay nationalday = new NationalDay();
        Date date = new Date();
        int month = Integer.parseInt(String.format("%tm", date));
        int day = Integer.parseInt(String.format("%td", date));
        System.out.println("请稍等");
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            System.out.printf("*");
            Thread.sleep(500);
        }
        System.out.println("");
        if (month == 10 && day == 1) {
            nationalday.HappyNationalDay();
        }
        else
            System.out.println(nationalday.DaysToNationalDay(month, day));
            
    }
}
