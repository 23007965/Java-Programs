package Problems;

public class Increase {
	public static void main(String[] args) {
		int[] arr= {1,5,9,21,63};
		for(int i=0;i<4;i++) {
			if(arr[i]<arr[i+1]) {
				System.out.println("increasing");
				continue;
			}
			else {
				System.out.println("not increasing");
				
			}
		}
	}
}