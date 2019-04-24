package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> nameMovie = new ArrayList<>();
        Scanner movie = new Scanner(System.in);

        String userAnswer ="";
        while (!userAnswer.equalsIgnoreCase("Q")) {
            System.out.println("Add movie: ");
            String movies = movie.nextLine();
            nameMovie.add(movies);

            System.out.println("Add more movie (y/n): ");
            userAnswer= movie.nextLine();
            if (userAnswer.equalsIgnoreCase("N")){
                break;
            }
        }



            Collections.sort(nameMovie);

            for (int i =0; i<nameMovie.size();i++)

                System.out.println(nameMovie.get(i));


            Random myMovie = new Random();
            String seeMovie = nameMovie.get(myMovie.nextInt(nameMovie.size()));
            System.out.println("Suggest movie tonight: "+seeMovie);



        }

    }

