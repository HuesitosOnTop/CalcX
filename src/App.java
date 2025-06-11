// Importing External Pacakages
import java.util.Scanner;

// Importing Pacakages
import Libraries.*; // Random Cool Things
// import Functions.*; // Calculations

public class App {
    public static void main(String[] args) throws Exception {
        // Objects
        Banner banner_maker = new Banner(); banner_maker.createBanner();
        QOL qol = new QOL();
        Scanner input = new Scanner(System.in);

        // Arrays
        String[] ansi_colors = {
            "\u001B[30m", // Black                 0
            "\u001B[31m", // Red                   1 
            "\u001B[32m", // Green                 2
            "\u001B[33m", // Yellow                3
            "\u001B[34m", // Blue                  4
            "\u001B[35m", // Magenta               5
            "\u001B[36m", // Cyan                  6
            "\u001B[37m", // White                 7
            "\u001B[90m", // Bright Black (Gray)   8
            "\u001B[91m", // Bright Red            9
            "\u001B[92m", // Bright Green         10
            "\u001B[93m", // Bright Yellow        11
            "\u001B[94m", // Bright Blue          12
            "\u001B[95m", // Bright Magenta       13
            "\u001B[96m", // Bright Cyan          14
            "\u001B[97m", // Bright White         15
            "\u001B[0m"   // Reset                16
            };
        String[] choices_array = {
            "Chemistry",
            "Computer Science",
            "General Math"
        };
        String[] settings_choices = {
            "cc - Changes the color of all normal text in the calculator (0-15, 16 - DEFAULT)"
        };

        // Data Types
        
        System.out.println(ansi_colors[3] + "\n\nChoose the calculator page you'd like to use:"); // Change everything to yellow

        for (int i = 0; i < choices_array.length; i++) {
            System.out.println((i + 1)  + ". " + choices_array[i]);
        }
        System.out.println(ansi_colors[16]); // Reset the Colors

        while (true) { // Loop for calculator starts
            qol.fPrint();
            String calculator_choice = input.nextLine();

            switch (calculator_choice) {
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "root\\settings":
                    System.out.println("Here is a list of commands you can use");
                    
                    for (int i = 0; i < settings_choices.length; i++) {
                        System.out.println((i+1) + settings_choices[i]);
                    }
                    
                default:
                    System.out.println("The choice you've entered is not one of the choices above, please try again");
            }
        }
    }
}
