import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void isPasswordValid() {

        //Testing multiple conditions
        PasswordChecker input = new PasswordChecker();
        boolean isValid = input.isPasswordValid("#$%#$%#RTERT34534534wer");
        assert(isValid);

        boolean isValid2 = input.passwordIsOk("Tlou42423@@#");
        assert(isValid2);

        boolean isValid3 = input.passwordIsOk("tLOUuuuu^^^^66666");
        assert(isValid3);

        boolean isValid4 = input.passwordIsOk("5555%%%rtYY555555555");
        assert(isValid4);

        boolean isValid5 = input.passwordIsOk("$$9331Tlou5");
        assert(isValid5);

        boolean isValid6 = input.passwordIsOk("*Tlou               34534*");
        assert(isValid6);
    }

    @Test
    void passwordIsOk() {
        //Testing multiple conditions
        PasswordChecker input = new PasswordChecker();
        boolean isValid = input.passwordIsOk("Tlou234234");
        assert(isValid);

        boolean isValid2 = input.passwordIsOk("2342423@#$@#$@#");
        assert(isValid2);

        boolean isValid3 = input.passwordIsOk("TLOUUUUUU");
        assert(isValid3);

        boolean isValid4 = input.passwordIsOk("5555555555555555");
        assert(isValid4);

        boolean isValid5 = input.passwordIsOk("Tlou9331115");
        assert(isValid5);

        boolean isValid6 = input.passwordIsOk("*               *");
        assert(isValid6);
    }


}
