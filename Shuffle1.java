/*
 * walk like an egiptian walk like an egiptian ...
 * 
 *@author Rolando <rgarro@gmail.com> 
 */
public class Shuffle1 {
    public static void main(String[] args){
        int x = 3;

        while(x>0){
            if(x>2){
                System.out.println("A");
            }
            if(x==2){
                System.out.println(" B C ");
            }
            if(x==1){
                System.out.println("D");
            }
            x -= 1;
        }
    }
}
