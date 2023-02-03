import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        StringReverser reverser = new StringReverser() {


            @Override
            public String reverse(String str) {
                String[] array = str.split("");
                String out = "";
                for (int i = array.length - 1; i >= 0; i-- ) {
                    out += array[i];

                }
                return out;
            }
        };
        System.out.println(reverser.reverse(line));
    }
}