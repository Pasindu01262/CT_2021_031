package Q_11;
import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your full name:");
        String first = s.next();
        String middle = s.next();
        String last = s.next();
        System.out.println(last+","+first+" "+ middle.charAt(0)+".");
        s.close();
    }
}

