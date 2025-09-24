import java.util.HashMap;
import java.util.Map;


public class Scoreboard {

    /**
     * TO-DO: Find the name of the player with the highest score.
     * If the map is empty, return null.
     \*
     * @param scores A map of player names to their scores.
     * @return The name of the player with the highest score.
     */
    public static String findTopPlayer(Map<String, Integer> scores) {
        if (scores == null || scores.isEmpty()) {
            return null;
        }

        String topPlayer = null;
        int maxScore = -1; // Assuming scores are non-negative
        for (int score: scores.values()){

            maxScore=Math.max(maxScore,score);
        }

        for (String player:scores.keySet()){

            if (scores.get(player)==maxScore){

                topPlayer=player;
            }
        }


        return topPlayer; // Placeholder
    }

    public static void main(String[] args) {

        HashMap <String,Integer> players =new HashMap<>();
        players.put("adam",1);
        players.put("nasser",2);
        players.put("abdullah",4);
        players.put("jamal",3);

        System.out.println(findTopPlayer(players));

    }

}
