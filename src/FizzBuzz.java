import org.w3c.dom.ls.LSOutput;

public class FizzBuzz {

    public String playBasicGame(int num ) {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }
        else if (num % 3 == 0) {
            System.out.println("Fizz");
            return "Fizz";
        }
        else if (num % 5 == 0) {
            System.out.println("Buzz");
            return "Buzz";
        }
        System.out.println("Your number is : "+num+" and its not a multiple of 3 or 5");
        return "Your number is : "+num+" and its not a multiple of 3 or 5";
    }

}
