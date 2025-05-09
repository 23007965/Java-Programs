public class Count_bit {
    public static void main(String[] args) {
        // int input=11;
        // int count=0;
        // String value = Integer.toBinaryString(input);
        // for(int i=0;i<value.length();i++){
        // if(value.charAt(i)=='1'){
        // count++;
        // }
        // }
        // System.out.println(count);
        int input = 10;
        int mask = 1;
        int counter = 0;
        for (int i = 0; i < 32; i++) {
            if ((input & mask) != 0) {
                counter++;
            }
            mask = mask << 1;
        }
        System.out.println(counter);

    }
}
