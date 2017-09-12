/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructor.ArrayListExample;

import java.util.ArrayList;


public class ArrayListExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        String[] platform1 = {"PS4"};
        String[] platform2 = {"3DS", "Wii U"};
        VideoGame game1 = new VideoGame("Battlefield 1", 2001, "M", platform1);
        VideoGame game2 = new VideoGame("Pokemon Sun", 2016, "E", platform2);
        VideoGame game3 = new VideoGame("The Legend of Zelda", 2017, "E", platform2);
        
        ArrayList<VideoGame> games = new ArrayList<>();
        games.add(game1);
        games.add(game2);
        games.add(0, game3);
        
        System.out.println(games);

    }
    
}
