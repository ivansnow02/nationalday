package com.festival;

import com.festival.window.WindowsN;


public class NationalDay {
    final static int month = 10;
    final static int day = 1;

    public String DaysToNationalDay(int Month, int Day) {
        int MonthSub = month - Month;
        int DaySub = day - Day;
        int sub = MonthSub * 30 + DaySub;
        return "还有" + sub + "天才到国庆";
    }

    public void HappyNationalDay() {
        System.out.println("国庆快乐！");
        WindowsN windows = new WindowsN();
        windows.nationaldaywindow();
    }
}
