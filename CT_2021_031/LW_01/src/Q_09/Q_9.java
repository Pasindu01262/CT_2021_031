import java.util.Scanner;

public class Q_9{
    public static void main(String[] args) {
        System.out.print("input number or text:");
        Scanner s=new Scanner(System.in);
        String i=s.nextLine();

        System.out.println(i.length());
        System.out.println(i.charAt(0));
        System.out.println(i.charAt(i.length()-1));
    }
}

