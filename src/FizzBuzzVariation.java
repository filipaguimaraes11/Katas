public class FizzBuzzVariation extends FizzBuzz{


    public String playVariationGame(int num) {

        if( num % 7 == 0) {
            if ( num % 3 == 0 && num % 5 == 0){
                System.out.println("FizzBuzzPop");
                return "FizzBuzzPop";
            } else if (num % 3 == 0){
                System.out.println("FizzPop");
                return "FizzPop";
            } else if (num % 5 == 0) {
                System.out.println("BuzzPop");
                return "BuzzPop";
            } else {
                System.out.println("Pop");
                return "Pop";
            }
        } else
            super.playBasicGame(num);
        System.out.println("Your number is : "+num+" and its not even a multiple of 7");
        return "Your number is : "+num+" and its not even a multiple of 7";
    }
}
