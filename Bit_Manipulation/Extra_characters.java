public class Extra_characters {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "heello";
        char result = 0;
        String concat = str1 + str2;
        char[] chars = concat.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result = (char) (result ^ chars[i]);
        }
        System.out.println("odd one out : " + result);
    }
}
