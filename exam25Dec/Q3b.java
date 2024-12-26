package exam25Dec;

// using the Character class methods 
public class Q3b {
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
            // check for digits
            if(Character.isDigit(stringList.charAt(i))){
                digit++;
            }
            // check for lowerCase characters
            if(Character.isLowerCase(stringList.charAt(i))){
                smallChar++;
            }
            // check for UpperCase characters
            if(Character.isUpperCase(stringList.charAt(i))){
                upper++;
            }
            // check for special chars
            if(!Character.isLetterOrDigit(stringList.charAt(i))){
                specialChar++;
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
