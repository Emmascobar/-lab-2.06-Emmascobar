

//EJERCICIO UNO
public class Main
{
    public static int positiveMultiplier(int input){
        if(input < 0){
            throw new IllegalArgumentException("input number must be positive");
        }

        return input * input;
    }

}
//EJERCICIO 2
enum SubscriptionType {
    GOLD,
    SILVER,
    FREE,
    BANNED
}


//EJERCICIO 3
public class Player {
    private String name;
    private String email;
    private int points;
    private SubscriptionType subscriptionType;

    public Player(String name, String email, int points, SubscriptionType subscriptionType) {
        this.name = name;
        this.email = email;
        this.points = points;
        this.subscriptionType = subscriptionType;
    }

    public void applyReward(int reward) {
        switch (subscriptionType) {
            case GOLD:
                this.points+=reward*3;
                break;
            case SILVER:
                this.points+=reward*2;
                break;
            case FREE:
                this.points+=reward;
                break;
            default:
                break;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionType subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

}

//EJERCICIO 4
import java.util.*;

class Solution {
    public static List<String> wordTransformation(List<String> wordList, int n) {
        boolean removeFirst = true;
        for(int j=0; j<n; j++) {
            for (int i=0; i< wordList.size(); i++) {
                String word = wordList.get(i);
                if (removeFirst && word.length() > 1) {
                    String newWord = word.substring(1, word.length());
                    wordList.set(i, newWord);
                } else if (!removeFirst && word.length() > 1){
                    String newWord = word.substring(0, word.length()-1);
                    wordList.set(i, newWord);
                }
            }
            removeFirst = !removeFirst;
        }

        return wordList;
    }
}


//EJERCICIO 5
import java.util.HashMap;
        import java.util.Map;
class Solution {
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap();
        for (String s:strings) {
            // plan for stored boolean:
            //   false = seen it once
            //   true = seen it twice or more
            if (!map.containsKey(s)) {
                map.put(s, false);
            }
            else if (map.get(s) == false) {  // works without this test
                map.put(s, true);
            }
        }
        return map;
    }
}

class Main {
    public static String rps(String p1, String p2) {
        if(p1 == p2) return "Draw!";
        String rock = "rock";
        String paper = "paper";
        String scissors = "scissors";

        boolean rs = p1 == rock && p2 == scissors;
        boolean pr = p1 == paper && p2 == rock;
        boolean tp = p1 == scissors && p2 == paper;

        if (rs || pr || tp) return "Player 1 won!";
        else return "Player 2 won!";

    }
}