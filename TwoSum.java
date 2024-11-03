package Code360;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Pair<U, V> {
    public final U first;
    public final V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}

public class TwoSum {
    public static ArrayList<Pair<Integer, Integer>> twoSum(ArrayList<Integer> arr, int target, int n) {
        ArrayList<Pair<Integer, Integer>> result = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Populate the frequency map
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the array to find pairs
        for (int num : arr) {
            int complement = target - num;
            if (frequencyMap.getOrDefault(complement, 0) > 0) {
                if (complement == num) {
                    if (frequencyMap.get(num) > 1) {
                        result.add(new Pair<>(num, num));
                        frequencyMap.put(num, frequencyMap.get(num) - 2);
                    }
                } else {
                    if (frequencyMap.get(num) > 0 && frequencyMap.get(complement) > 0) {
                        result.add(new Pair<>(num, complement));
                        frequencyMap.put(num, frequencyMap.get(num) - 1);
                        frequencyMap.put(complement, frequencyMap.get(complement) - 1);
                    }
                }
            }
        }

        // If no valid pairs exist, return [[-1, -1]]
        if (result.isEmpty()) {
            result.add(new Pair<>(-1, -1));
        }

        return result;
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(2);
        arr1.add(7);
        arr1.add(11);
        arr1.add(13);
        int target1 = 9;
        ArrayList<Pair<Integer, Integer>> result1 = twoSum(arr1, target1, arr1.size());
        for (Pair<Integer, Integer> pair : result1) {
            System.out.println(pair);
        }

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(-1);
        arr2.add(-1);
        arr2.add(2);
        arr2.add(2);
        int target2 = 1;
        ArrayList<Pair<Integer, Integer>> result2 = twoSum(arr2, target2, arr2.size());
        for (Pair<Integer, Integer> pair : result2) {
            System.out.println(pair);
        }
    }
}
