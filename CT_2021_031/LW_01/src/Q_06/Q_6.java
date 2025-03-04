package Q_06;
import javax.swing.*;
import java.util.Scanner;

public class Q_6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.print("Enter width:");
        int width =s.nextInt();

        System.out.print("Enter height:");
        int height =s.nextInt();

        s.nextLine();

        System.out.print("Enter title:");
        String title =s.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

