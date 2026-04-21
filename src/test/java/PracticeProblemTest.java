import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import java.lang.reflect.Method;

class PracticeProblemTest {

   @Test
   @DisplayName("isPalindrome should return true for a simple lowercase palindrome")
   void isPalindromeTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
         assertEquals(true, (boolean) method.invoke(null, "racecar"));
      } catch (NoSuchMethodException e) {
         fail("Method isPalindrome does not exist");
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPalindrome should be case insensitive (e.g., 'Bob')")
   void isPalindromeTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
         assertEquals(true, (boolean) method.invoke(null, "Bob"));
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPalindrome should ignore spaces in phrases")
   void isPalindromeTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
         assertEquals(true, (boolean) method.invoke(null, "never odd or even"));
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPalindrome should return false for non-palindromes")
   void isPalindromeTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
         assertEquals(false, (boolean) method.invoke(null, "hello"));
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPalindrome should return true for complex phrases with mixed casing and spaces")
   void isPalindromeTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
         assertEquals(true, (boolean) method.invoke(null, "Was it a car or a cat I saw"));
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPalindrome should return true for a single character")
   void isPalindromeTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
         assertEquals(true, (boolean) method.invoke(null, "a"));
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }

   @Test
   @DisplayName("isPalindrome should return true for an empty string")
   void isPalindromeTest7() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class<?>[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("isPalindrome", cArg);
         assertEquals(true, (boolean) method.invoke(null, ""));
      } catch (Exception e) {
         fail("Something weird happened: " + e);
      }
   }
}