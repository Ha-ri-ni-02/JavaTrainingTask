package Day2;

import java.util.stream.Stream;

public class Lines {
    public static void main(String[] args) {
        String text = "This is the first line.\nThis is the second line.\r\nThis is the third line.";
        Stream<String> lines = text.lines();
        lines.forEach(System.out::println);

    }

    }

