import java.util.HashMap;
import java.util.Map;
public class Word {


    class Solution {
        public static Map<String, Boolean> wordMultiple(String[] strings) {

            String[] string = new String[]{"a", "b", "a", "c", "b"};

            Map<String, String> nums = new HashMap<>();
            nums.put(string[0], string[1]);
            nums.put(string[1], string[2]);
            nums.put(string[3], string[1]);
            nums.put(string[5], string[5]);

            for (String num : nums.keySet()) {
                boolean result;
                if (nums.keySet() == nums) {
                    result = true;
                } else {
                    result = false;
                }
                return Map<"result", result> ;
            }
        }
    }


    public static String rps(String p1, String p2) {

        if (p1 == "scissors") {
            p2 = "";
            switch (p2) {
                case "Rock":
                    System.out.println("Player 2 WIN");
                    ;
                    break;
                case "paper":
                    System.out.println("Player 1 WIN");
                    ;
                    break;
                case "scissors":
                    System.out.println("DRAW");
                    ;
                    break;
            }
        }
        if (p1 == "rock") {
            p2 = "";
            switch (p2) {
                case "scissor":
                    System.out.println("Player 1 WIN");
                    ;
                    break;
                case "paper":
                    System.out.println("Player 2 WIN");
                    ;
                    break;
                case "rock":
                    System.out.println("DRAW");
                    ;
                    break;
            }

            if (p1 == "paper") {
                p2 = "";
                switch (p2) {
                    case "rock":
                        System.out.println("Player 1 WIN");
                        ;
                        break;
                    case "scissors":
                        System.out.println("Player 2 WIN");
                        ;
                        break;
                    case "paper":
                        System.out.println("DRAW");
                        ;
                        break;
                }
            }
        }
    }