import java.util.HashSet;

public class duplicate{
    public static void findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicate elements in the array: " + duplicates);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,4,4, 2, 5, 6, 3};
        findDuplicates(arr);
    }
}
