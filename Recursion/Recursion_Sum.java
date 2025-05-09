package Recursion;
public class Recursion_Sum {
    public static void main(String[] args){
        int result=Sum(5);
        System.out.println(result);
    };
    public static int Sum(int number){
        if(number<1){
            return number;
        }
        return number+Sum(number-1);
    }
}
