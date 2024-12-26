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
        Double upper = 0.0 ;
        Double smallChar = 0.0;
        Double specialChar = 0.0;
        Double digit = 0.0;

        System.out.println("Total characters in string are = "+length);
        // for loop for iterating the characters in string
        for(int i = 0 ; i < stringList.length() ;i++) {
            // check for the Upper Case characters
            for (char s = 'A'; s <= 'Z'; s++) {
                if (stringList.charAt(i) == s) {
                    upper++;
                }
            }
            // Check for the Lower Case characters
            for (char j = 'a'; j < 'z' ;j++){
                if(stringList.charAt(i)==j){
                    smallChar++;
                }
            }
            // check for the special characters
            if(stringList.charAt(i)=='.'|| stringList.charAt(i) == ' ' ||stringList.charAt(i) == '@' ||stringList.charAt(i) == '/'){
                specialChar++;
            }
            // check for the digits
            if(stringList.charAt(i)=='0' || stringList.charAt(i)=='1'){
                    digit++;
            }
        }
        // printing the result
        Double upperChars = ((upper/length)*100);
        System.out.println("1.no of Upper Case characters = "+upper+" % of capital char = "+upperChars);

        Double smallChars = ((smallChar/length)*100);
        System.out.println("2.no of Small Case characters = "+upper+" % of small characters = "+smallChars);

        Double special = ((specialChar/length)*100);
        System.out.println("3.special characters in given string = "+specialChar+" % of special characters is  = "+special);

        Double digitPer = ((digit/length)*100);
        System.out.println("4.no of digit"+digit+" % of digits in given string = "+digitPer);
    }
}