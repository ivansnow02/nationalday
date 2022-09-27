import java.awt.*;
import javax.swing.*;
public class WindowsN extends JFrame {
    // 取得屏幕的宽度
    int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    // 取得屏幕的高度
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public void windowsframe() {
        JLabel JL=new JLabel();
        this.setLayout(null);// 设置标题
        this.setTitle("国庆");// 设置窗体大小
        this.setSize(width, height);// 设置窗体出现位置
        this.setLocation(0, 0);
        this.getContentPane().setBackground(Color.red);
        JL.setForeground(Color.yellow);
        JL.setFont(new Font("微软雅黑",Font.BOLD+ Font.ITALIC,50));//设置字体
        JL.setText("国庆快乐！！");
        JL.setBounds(width/2-150,height/2-200,400,300);
        this.add(JL);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 将窗体显示出来
        this.setVisible(true);
    }
}