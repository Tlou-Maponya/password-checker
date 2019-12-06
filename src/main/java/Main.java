import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter name: ");
        Scanner input2 = new Scanner(System.in);
        String name = input2.nextLine();

        //input password from user
        System.out.println("Please enter your password: ");
        System.out.println("(Password should be between greater than 8 characters");
        System.out.println("and should consist of atleast 1 Special character, 1 uppercase, 1 lowercase and a number) ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();

        PasswordChecker test = new PasswordChecker();
        boolean myPass = test.isPasswordValid(password);

        System.out.println(myPass);
        //System.out.println(password);


    }
}
