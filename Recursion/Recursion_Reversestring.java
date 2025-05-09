package Recursion;
public class Recursion_Reversestring {
    public static void main(String[] args){
        String input = "four";
        System.out.println(Reverse(input));
    }

    public static String Reverse(String input){
        if(input.isEmpty()){
            return input;
        }
        return Reverse(input.substring(1))+input.charAt(0);
    }
}
