package latest;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * [4:06 PM] Reddeppa K
 *
 * This exercise is based on the card game of Blackjack (aka 21).
 *
 * A player receives a number of playing cards (their "hand") and collects them to achieve the highest score without exceeding 21 points.
 *
 * There are 13 distinct cards, numbered cards (1-10) and picture cards, Jack (J), Queen (Q), and King (K).
 *
 * The number cards have their value displayed on their face and are valued 2 to 10 points.
 *
 * The Ace (A) card has the value 1 point, but in this game can also be worth 11 points.
 *
 * The picture cards (J, Q, K) are worth 10 points.
 *
 *
 *
 * The score for a given hand is the sum of the value of all the cards, bearing in mind that an Ace can be counted as either 1 point or 11 points. Any score greater than 21 points is "bust" and the player loses.
 *
 * Write a function that accepts an arbitrary list of cards and either returns the sum of their values or returns -1 if the sum exceeds 21.
 */
public class LatestClass {

    //
    //10,K => 20
    //3,10,K => -1
    //3,A,K => 14
    //5,A,A => 17


    public static void main(String[] args) {

        ArrayList<String> input = new ArrayList<>();
        input.add("A");
        input.add("3");
        input.add("5");

        HashMap<String,Integer> inputMap = new HashMap<>();

        for(String str: input){

            if(inputMap.keySet().contains(str)){
                 inputMap.put(str,inputMap.get(str)+1);
            }else {
                inputMap.put(str,1);
            }
        }

        LatestClass latestClass = new LatestClass();
        int sum = latestClass.getSum(inputMap);

        System.out.println(String.format("Sum of the cards is %d", sum));
    }


    public int getSum(HashMap<String,Integer> inputMap){

        int target = 21;
        int sum =0;

        for(Map.Entry entry: inputMap.entrySet()){
            int value =0;

            for(int i = 0; i< inputMap.get(entry.getKey()); i++) {
                if (entry.getKey().equals("J") || entry.getKey().equals("Q") || entry.getKey().equals("K")) {
                    value = 10;
                } else if (!entry.getKey().equals("A")) {
                    value = Integer.parseInt(entry.getKey().toString());
                } else {

                    if (sum + 11 > 21) {
                        value = 1;
                    } else {
                        value = 11;
                    }

                }
            }
                sum = sum + value;
        }

        return  sum> 21 ? -1: sum;

    }
}
