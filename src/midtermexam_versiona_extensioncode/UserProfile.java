/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * The user profile for the OnlineVids system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796 midterm exam.
 * Students are reminded to add themselves as modifiers when editing the
 * code.
 * @author dancye, 2019
 * @author Jeffrey Pincombe
 *
 */
public class UserProfile 
{
    
    private static String userID;//the userID
    private static String genre;// the user's preferred genre of movie
    private static String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
    
    /**
     * A constructor that takes in the userID and the favourite genre
     * @param givenID the ID to assign to this user
     * @param givenGenre the users favourite genre
     */
    public UserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * A getter for the userID
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * A getter for the genre
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    public class TestUserprofile{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter user ID:");
            UserProfile userprofile = new UserProfile(userID, genre);
            userprofile.userID = input.next();
           // UserProfile genres = new UserProfile(genre, genre);
            
            //Scanner choose = new Scanner(System.in);
            //genres.genre = choose.next();
            
            
            //ArrayList<String> genres = new ArrayList<String>();
            System.out.println(genres);
            System.out.println("User ID is: " + input.next());
            //System.out.println("Chosen genre is: " + choose.next());
            //System.out.println("Choose a genre: " + g);

            genre = userprofile.genres[0];
            for (int i=0; i< genres.length; i++){
                String g = genres[i];
                System.out.println("Choose a genre with 1,2,3,or 4: " + g);

            if (input.next() == "1"){
                System.out.println(input.next() + " has chosen " + genres[0] + "User profile has been created");

            }
            else if (input.next() == "2"){
                System.out.println(input.next() + " has chosen " + genres[1] + "User profile has been created");
            }
            else if (input.next() == "3") {
                System.out.println(input.next() + " has chosen " + genres[2] + "User profile has been created");
            }
            else if (input.next() == "4") {
                System.out.println(input.next() + " has chosen " + genres[3] + "User profile has been created");
            }
            else { System.out.println("Thats not an option");}
            }
                    
        }
    }
    public class JeffreyPincombe{
    //created a new class
        //another comment
    }
    }
