import java.util.Date;

import com.festival.*;

public class Action {
    

    public static void main(String[] args) throws InterruptedException {
        NationalDay nationalday = new NationalDay();
        ChongYang chongyang = new ChongYang();
        Date date = new Date();
        int month = Integer.parseInt(String.format("%tm", date));// 读取当前月份并转换成int类型
        int day = Integer.parseInt(String.format("%td", date));// 读取当前日期并转换成int类型
        int year = Integer.parseInt(String.format("%ty", date));// 读取当前年份并转换成int类型
        System.out.println("请稍等");
        Thread.sleep(1000);
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            Thread.sleep(100);
        }
        System.out.println();
        // 加载界面
        if (month < 10 || month == 10 && day <= 1) {
            if (month == 10 && day == 1)
                nationalday.HappyNationalDay();// 如果今天是国庆，则启动弹窗
            else
                System.out.println(nationalday.DaysToNationalDay(month, day));// 如果不是，输出据国庆还有几天
        } else if (month == 10 && day <= ChongYang.LunarYearDay[year - 22]) {
            if (day == ChongYang.LunarYearDay[year - 22])
                chongyang.HappyChongYang();// 如果今天是重阳，则启动弹窗
            else
                System.out.println(chongyang.DaysToChongYang(month, day));// 如果不是，输出据重阳还有几天
        } else
            System.out.println("节日已经过去了");
    }
}
