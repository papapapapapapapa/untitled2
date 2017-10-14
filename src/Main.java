import java.util.*;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        String str;
        char a, b;
        str = in.nextLine();
        a = in.next().charAt(0);
        b = in.next().charAt(0);
        System.out.println(str.replace(a, b));
    }
}