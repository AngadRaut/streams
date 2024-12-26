package exam25Dec;

// Write a java program to find the percentage of uppercase letters, lowercase letters,
// digits and other special characters(including space) in the given string. For example,
// In “Tiger Runs @ The Speed Of 100 km/hour.”,

//Number of uppercase letters is 5. So percentage is 13.16%
//Number of lowercase letters is 20. So percentage is 52.63%
//Number of digits is 3. So percentage is 7.89%
//Number of other characters is 10. So percentage is 26.32%

import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        String stringList = "Tiger Runs @ The Speed Of 100 km/hour.";
        int length = stringList.length();
        Double smallChar = 0.0;
        Double specialChar = 0.0;
        Double digit = 0.0;

        System.out.println(length);
        Double upper = 0.0 ;

        for(int i = 0 ; i < stringList.length() ;i++) {
            for (char s = 'A'; s <= 'Z'; s++) {
                if (stringList.charAt(i) == s) {
                    upper++;
                }
            }
            for (char j = 'a'; j < 'z' ;j++){
                if(stringList.charAt(i)==j){
                    smallChar++;
                }
            }
            if(stringList.charAt(i) == ' ' || stringList.charAt(i) == '@' ||stringList.charAt(i) == '/'){
                specialChar++;
            }
            for (int k = 0 ; k < 9 ;k++){
                if(stringList.charAt(i)==k){
                    digit++;
                }
            }
        }
        Double upperChars = ((upper/length)*100);
        System.out.println("capital char % = "+upperChars);
        Double smallChars = ((smallChar/length)*100);
        System.out.println("small char % = "+smallChars);

        Double special = ((specialChar/length)*100);
        System.out.println("special char % = "+special);

        Double digitPer = ((digit/length)*100);
        System.out.println("digits char % = "+digitPer);
    }
}