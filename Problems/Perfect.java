package Problems;

public class Perfect {
	public static void main(String[] args) {
		int num=9,sum=0;
		int temp=num;
		for(int i=1;i<temp;i++)
		{
			if(temp%i==0) {
				sum=sum+i;
			}
		}
		if(sum==num) {
			System.out.println("perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}
	}

}
