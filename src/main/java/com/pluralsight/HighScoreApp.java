package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HighScoreApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a score in the following format:\n" +
                "(Home:Visitor|21:9)");
        String score = input.nextLine();

        String[] parts = score.split(Pattern.quote("|"));

        String[] teams =  parts[0].split(":");
        String firstTeam = teams[0];
        String secondTeam = teams[1];

        String[] scores = parts[1].split(":");
        int firstTeamScore = Integer.parseInt(scores[0]);
        int secondTeamScore = Integer.parseInt(scores[1]);

        if (firstTeamScore > secondTeamScore) {
            System.out.println("Winner: " + firstTeam);
        }else if (firstTeamScore < secondTeamScore) {
            System.out.println("Winner: " + secondTeam);
        }else{
            System.out.println("No winner");
        }


    }
}
