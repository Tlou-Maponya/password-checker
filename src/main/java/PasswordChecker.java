
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker{

    public static int counter = 6;

    public  boolean isPasswordValid(String password){

        if(password.length() > 8 && password != null)
        {
            /* Pattern Class
                compiles the given regex and returns the instance of the Pattern.
            */
            Pattern lowerCase = Pattern.compile("[a-z]");                           //  a through z or A through Z, inclusive (range)
            Pattern upperCase = Pattern.compile("[A-Z]");
            Pattern digit = Pattern.compile("[0-9]");                                   //  Any digits, short of [0-9]  alternative ("/d")
            Pattern specialChar = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");     //

            /* Matcher Class
               creates a matcher that matches the given input with the pattern.
            */
            Matcher lowerExists = lowerCase.matcher(password);
            Matcher upperExists = upperCase.matcher(password);
            Matcher digitExists = digit.matcher(password);
            Matcher specialCharExists = specialChar.matcher(password);

            // if statement not working as should

            // Program not displaying relevant error message
            if(!lowerExists.find()){
                System.out.println("Password should have at least one lowercase letter");
                counter--;
            }

             if(!upperExists.find()){
                System.out.println("Password should have at least one uppercase letter");
                counter--;
            }

             if(!digitExists.find()){
                System.out.println("Password should at least have one digit");
                counter--;
            }

             if(!specialCharExists.find()){
                System.out.println("Password should have at least one special character");
                counter--;
            }

            return lowerExists.find() && upperExists.find() && digitExists.find() && specialCharExists.find();

        }
        else {
            System.out.println("Password should be longer than than 8 characters");
            return false;
        }

    }

    public void passwordIsOk(){
        if(counter >= 3) {
            System.out.println("Password is okay");
        }
    }

}