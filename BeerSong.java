/*
 * The Hive of Hadoop will nest ....
 * 
 *@author Rolando <rgarro@gmail.com> 
 */
public class BeerSong {
    public static void main(String[] args){
        int beerNum = 88;
        String word = "bottles";
        while(beerNum > 0){
            if(beerNum == 1){
                word = "bottle";
            }

            System.out.println(String.valueOf(beerNum) + " " + word +" of beer on the wall");
            System.out.println("Take One Down ...");
            System.out.println("Pass it Around");

            beerNum = beerNum - 1;

            if(beerNum > 0){

            }else{
                System.out.println("THE END");
            }
        }
    }
}
