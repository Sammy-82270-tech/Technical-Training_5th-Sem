// Program 13: Write a Java program that calculates and displays the winning percentage of a team by taking the number of wins, losses and matches drawn by the team.

// Input:
// Enter the Total Number of Games Won by the Team: 98
// Enter the Total Number of Games Lost by the Team: 55
// Enter the Total Number of Games Drawn by the Team: 5
// Output:
// Out of 158 Games Played, You have won 98 matches, lost 55 matches and drawn 5 matches.
// Your Winning Percentage is 62.03%

// Input:
// Enter the Total Number of Games Won by the Team: 20
// Enter the Total Number of Games Lost by the Team: 75
// Enter the Total Number of Games Drawn by the Team: 0
// Output:
// Out of 95 Games Played, You have won 20 matches, lost 75 matches and drawn 0 matches.
// Your Winning Percentage is 21.05%

// Input:
// Enter the Total Number of Games Won by the Team: 0
// Enter the Total Number of Games Lost by the Team: 52
// Enter the Total Number of Games Drawn by the Team: 0
// Output:
// Out of 52 Games Played, You have won 0 matches, lost 52 matches and drawn 0 matches.
// Your Winning Percentage is 0.00%

import java.util.Scanner;

public class QUEST_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Total Number of Games Won by the Team: ");
        int won = sc.nextInt();

        System.out.print("Enter the Total Number of Games Lost by the Team: ");
        int Lost = sc.nextInt();

        System.out.print("Enter the Total Number of Games Drawn by the Team: ");
        int Drawn = sc.nextInt();

        System.out.println("");

        int total_game = won + Lost + Drawn;
        System.out.println("Out of " + total_game + "Games Played, You have won "+ won+ " matches, lost "+ Lost +" matches and drawn "+ Drawn +" matches");

        float Total_wining_percentage = ((float)won/total_game)*100;

        System.out.println("Your Winning Percentage is "+ Total_wining_percentage);
    }
}
