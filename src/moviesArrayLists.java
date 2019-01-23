/*
Create an application which will prompt the user to enter the name of their favorite Movie.
Add the Movie to an array list.  Use a loop to continue adding movies to the array until the user presses q or Q.

Once the user presses Q then print the list of movies before exiting the program.

BONUS: Print out the list of movies sorted in alphabetical order.

BONUS x2: Suggest a movie to the user to watch by randomly selecting a movie from the list of movies entered.*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;

public class moviesArrayLists {
    public static void main(String[]args){

        // Prompt the user to enter the name of their favorite movie
        // Continue asking and adding until user types "q"
        ArrayList<String> movies = new ArrayList<>();
        String userInput = "";
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("What is your favorite movie? Press Q to quit.");
            userInput = keyboard.nextLine();

            // For each userInput, capitalize first letter and lowercase the rest:
            // Step 1. Split each userInput by a single space
            String [] movieTitle = userInput.split(" ");
            String revisedTitle = "";
            for(int i=0; i<movieTitle.length; i++){
                // Step 2. Capitalize the first letter using Substring method
                // Step 3. Lowercase the rest of the word using Substring method
                movieTitle[i] = movieTitle[i].substring(0,1).toUpperCase() + movieTitle[i].substring(1).toLowerCase();
                // Step 4. Lastly, concatenate the whole title back together
                revisedTitle += movieTitle[i] + " ";
            }

            // Add the movie to the list unless userInput was "q"
            if(!userInput.equalsIgnoreCase("q")){
                movies.add(revisedTitle);
            }
        }
        while(!userInput.equalsIgnoreCase("q"));


        // Once user types "q", print the list of movies
        System.out.println("\nList of movies: ");
        for(int i=0; i<movies.size(); i++){
            System.out.println(movies.get(i));
        }


        // BONUS:
        // Sort movie list in alphabetical order
        // Remember to import Collections Library
        Collections.sort(movies);


        // Print after sort
        System.out.println("\nList of movies in alphabetical order: ");
        int index = 0;
        while(movies.size()>index){
            System.out.println(movies.get(index));
            index++;
        }


        // BONUS x2:
        Random rnd = new Random(movies.size());
        int x = rnd.nextInt(movies.size());
        System.out.println("\nHere is a movie suggestion for tonight!");
        System.out.println(movies.get(x));


        // Exit
        keyboard.close();
        System.exit(0);

    }
}
