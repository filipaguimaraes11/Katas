import java.util.List;
import javafx.util.Pair;

public class FizzBuzzPersonalized{

    public List<Pair<String, String>> data;

    public FizzBuzzPersonalized(List<Pair<String, String>> arr, int num){
        this.data = arr;
    }
    //multiplication chosen by player
    //private String multipleChosenByPlayer = String.

    //words chosen by player
    //private String[] playerOptions = [multiplierOne, multiplierTwo, fizzWord, buzzWord];

    public String playPersonalizedFizzBuzz(int num){
        String result = "";

        for(Pair<String,String> pair : data){
            int mult = Integer.parseInt(pair.getKey());
            String word = pair.getValue();

            if(num % mult == 0){
                result += word + " ";
            }

        }

        if( result.equals("")) return Integer.toString(num);

        return result;
    }

}
