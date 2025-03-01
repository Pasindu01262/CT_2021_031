import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        System.out.print("input word:");
        Scanner s=new Scanner(System.in);
        String word=s.nextLine();
        int middleIndex = word.length()/2;
        System.out.println(word.charAt(middleIndex));
    }
}

