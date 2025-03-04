package Q_02;
import javax.swing.*;
import java.util.*;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName;
        String lastName;
        System.out.print("Enter your first name: ");
        firstName = scanner.next();
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        JFrame frame = new JFrame();
        frame.setSize(300,200);
        frame.setVisible(true);
        System.out.print(firstName+" "+lastName);
        frame.setTitle(firstName+" "+lastName);
    }
}
