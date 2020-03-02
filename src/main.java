import java.io.BufferedReader;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please include your input file name(test file included");
            //return;
        }

        Navigation nav = new Navigation("test.txt");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int userChoice = 0;

        while (userChoice != 5) {
            SystemMenu();

            try {
                userChoice = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.out.println("Path Selection (1-5)");
                continue;
            }

            if (userChoice < 1 || userChoice > 5) {
                System.out.println("Path Selection (1-5)");
                continue;
            }
            switch (userChoice) {
                case 1:
                    nav.relativePath(Distance.EUCLIDEAN, false);
                    break;
                case 2:
                    nav.relativePath(Distance.MANHATTAN, false);
                    break;
                case 3:
                    nav.relativePath(Distance.EUCLIDEAN, true);
                    break;
                case 4:
                    nav.relativePath(Distance.MANHATTAN, true);
                    break;
                default:
                    break;
            }
        }
    }

    public static void SystemMenu() {
        System.out.print("\n 1. Euclidean Distance \n " +
                "2. Manhattan Distance \n " +
                "3. Euclidean Distance w/ Path Cost \n " +
                "4. Manhattan Distance w/ Path Cost " + "\n " +
                "5. Exit \n Enter your choice (1-5): ");
    }
}
