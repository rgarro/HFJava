/*
 * Jill fired Jira ...
 * 
 *@author Rolando <rgarro@gmail.com> 
 */
public class ClockTestDrive {
    public static void main(String[] args){
        Clock c = new Clock();
        c.setTime("12345");
        String tod = c.getTime();
        System.out.println(tod);
    }
}
