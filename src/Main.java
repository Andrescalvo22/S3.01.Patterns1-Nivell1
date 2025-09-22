import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Undo undo = Undo.getInstance();
        boolean getOut = false;
        while (!getOut) {
            System.out.println("1, " + "Add command");
            System.out.println("2, " + "Undo command");
            System.out.println("3, " + "Show History");
            System.out.println("4, " + "Get Out");
            System.out.println("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 1) {
                System.out.println("Add yor command: ");
                String command = sc.nextLine();
                undo.addCommand(command);
            } else if (option == 2) {
                undo.undo();
            } else if (option == 3) {
                undo.showHistory();
            } else if (option == 4) {
                getOut = true;
            } else {
                System.out.println("Not a valid option!");
            }
        }
    }
}




