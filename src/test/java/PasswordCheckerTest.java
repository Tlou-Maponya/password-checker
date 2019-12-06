import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void isPasswordValid() {
        PasswordChecker input = new PasswordChecker();
        boolean isValid = input.isPasswordValid("Fakepass123@");
        assertEquals( isValid,true);
    }
}
