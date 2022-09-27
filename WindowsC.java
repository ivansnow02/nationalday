import javax.swing.*;
import java.awt.*;

public class WindowsC extends JFrame {
    // 取得屏幕的宽度
    int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    // 取得屏幕的高度
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    public void chongyangwindow() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setSize(width, height);
        setResizable(false);
        getContentPane().setLayout(null);
        JPanel panel = new ImagePanel();
        panel.setBounds(0, 0, width, height);
        getContentPane().add(panel);
        setVisible(true);
    }

    class ImagePanel extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            ImageIcon icon = new ImageIcon("chongyang.gif");
            g.drawImage(icon.getImage(), 0, 0, width, height, this);
        }
    }
}