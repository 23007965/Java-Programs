package Problems;

public class Amstrong {

    public static void main(String[] args) {

        int number = 93084;
        int len = Integer.toString(number).length();

        int num, result = 0;
        int temp = number;
        while (temp > 0) {
            num = temp % 10;
            result += Math.pow(num, len);
            temp /= 10;
        }

        if (result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}
