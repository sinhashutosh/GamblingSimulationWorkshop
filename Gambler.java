package org.workshop;

public class Gambler {
    int everyDayStake = 100;
    int betEveryGame = 1;

    void playGame() {
        System.out.println("Welcome To Gambler Simulator...\n");
        System.out.println("Your Everyday Total Stake..." + everyDayStake);
        System.out.println("Your Every Bet game cost = " + betEveryGame);
    }
}
