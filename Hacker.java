package Rapid;
import java.util.*;

public class Hacker {

    private static String getHackerSpeaker(String name){
        String HackerSpeaker="";

        String[] splitArr = name.split("");

        for (String letter: splitArr) {
            switch (letter) {
                case "a":
                       HackerSpeaker +=4;
                    break;
                case "e":
                         HackerSpeaker +=3;
                    break;
                case "i":
                         HackerSpeaker+=1;
                    break;

                case "o":
                        HackerSpeaker+=0;
                    break;

                case "s":
                        HackerSpeaker+=5;
                    break;  
                default:
                         HackerSpeaker +=letter; 
            }
        }
        return HackerSpeaker;

    }
    public static void main(String[] args) {
        String name="javascript is cool";
        System.out.println(getHackerSpeaker(name));
       
    }
}
