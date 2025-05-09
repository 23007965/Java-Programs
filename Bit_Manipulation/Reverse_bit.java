public class Reverse_bit {
    public static void main(String[] args){
        int result=0;
        int n=10;
        for(int i=0;i<32;i++){
            int last_bit=n&1;
            if(result!=0){
                result=result<<1;
            }
            if(last_bit==1){
                result=result|1;
            }
            n=n>>1;
        }
        System.out.println(result);
    }
    
}
