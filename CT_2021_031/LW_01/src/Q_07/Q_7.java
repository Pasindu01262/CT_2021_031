package Q_07;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_7 {
    public static void main(String[] args) {
        String time = new SimpleDateFormat("hh:mm:ss a").format(new Date());

        JFrame frame = new JFrame(time);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}


