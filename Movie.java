/*
 * ....
 * 
 *@author Rolando <rgarro@gmail.com> 
 */
public class Movie {
    String title;
    String genre;
    int rating;

    void playNow(){
        System.out.println("Playing: " + this.title +" Genre:"+this.genre+" Rating: "+Integer.toString(this.rating));
    }
}
