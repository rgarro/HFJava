/*
 * ...
 * 
 *@author Rolando <rgarro@gmail.com> 
 */
import java.util.*;

public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        this.locationCells = loc;
    }

    public void setName(String n){
        this.name = n;
    }

    public String checkYourSelf(String userInput){
        String result = "Miss";
        int index = this.locationCells.indexOf(userInput);
        if(index>=0){
            this.locationCells.remove(index);
            if(this.locationCells.isEmpty()){
                result = "Kill";
                System.out.println("ouch! you sunk: "+this.name);
            }else{
                result = "Hit";
            }
        }
        return result;
    }

}
