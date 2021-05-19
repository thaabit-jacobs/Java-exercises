import java.util.Scanner;

public class grid {

    public static boolean inRange(int userInput){
        return userInput > -6 && userInput < 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        System.out.println();

        int start = scanner.nextInt();
        int end = start + 41;

        if (inRange(start)){
            String formatInfo = "%3.2s";
            String output = "";

            int colPos = 0;

            for( ;start<=end; start++){
                if (colPos == 7){
                    colPos = 0;
                    System.out.println();
                }

                colPos++;
                System.out.format(formatInfo,start);
            }
            return;
        }

        System.out.println(start + " not in range\n");

        main(args);
    }
}


