import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("input string value:");
        String I=sc.nextLine();
        String[] parts=I.split("!");
        System.out.println(parts[0].trim());
        System.out.println(parts[1].trim());
    }
}





