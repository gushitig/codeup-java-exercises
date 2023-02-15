package movies;

import util.Input;

import java.util.Arrays;
import java.util.Objects;

public class MoviesApplication {

    private static Movie [] movies;
    //just declaration here, not initialized yet

    private static Input input;

    public static Movie[] getMovies() {
        return movies;
    }

    private static void printMenu () {
        System.out.printf("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a movie\n" +
                "\n" +
                "Enter your choice: ");

    }


    public static void main(String[] args) {
        //grab all the movies from the array
        //initializing the variable here, but could have been right under the declaration, can do it either way
        movies = MoviesArray.findAll();
        //System.out.println(Arrays.toString(movies));
        input = new Input();


        //keep main as simple as possible by hiding the details in other functions
        //also keep functions simple and easy to read


        while(true) {

            printMenu();

            int selection = input.getInt(0, 6);

            if (selection == 0) {
                System.out.println("Program exited.");
                break;
            } else {
                chooseOption(selection);
            }

        }

    }

    private static void chooseOption(int selection) {
        if (selection == 1) {
            printAll();
        }
        if (selection == 2) {
            byCat("animated");
        }
        if (selection == 3) {
            byCat("drama");
        }
        if (selection == 4) {
            byCat("horror");
        }
        if (selection == 5) {
            byCat("scifi");
        }
        if (selection == 6) {
            addMovie();
        }
    }

    public static void addMovie() {
        input = new Input();
        String movieName = input.getString("Enter movie name: ");

        String movieCat = input.getString("Enter movie category: ");

        Movie movie = new Movie(movieName, movieCat);
        movies = Arrays.copyOf(movies, movies.length +1);
        movies[movies.length - 1]  = movie;
    }

    public static void printAll() {
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i]);
        }
        System.out.println();
    }

    public static void byCat (String cat) {

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getCategory().equals(cat)) {
                System.out.print(movies[i]);
            }
        }
        System.out.println();
    }





}
