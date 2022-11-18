import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javafx.util.Pair;

public class FizzBuzzPersonalized{

    //multiplication chosen by player
    //private String multipleChosenByPlayer = String.

    //words chosen by player
    //private String[] playerOptions = [multiplierOne, multiplierTwo, fizzWord, buzzWord];

    List<Pair<String, String>> rules = new ArrayList<Pair<String, String>>();

    Scanner stdin = new Scanner(System.in);

    public void starting(){
        int mult = 0;

        System.out.println("Reminder : when you press 0 it will end the game");
        while(true) {
            System.out.println("Give us the multiplier ( > 0 )");
            mult = stdin.nextInt();

            if(mult == 0) break;

            System.out.println("Which word to use");
            String word = stdin.next();

            Pair<String, String> pair = new Pair<String, String>(Integer.toString(mult), word);
            rules.add(pair);
            };



    }

    public String playPersonalizedFizzBuzz(int num){
        String result = "";

        for(Pair<String,String> pair : rules){
            int mult = Integer.parseInt(pair.getKey());
            String word = pair.getValue();

            if(num % mult == 0){
                result += word + " ";
            }

        }
        System.out.println(result);
        if( result.equals("")) return Integer.toString(num);

        return result;
    }

}
