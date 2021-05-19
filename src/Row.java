import java.util.Scanner;

public class Row {

    public static boolean inRange(int userInput){
        return userInput > -6 && userInput < 93;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        System.out.println();

        int userInput = scanner.nextInt();

        if (inRange(userInput)){
            String output = "";
            for (int i = 0; i < 7; i++){
                output += userInput + i + " ";
            }

            System.out.println(output.substring(0, output.length() -1));

            return;
        }

        System.out.println(userInput + " not in range\n");

        main(args);
    }
}
