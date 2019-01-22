/*
Create an application which will prompt the user to enter the name of their favorite Movie.
Add the Movie to an array list.  Use a loop to continue adding movies to the array until the user presses q or Q.

Once the user presses Q then print the list of movies before exiting the program.

BONUS: Print out the list of movies sorted in alphabetical order.

BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class moviesArrayLists {
    public static void main(String[]args){
        // Prompt the user to enter the name of their favorite movie
        // Continue asking and adding until user types "q"
        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> movies = new ArrayList<>();
        String temp = "";

        do {
            System.out.println("What is your favorite movie? Press Q to quit.");
            temp = keyboard.nextLine();
            if(!temp.equalsIgnoreCase("q")){
                movies.add(temp);
            }

        }
        while(!temp.equalsIgnoreCase("q"));

        // Once user types "q", remove "q" from the list
        // and print the list of movies
        movies.remove(movies.)
        System.out.println("List of movies: ");
        for(int i=0; i<movies.size(); i++){
            System.out.println(movies.get(i));
        }

        // BONUS:
        // Sort movie list in alphabetical order
        // Remember to import Collections Library
        Collections.sort(movies);

        // Print after sort
        System.out.println("List of movies in alphabetical order: ");
        int index = 0;
        while(movies.size()>index){
            System.out.println(movies.get(index));
            index++;
        }

        // BONUS x2:
        Random rnd = new Random(movies.size());
        int x = rnd.nextInt(movies.size());
        System.out.println("Here is a movie suggestion for tonight! ");
        System.out.println(movies.get(x));

        // Exit
        keyboard.close();
        System.exit(0);



    }
}
