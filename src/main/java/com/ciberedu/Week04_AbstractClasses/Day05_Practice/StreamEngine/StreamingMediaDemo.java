package com.ciberedu.Week04_AbstractClasses.Day05_Practice.StreamEngine;

public class StreamingMediaDemo {
    public static void main(String[] args) {
        User user1 = new User("Gadel", true, "US");
        User user2 = new User("Jose", false, "PE");
        User user3 = new User("Maria", true, "PE");

        StreamingMedia movie = new Movie("The Matrix", 50000);

        StreamingMedia livesport = new LiveSport("World Cup Final");

        System.out.println("======== MOVIE ========");
        System.out.println("User1: ");
        movie.play(user1);
        System.out.println("================");
        System.out.println("User2: ");
        movie.play(user2);
        System.out.println("================");
        System.out.println("User3: ");
        movie.play(user3);
        System.out.println("================");

        System.out.println("======== LIVE SPORT ========");
        System.out.println("User1: ");
        livesport.play(user1);
        System.out.println("================");
        System.out.println("User2: ");
        livesport.play(user2);
        System.out.println("================");
        System.out.println("User3: ");
        livesport.play(user3);
        System.out.println("================");

    }
}
