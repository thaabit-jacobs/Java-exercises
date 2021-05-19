import java.util.Scanner;

public class Column {

    public static boolean inRange(int userInput){
        return userInput > -6 && userInput < 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        System.out.println();

        int userInput = scanner.nextInt();

        if (inRange(userInput)){
            String formatInfo = "%2.2s";
            String output = "";

            for (int i = userInput; i < 41+userInput; i+=7) {
                System.out.format(formatInfo,i);
                System.out.println();
            }

            return;
        }

        System.out.println(userInput + " not in range\n");

        main(args);
    }
}
