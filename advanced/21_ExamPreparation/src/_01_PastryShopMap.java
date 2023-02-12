import java.util.*;

public class _01_PastryShopMap {

    private static final int BISCUIT_VALUE = 25;
    private static final int CAKE_VALUE = 50;
    private static final int PASTRY_VALUE = 75;
    private static final int PIE_VALUE = 100;

    private static final Map<Integer, String> costToDish = new HashMap<>() {{
        put(BISCUIT_VALUE, "Biscuit");
        put(CAKE_VALUE, "Cake");
        put(PASTRY_VALUE, "Pastry");
        put(PIE_VALUE, "Pie");
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] liquidInfo = scanner.nextLine().split(" ");
        Deque<Integer> liquids = new ArrayDeque<>();
        for (String liquid : liquidInfo) {
            liquids.offer(Integer.parseInt(liquid));
        }

        String[] ingredientsInfo = scanner.nextLine().split(" ");
        Deque<Integer> ingredients = new ArrayDeque<>();
        for (String ingredient : ingredientsInfo) {
            ingredients.push(Integer.parseInt(ingredient));
        }

        Map<String, Integer> dishCount = new LinkedHashMap<>() {{
            put("Biscuit", 0);
            put("Cake", 0);
            put("Pie", 0);
            put("Pastry", 0);
        }};

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            Integer liquid = liquids.poll();
            Integer ingredient = ingredients.pop();
            int possibleDishCost = liquid + ingredient;

            String possibleDish = costToDish.get(possibleDishCost);

            if (possibleDish == null) {
                ingredients.push(ingredient + 3);
            } else {
                int newCount = dishCount.get(possibleDish) + 1;
                dishCount.put(possibleDish, newCount);
            }
        }

        boolean haveMissingDish = dishCount.containsValue(0);
        if (haveMissingDish) {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        } else {
            System.out.println("Great! You succeeded in cooking all the food!");
        }

        System.out.print("Liquids left: ");
        if (liquids.isEmpty()) {
            System.out.println("none");
        } else {
            System.out.println(liquids.toString().replaceAll("[\\[\\]]", ""));
        }

        System.out.print("Ingredients left: ");
        if (ingredients.isEmpty()) {
            System.out.println("none");
        } else {
            System.out.println(ingredients.toString().replaceAll("[\\[\\]]", ""));
        }

        dishCount.forEach((name, count) ->
            System.out.println(name + ": " + count));
    }
}