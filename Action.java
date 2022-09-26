import java.util.Date;


public class Action {
    public static void main(String[] args) throws InterruptedException {
        NationalDay nationalday = new NationalDay();
        Date date = new Date();
        int month = Integer.parseInt(String.format("%tm", date));//读取当前月份并转换成int类型
        int day = Integer.parseInt(String.format("%td", date));//读取当前日期并转换成int类型

        System.out.println("请稍等");
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            System.out.printf("*");
            Thread.sleep(500);
        }
        System.out.println("");
        //加载界面

        if (month == 10 && day == 1) {
            nationalday.HappyNationalDay();//如果今天是国庆，则启动
        }
        else
            System.out.println(nationalday.DaysToNationalDay(month, day));//输出据国庆还有几天
            
    }
}
