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
        System.out.println("" + num);
        return ""+num;
    }

}
