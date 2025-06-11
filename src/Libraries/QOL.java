package Libraries;

public class QOL {
    private String[] ansi_colors = {
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


    public void fPrint() { // Formated Print
        String PreInput = ansi_colors[16] + ansi_colors[15] + "[$" + ansi_colors[12] + "CALCXUSER" + ansi_colors[15] + "]" + ansi_colors[10] + "!:" + ansi_colors[3] + "~ " + ansi_colors[16];

        System.out.print(PreInput);
    }
}
