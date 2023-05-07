package Day2;

public class Leadvstrail {
    public static void main(String[] args) {
        String str = "    hello, world!    ";

        String strippedLeading = str.stripLeading();
        String strippedTrailing = str.stripTrailing();

        System.out.println(strippedLeading); // "hello, world!    "
        System.out.println(strippedTrailing); // "    hello, world!"

    }
}
