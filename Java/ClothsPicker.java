import java.util.*;

public class OutfitPicker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user input
        System.out.print("Shirt: ");
        String shirt = scanner.nextLine().toLowerCase();

        System.out.print("Pants: ");
        String pants = scanner.nextLine().toLowerCase();

        System.out.print("Shoes: ");
        String shoes = scanner.nextLine().toLowerCase();

        System.out.print("Hat (optional, press Enter to skip): ");
        String hat = scanner.nextLine().toLowerCase();

        // Matching suggestions
        suggestOutfit(shirt, pants, shoes, hat);
    }

    private static void suggestOutfit(String shirt, String pants, String shoes, String hat) {
        Map<String, List<String>> matchMap = new HashMap<>();
        matchMap.put("black", Arrays.asList("white", "gray", "red", "blue", "beige"));
        matchMap.put("white", Arrays.asList("black", "blue", "red", "green", "gray"));
        matchMap.put("blue", Arrays.asList("white", "gray", "khaki", "black"));
        matchMap.put("gray", Arrays.asList("white", "black", "blue", "burgundy"));
        matchMap.put("red", Arrays.asList("black", "white", "gray"));
        matchMap.put("green", Arrays.asList("white", "black", "tan"));
        matchMap.put("beige", Arrays.asList("white", "brown", "black"));

        String pickedShirt = shirt.equals("not sure") ? pickColor(matchMap, pants, shoes, hat) : shirt;
        String pickedPants = pants.equals("not sure") ? pickColor(matchMap, pickedShirt, shoes, hat) : pants;
        String pickedShoes = shoes.equals("not sure") ? pickColor(matchMap, pickedShirt, pickedPants, hat) : shoes;
        String pickedHat = hat.equals("not sure") ? pickColor(matchMap, pickedShirt, pickedPants, pickedShoes) : hat;

        System.out.println("\nYour suggested outfit:");
        System.out.println("Shirt: " + pickedShirt);
        System.out.println("Pants: " + pickedPants);
        System.out.println("Shoes: " + pickedShoes);
        if (!pickedHat.isEmpty()) {
            System.out.println("Hat: " + pickedHat);
        }
    }

    private static String pickColor(Map<String, List<String>> matchMap, String... filledItems) {
        for (String item : filledItems) {
            if (matchMap.containsKey(item)) {
                List<String> matches = matchMap.get(item);
                return matches.get(new Random().nextInt(matches.size()));
            }
        }

        // If no clues, pick a random base color
        List<String> baseColors = new ArrayList<>(matchMap.keySet());
        return baseColors.get(new Random().nextInt(baseColors.size()));
    }
}
