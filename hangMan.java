import java.util.Scanner;

public class hangMan
{
    public hangMan()
    {

    }

    public void difficultyLevel()
    {
        Scanner newScanner = new Scanner(System.in);
        System.out.println("||  0 for EASY" + "\t" + "  ||" + "\n" + "||  1 for HARD" + "\t" + "  ||" + "\n" + "||  2 for EXTREME    ||");
        System.out.print("Please choose a difficulty level: ");
        int difficultyLevel = newScanner.nextInt(); // Corrected the variable name

        System.out.println("Chosen difficulty level: " + difficultyLevel);
        
        newScanner.close();
    }

    public void startTime()
    {

    }

    public void health()
    {

    }

    public static void main(String[] args)
    {
        hangMan Game1 = new hangMan(); // Corrected the class name
        Game1.difficultyLevel();
    }
}
