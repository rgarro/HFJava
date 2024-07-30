/*
 * The Hive of Hadoop will nest ...
 * 
 *@author Rolando <rgarro@gmail.com> 
 */
public class PhraseOMatic {

    public static void main(String[] args){
        
        String[] beasts = {"fungus","spider","squirrel"};
        String[] names = {"simpson","jackson","lenny"};
        String[] verbs = {"hide","know","feeling"};

        String phrase = "Mr" + names[(int)(Math.random()*names.length)]+ " ";
        phrase += verbs[(int)(Math.random()*verbs.length)] +" ";
        phrase += "the " + beasts[(int)(Math.random()*beasts.length)] +".";

        System.out.println(phrase);
    }

}
