import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.lang.reflect.Method;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PracticeProblemTest {

    // ─────────────────────────────────────────────
    // getFirstName() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("getFirstName: Returns first name from a two-name string")
    void getFirstNameTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getFirstName", cArg);
            assertEquals("John", (String) method.invoke(null, "John Doe"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getFirstName: Returns first name from a three-name string")
    void getFirstNameTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getFirstName", cArg);
            assertEquals("Mary", (String) method.invoke(null, "Mary Jane Watson"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getFirstName: Returns first name when name has leading spaces")
    void getFirstNameTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getFirstName", cArg);
            assertEquals("Alice", (String) method.invoke(null, "  Alice Smith"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getFirstName: Returns first name with different casing intact")
    void getFirstNameTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getFirstName", cArg);
            assertEquals("BOB", (String) method.invoke(null, "BOB SMITH"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    // getLastName() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("getLastName: Returns last name from a two-name string")
    void getLastNameTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getLastName", cArg);
            assertEquals("Doe", (String) method.invoke(null, "John Doe"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getLastName: Returns last name from a three-name string")
    void getLastNameTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getLastName", cArg);
            assertEquals("Watson", (String) method.invoke(null, "Mary Jane Watson"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getLastName: Returns last name when name has trailing spaces")
    void getLastNameTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getLastName", cArg);
            assertEquals("Smith", (String) method.invoke(null, "Alice Smith  "));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("getLastName: Returns last name with different casing intact")
    void getLastNameTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("getLastName", cArg);
            assertEquals("SMITH", (String) method.invoke(null, "BOB SMITH"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    // ─────────────────────────────────────────────
    // isValidName() Tests
    // ─────────────────────────────────────────────

    @Test
    @DisplayName("isValidName: Returns true for a valid first and last name")
    void isValidNameTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isValidName", cArg);
            assertEquals(true, (boolean) method.invoke(null, "John Doe"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isValidName: Returns false for a single name only")
    void isValidNameTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isValidName", cArg);
            assertEquals(false, (boolean) method.invoke(null, "John"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isValidName: Returns false when first name is less than 2 characters")
    void isValidNameTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isValidName", cArg);
            assertEquals(false, (boolean) method.invoke(null, "J Doe"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isValidName: Returns false when last name is less than 2 characters")
    void isValidNameTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isValidName", cArg);
            assertEquals(false, (boolean) method.invoke(null, "John D"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isValidName: Returns false for three names (not first and last only)")
    void isValidNameTest5() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isValidName", cArg);
            assertEquals(false, (boolean) method.invoke(null, "Mary Jane Watson"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isValidName: Returns false for an empty string")
    void isValidNameTest6() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isValidName", cArg);
            assertEquals(false, (boolean) method.invoke(null, ""));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }

    @Test
    @DisplayName("isValidName: Returns true for a valid name with exactly 2 characters each")
    void isValidNameTest7() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("isValidName", cArg);
            assertEquals(true, (boolean) method.invoke(null, "Jo Do"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened: " + e);
        }
    }
}
