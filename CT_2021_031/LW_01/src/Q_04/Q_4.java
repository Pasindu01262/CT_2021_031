import java.text.SimpleDateFormat;
import java.util.*;

public class Q_4 {
    public static void main(String[] args) {
        Date D = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(sdf.format(D));
    }
}

