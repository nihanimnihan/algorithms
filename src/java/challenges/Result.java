package java.challenges;


import java.util.*;

public class Result {

    public static void main(String[] args) {
        int exp = 4;
        int[][] arr = new int[][]{{0,1,2},{0,2,2},{1,2,5},{1,2,7}};
        System.out.println(numberOfTokens(exp,new ArrayList<>()));
    }
    public static int numberOfTokens(int expiryLimit, List<List<Integer>> commands) {

        Map<Integer, Integer> map = new HashMap<>();

        commands.forEach(command -> {
            if (command.get(0) == 1) {
                if (map.containsKey(command.get(1))) {
                    if (command.get(2) > map.get(command.get(1))) {
                        map.remove(command.get(1));
                    }
                    map.put(command.get(1), command.get(2) + expiryLimit);
                }
            } else {
                map.put(command.get(1), command.get(2) + expiryLimit);
            }
            map.keySet().removeIf(id -> command.get(2) > map.get(id));
        });
        return map.size();

    }
}