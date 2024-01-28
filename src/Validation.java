
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Validation {
    
    public static boolean isBlank(String input){
        return input.equals("");
    }
    
    public static boolean nameIsValid(String input) {
        return input.matches("[a-z,A-Z]+");
    }

    public static boolean fatherNameIsValid(String input) {
        boolean valid = false;
        for (int i = 0; i < input.length(); i++) {
            if ((input.charAt(i) >= 'a' && input.charAt(i) <= 'z') || (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z')) {
                valid = true;
            }
        }
        return valid;
    }

    public static boolean emailIsValid(String input) {
        final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(input);
        return matcher.find();
    }

    public static boolean phoneNoIsValid(String input) {
        boolean valid = false;
        if (input.matches("\\d{11}") || input.matches("\\d{8}")) {
            valid = true;
        }
        return valid;
    }

    public static boolean ageIsValid(String input) {
        if (input.matches("\\d+") && !input.equals("0"))
            return true;
        return false;
    }
    //CHECKS IF STUDENT ID IS VALID AND UNIQE
    public static boolean studentIdIsValid(String input){
        input = input.toLowerCase();
        if(input.equals("")) return false;
        boolean valid = false;
        if((input.charAt(0) >= 'a' && input.charAt(0) <= 'z') &&
           (input.charAt(1) >= 'a' && input.charAt(1) <= 'z') && input.length() == 8){
            valid = true;
            for(int i = 2; i < input.length(); i++){
                if (input.charAt(i) >= '0' && input.charAt(i) <= '9')
                    valid = true;
                else{
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }
    
    static boolean addressIsValid(String input){
        if(input.indexOf('|') == -1)
            return true;
        return false;
    }
}
