package Hash_map;
import java.util.*;

public class Longest_substring {
	public static void main(String[] args) {
		String input = "pwwkew";
		int max = 0;
		int left = 0;
		HashMap<Character, Integer> position = new HashMap<>();

		for (int right = 0; right < input.length(); right++) {
			char current = input.charAt(right);
			if (!position.containsKey(current)) {
				position.put(current, right);
			} else {
				left = Math.max(left, position.get(current) + 1);
				position.put(current, right);
			}
			max = Math.max(max, (right - left) + 1);
		}
		System.out.println(max);

	}
}
