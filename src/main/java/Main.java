import java.util.Scanner;

public class Main {
    public static void main(String[] args) { ;

        //input password from user
        Scanner input = new Scanner(System.in);
        PasswordChecker test = new PasswordChecker();
        String password = "";

        System.out.println("Please enter your password: ");
        System.out.println("(Password should be between greater than 8 characters");
        System.out.println("and should consist of at least 1 Special character, 1 uppercase, 1 lowercase and a number) \n");

        do {
        password = input.nextLine();
    }
    while (!test.isPasswordValid(password));
        System.out.println(test.isPasswordValid(password));

    }
}
