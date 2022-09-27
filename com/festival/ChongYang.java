package com.festival;

import com.festival.window.WindowsC;
public class ChongYang {
    final static int month = 10;
    final static int day = 4;

    public String DaysToChongYang(int Month, int Day) {
        int MonthSub = month - Month;
        int DaySub = day - Day;
        int sub = MonthSub * 30 + DaySub;
        return "还有" + sub + "天才到重阳节";

    }

    public void HappyChongYang() {
        System.out.println("重阳节快乐！");
        WindowsC windows = new WindowsC();
        windows.chongyangwindow();
    }
}
