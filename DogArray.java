/*
 * 
 * 
 *@author Rolando <rgarro@gmail.com> 
 */
public class DogArray {
    public static void main(String[] args){
        Dog[] pets;
        pets = new Dog[3];
        pets[0] = new Dog();
        pets[1] = new Dog();
        pets[2] = new Dog();

        pets[0].name = "blacky";
        pets[0].breed = "doberman";
        pets[0].size = 1;

        pets[1].name = "toti";
        pets[1].breed = "doberman";
        pets[1].size = 1;

        pets[2].name = "piti";
        pets[2].breed = "doberman";
        pets[2].size = 1;

        pets[0].bark();
        pets[1].bark();
        pets[2].bark();
     }
}
