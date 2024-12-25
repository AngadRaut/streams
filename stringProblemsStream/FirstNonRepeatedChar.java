package stringProblemsStream;

// 7. Given a String, find the first non-repeated character in it using Stream functions?

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        String input2 = input.toLowerCase();
        for(int i = 0 ; i < input2.length() - 1 ; i++){
            for (int j = i+1 ; j < input2.length() ; j++){
                String s1 = String.valueOf(input2.charAt(i));
                String s2 = String.valueOf(input2.charAt(j));
                if(!s1.equals(s2)){

                }
            }
        }
    }
}
