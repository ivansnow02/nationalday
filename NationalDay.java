import java.awt.*;
import javax.swing.*;

public class NationalDay {
    final static int month = 10;
    final static int day = 1;

    public String DaysToNationalDay(int Month, int Day) {
        int MonthSub = month - Month;
        int DaySub = day - Day;
        int sub = MonthSub * 30 + DaySub;
        if (sub < 0) {
            return "距离国庆已经过了" + (-sub) + "天了哦";
        } else
            return "还有" + sub + "天才到国庆";

    }

    public void HappyNationalDay() {
        System.out.println("国庆快乐！");
        JFrame jFrame = new JFrame("国庆快乐");
        Container container = new Container();
        JLabel jLabel = new JLabel("国庆快乐！");
        jLabel.setBounds(50,50,300,200);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(jLabel);
        container.setBackground(Color.white);
        jFrame.setVisible(true);
        jFrame.setSize(400,300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
