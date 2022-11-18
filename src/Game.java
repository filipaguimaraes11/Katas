import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        FizzBuzzVariation fizzbuzz = new FizzBuzzVariation();

        //As a games designer I want a normal number to return that number So that the game can be scored according to the rules (1, 2, 4)
        fizzbuzz.playBasicGame(1);
        fizzbuzz.playBasicGame(2);
        fizzbuzz.playBasicGame(4);

        //As a games designer I want a multiple of three to return 'fizz' So that the game can be scored according to the rules (3, 9, 123)
        fizzbuzz.playBasicGame(3);
        fizzbuzz.playBasicGame(9);
        fizzbuzz.playBasicGame(123);

        //As a games designer I want a multiple of five to return 'buzz' So that the game can be scored according to the rules (5, 20, 200)
        fizzbuzz.playBasicGame(5);
        fizzbuzz.playBasicGame(20);
        fizzbuzz.playBasicGame(200);

        //As a games designer I want a multiple of three and five to return 'fizz buzz' So that the game can be scored according to the rules (15, 45, 315)
        fizzbuzz.playBasicGame(15);
        fizzbuzz.playBasicGame(45);
        fizzbuzz.playBasicGame(315);

        // As a games designer I want a multiple of seven to return 'pop' So that the game can be scored according to the rules (7, 28, 77)
        System.out.println("---- VARIATION tests ----");
        fizzbuzz.playVariationGame(3);
        fizzbuzz.playVariationGame(5);
        fizzbuzz.playVariationGame(7);
        fizzbuzz.playVariationGame(28);
        fizzbuzz.playVariationGame(77);
        fizzbuzz.playVariationGame(1);

        // As a games designer I want a multiple of three and seven to return 'fizz pop' So that the game can be scored according to the rules (21, 63, 126)
        fizzbuzz.playVariationGame(21);
        fizzbuzz.playVariationGame(63);
        fizzbuzz.playVariationGame(126);

        //As a games designer I want a multiple of five and seven to return 'buzz pop' So that the game can be scored according to the rules (35, 70, 140)
        fizzbuzz.playVariationGame(35);
        fizzbuzz.playVariationGame(70);
        fizzbuzz.playVariationGame(140);

        //As a games designer I want a multiple of three, five and seven to return 'fizz buzz pop' So that the game can be scored according to the rules (105, 210, 315)
        fizzbuzz.playVariationGame(105);
        fizzbuzz.playVariationGame(210);
        fizzbuzz.playVariationGame(315);

        //As a player I want to be able to choose my own substitutions So that I can tailor the game to my preferences (1, 2, 8)

        //As a player I want my substitutions to work the same way as Fizz Buzz So that the essence of the game remains the same (4, 9, 12)

        List<Pair<String, String>> rules = new ArrayList<Pair<String, String>>();

        System.out.println("Which game would you like to play?");
        System.out.println("1. Fizz Buzz\n2. Fizz Buzz Pop\n3. Personalized");
        Scanner stdin = new Scanner(System.in);
        int gameAnswer = stdin.nextInt();
        System.out.println(gameAnswer);

        int num = 0;


        switch(gameAnswer){
            case 1 :
                System.out.println("What will be the number");
                num = stdin.nextInt();
                fizzbuzz.playBasicGame(num);
                break;
            case 2 :
                System.out.println("What will be the number");
                num = stdin.nextInt();
                fizzbuzz.playVariationGame(num);
                break;
            case 3 :
                break;
        }

        System.out.println("Give us the multiplier");
        int mult = stdin.nextInt();
        System.out.println(mult);
        System.out.println("Which word to use");
        String word = stdin.next();
        System.out.println(word);

        Pair<String, String> pair = new Pair<String, String>(Integer.toString(mult), word);

        rules.add(pair);



    }

}
