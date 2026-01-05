package Final_Dsa_Prep_For_OA;

import java.util.*;

// This class represents ONE monster as a single unit.
// Why this exists:
// Power and Bonus always belong together.
// Keeping them together prevents logical mistakes during sorting.
class Monster {
    int power;   // Minimum experience required to defeat this monster
    int bonus;   // Experience gained after defeating it

    public Monster(int power, int bonus) {
        this.power = power;
        this.bonus = bonus;
    }
}

public class RPG {
    public static void main(String[] args) {

        // Scanner is used to read input from standard input (keyboard / judge input)
        Scanner sc = new Scanner(System.in);

        // -------- SAFETY CHECK (DEFENSIVE CODING) --------
        // Before reading input, we verify that an integer actually exists.
        // This prevents runtime crashes if input is missing or malformed.
        // This line is NOT part of the algorithm logic.
        if (!sc.hasNextInt()) return;

        // -------- INPUT READING --------

        // Number of monsters
        int n = sc.nextInt();

        // Initial experience points of the player
        int experience = sc.nextInt();

        // Read required power for each monster
        // Why separate array?
        // Because the input format gives all powers first.
        int[] powers = new int[n];
        for (int i = 0; i < n; i++) {
            powers[i] = sc.nextInt();
        }

        // Read bonus for each monster
        // Again, input format forces this separation.
        int[] bonuses = new int[n];
        for (int i = 0; i < n; i++) {
            bonuses[i] = sc.nextInt();
        }

        // -------- DATA STRUCTURING --------

        // Convert raw input arrays into Final_Dsa_Prep_For_OA.Monster objects
        // Logical reason:
        // We want each monster to be treated as a single entity
        // so that power and bonus never get mismatched.
        List<Monster> monsters = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            monsters.add(new Monster(powers[i], bonuses[i]));
        }

        // -------- CORE ALGORITHM (GREEDY STRATEGY) --------

        // Sort monsters by increasing required power
        // LOGIC:
        // Always fight the weakest monster first to grow experience safely.
        // TECHNICAL:
        // Custom comparator sorts Final_Dsa_Prep_For_OA.Monster objects based on power.
        Collections.sort(monsters, (a, b) -> a.power - b.power);

        // -------- GAME SIMULATION --------

        int count = 0; // Number of monsters defeated successfully

        // We now simulate fighting monsters in the chosen (sorted) order
        for (Monster m : monsters) {

            // Check if current experience is enough to fight this monster
            if (experience >= m.power) {

                // WIN CONDITION:
                // We defeat the monster safely
                // Experience increases by its bonus
                experience = experience + m.bonus;

                // Increase defeated monster count
                count++;

            } else {
                // LOSE CONDITION:
                // Since monsters are sorted by power,
                // all remaining monsters require MORE experience.
                // Therefore, continuing is impossible.
                break;
            }
        }

        // -------- OUTPUT --------
        // Print the maximum number of monsters that can be defeated
        System.out.println(count);
    }
}
