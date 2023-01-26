import java.util.Random;
import java.util.Scanner;

public class MainGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.printf("Choose an object:[r]ock, [p]aper or [s]cissors %n");
        String option = scanner.nextLine();

        if (option.equals("s")) {
            System.out.printf("You chose: scissors%n");
        } else if (option.equals("p")) {
            System.out.printf("You chose: paper%n");
        } else if (option.equals("r")) {
            System.out.printf("You chose: rock%n");
        } else {
            System.out.println("Invalid input. Try again!");
            return;
        }
        String[] gameOptions = {"rock", "paper", "scissors"};
        int chooseRandomIndex = random.nextInt(gameOptions.length);
        String randomOption = gameOptions[chooseRandomIndex];

        System.out.println("Your opponent chose: " + randomOption);

        if (option.equals("s") && chooseRandomIndex == 0) {
            System.out.println("You lose! The rock breaks the scissors!");
        } else if (option.equals("p") && chooseRandomIndex == 0) {
            System.out.println("You win! The paper covers the rock!");
        } else if (option.equals("r") && chooseRandomIndex == 0) {
            System.out.println("The game is draw. No winner!");
        } else if (option.equals("s") && chooseRandomIndex == 1) {
            System.out.println("You win! The scissors cut the paper!");
        } else if (option.equals("p") && chooseRandomIndex == 1) {
            System.out.println("The game is draw. No winner!");
        } else if (option.equals("r") && chooseRandomIndex == 1) {
            System.out.println("You lose! The paper covers the rock!");
        } else if (option.equals("s") && chooseRandomIndex == 2) {
            System.out.println("The game is draw. No winner!");
        } else if (option.equals("p") && chooseRandomIndex == 2) {
            System.out.println("You lose! The paper is cut by the scissors!");
        } else if (option.equals("r") && chooseRandomIndex == 2) {
            System.out.println("You win! The rock breaks the scissors!");
        }
    }
}