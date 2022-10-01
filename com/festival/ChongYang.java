package com.festival;

import java.util.Date;
import com.festival.window.WindowsC;

public class ChongYang {
    final static int month = 10;
    public final static int[] LunarYearDay = new int[] { 4, 23, 11, 29, 18, 8, 26, 16, 5, 24 };// 未来10年的重阳节的日期

    public String DaysToChongYang(int Month, int Day) {// 返回距重阳节还有几天
        Date date = new Date();
        int year = Integer.parseInt(String.format("%ty", date));// 读取当前年份并转换成int类型
        int MonthSub = month - Month;
        int DaySub = LunarYearDay[year-22] - Day;
        int sub = MonthSub * 30 + DaySub;
        return "还有" + sub + "天才到重阳节";

    }

    public void HappyChongYang() {// 如果是重阳节，则启动弹窗
        System.out.println("重阳节快乐！");
        WindowsC windows = new WindowsC();
        windows.chongyangwindow();
    }
}
