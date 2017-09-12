/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataStructor.ArrayListExample;


public class VideoGame {

    private  String title;
    private  int year;
    private  String rating;
    private  String[] platforms;

    public VideoGame() {
    }
    
    public VideoGame(String title, int year, String rating, 
            String[] platforms) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.platforms = platforms;
    }
    
    
    public  String getTitle() {
        return title;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public  int getYear() {
        return year;
    }

    public  void setYear(int year) {
        this.year = year;
    }

    public  String getRating() {
        return rating;
    }

    public  void setRating(String rating) {
        this.rating = rating;
    }

    public  String[] getPlatforms() {
        return platforms;
    }

    public  void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }
    @Override
    public String toString()
    {
        String result = "";
        result += "\nTitle: "+ getTitle() + "\nYear: "+getYear()+
                "\nRating: "+getRating()+"\nPlatforms: ";
        for (String platform : getPlatforms()) {
            result += platform + "  ";
        }
        return result;
    }

}
