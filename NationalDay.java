public class NationalDay {
    final static String name = "国庆";
    final static int month = 10;
    final static int day = 1;

    public String DaysToNationalDay(int Month, int Day) {
        int MonthSub = month - Month;
        int DaySub = day - Day;
        int sub = MonthSub * 30 + DaySub;
        if (sub < 0) {
            return "距离国庆已经过了" + Integer.toString((-sub)) + "天了哦";
        } else
            return "还有" + Integer.toString(sub) + "天才到国庆";

    }

    public void HappyNationalDay() {
        System.out.println("国庆快乐！");
    }
}
