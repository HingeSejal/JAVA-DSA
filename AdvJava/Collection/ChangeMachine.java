package AdvJava.Collection;

import java.util.*;

public class ChangeMachine {

    public static void main(String[] args) {

        int paid = 500;
        int total = 383;

        int change = paid - total;
        System.out.println("Change: " + change);

        // Denomination → count available
        Map<Integer, Integer> notes = new HashMap<>();
        notes.put(100, 2);
        notes.put(50, 1);
        notes.put(20, 3);
        notes.put(10, 5);
        notes.put(5, 2);
        notes.put(2, 10);
        notes.put(1, 50);

        // Sort denominations in descending order
        List<Integer> denoms = new ArrayList<>(notes.keySet());
        Collections.sort(denoms, Collections.reverseOrder());

        Map<Integer, Integer> result = new LinkedHashMap<>();

        for (int d : denoms) {

            if (change <= 0) break;

            int available = notes.get(d);
            int needed = change / d;

            int used = Math.min(available, needed);

            if (used > 0) {
                result.put(d, used);
                change -= used * d;
            }
        }

        if (change != 0) {
            System.out.println("Cannot give exact change!");
        } else {
            System.out.println("Give change as:");
            for (Map.Entry<Integer, Integer> e : result.entrySet()) {
                System.out.println(e.getKey() + " → " + e.getValue());
            }
        }
    }
}