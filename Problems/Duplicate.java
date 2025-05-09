package Problems;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 9, 10, 5, 5 };
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    System.out.println(nums[i] + " is Duplicate value");
                    flag = true;
                }
            }
        }
        if (flag) {
            System.out.println("Duplicate value is present");
        } else {
            System.out.println("Duplicate value is not present");
        }
    }
}
