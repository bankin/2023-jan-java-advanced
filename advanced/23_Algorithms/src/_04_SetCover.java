import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class _04_SetCover {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] elements = reader.readLine().substring(10).split(", ");
        int[] universe = new int[elements.length];
        for (int i = 0; i < elements.length; i++) {
            universe[i] = Integer.parseInt(elements[i]);
        }

        int numberOfSets = Integer.parseInt(reader.readLine().substring(16));
        List<int[]> sets = new ArrayList<>();
        for (int i = 0; i < numberOfSets; i++) {
            String[] setElements = reader.readLine().split(", ");
            int[] set = new int[setElements.length];
            for (int j = 0; j < setElements.length; j++) {
                set[j] = Integer.parseInt(setElements[j]);
            }
            sets.add(set);
        }
        List<int[]> chosenSets = chooseSets(sets, universe);

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Sets to take (%d):%n", chosenSets.size()));
        for (int[] set : chosenSets) {
            sb.append("{ ");
            sb.append(Arrays.toString(set).replaceAll("\\[|]", ""));
            sb.append(" }").append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    public static List<int[]> chooseSets(List<int[]> sets, int[] universe) {
        List<int[]> result = new ArrayList<>();
        List<int[]> initialSets = new ArrayList<>(sets);
        int[] originalValues = Arrays.copyOf(universe, universe.length);

        while (originalValues.length > 0 && initialSets.size() > 0) {
            int maxIntersectionSize = 0;
            int maxSetIndex = -1;
            for (int i = 0; i < initialSets.size(); i++) {
                int currentIntersectionSize =
                    getIntersectionSize(initialSets.get(i), originalValues);

                if (currentIntersectionSize > maxIntersectionSize) {
                    maxIntersectionSize = currentIntersectionSize;
                    maxSetIndex = i;
                }
            }

            int[] selected = initialSets.get(maxSetIndex);
            initialSets.remove(selected);

            originalValues = removeValues(originalValues, selected);

            result.add(selected);
        }

        return result;
    }

    private static int[] removeValues(int[] arr, int[] toRemove) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < toRemove.length; j++) {
                if (arr[i] == toRemove[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.add(arr[i]);
            }
        }

        return result.stream().mapToInt(a -> a).toArray();
    }

    private static int getIntersectionSize(int[] arr1, int[] arr2) {
        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}
