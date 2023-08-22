import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int totalTime = 0;
        int pancakesMade;
        int[] pancakesEaten = new int[3];
        int[] usersRequests = new int[3];

        Random random = new Random();

        while (totalTime < 3600) { // Simulate for 1 hour (3600 seconds)
            int startTime = totalTime;
            int endTime = totalTime + 30;

            pancakesMade = Math.min(random.nextInt(13), 12); // Generate pancakes made by shopkeeper

            for (int i = 0; i < 3; i++) {
                usersRequests[i] = random.nextInt(6); // Generate user requests (0-5 pancakes)
                usersRequests[i] = Math.min(usersRequests[i], 5); // Cap at 5 pancakes per user
                pancakesEaten[i] += usersRequests[i]; // Track total eaten by user i
            }

            int totalPancakesEaten = usersRequests[0] + usersRequests[1] + usersRequests[2];
            boolean metNeeds = totalPancakesEaten <= pancakesMade;

            int wastedPancakes = metNeeds ? (pancakesMade - totalPancakesEaten) : pancakesMade;

            System.out.println("Time Slot: " + startTime + "s - " + endTime + "s");
            System.out.println("Pancakes made by shopkeeper: " + pancakesMade);
            System.out.println("Pancakes eaten by User 1: " + usersRequests[0]);
            System.out.println("Pancakes eaten by User 2: " + usersRequests[1]);
            System.out.println("Pancakes eaten by User 3: " + usersRequests[2]);
            System.out.println("Shopkeeper met users' needs: " + metNeeds);
            System.out.println("Wasted pancakes: " + wastedPancakes);
            if (!metNeeds) {
                int unmetOrders = totalPancakesEaten - pancakesMade;
                System.out.println("Unmet pancake orders: " + unmetOrders);
            }
            System.out.println("------------------------------------");

            totalTime += 30; // Move to the next time slot
        }
    }
}