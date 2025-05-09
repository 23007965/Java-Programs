public class Complement {
    public static void main(String[] args){
        int input = 10;
        int mask = 0;
        int complement = ~input;
        while(mask<input){
            mask = mask<<1 |1;
        }
        complement = complement & mask;
        System.out.println(complement);
    }
}
